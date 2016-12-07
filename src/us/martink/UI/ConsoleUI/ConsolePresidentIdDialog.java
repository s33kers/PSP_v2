package us.martink.UI.ConsoleUI;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import us.martink.UI.UIAbstraction.PresidentIdDialog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tadas.
 */
public class ConsolePresidentIdDialog implements PresidentIdDialog {

    @Override
    public int show() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter president ID");
        try{
            return Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            return 0;
        } catch (IOException e) {
            return 0;
        }
    }
}
