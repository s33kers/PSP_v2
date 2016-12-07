package us.martink.UI.ConsoleUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.Command.CommandAbstraction.Command;
import us.martink.UI.UIAbstraction.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tadas.
 */
public class ConsoleController extends Controller {

    @Override
    public void showMenu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = -1;
        while (i != 0) {
            System.out.println("Select from menu:");
            System.out.println("0. Exit.");
            for (int j = 0; j < getCommands().size(); j++) {
                Command command = getCommands().get(j);
                System.out.println(j + 1 + ". " + command.getName());
            }


            try {
                i = Integer.parseInt(br.readLine());
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i == 0) {
                break;
            } else if (i > 0 && i < getCommands().size()) {
                getProcessor().processCommand(getCommands().get(i - 1));
            }
        }
    }
}
