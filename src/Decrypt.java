import java.net.UnknownHostException;
import java.util.Scanner;

import static java.lang.System.out;

public class Decrypt {
    Decrypt(String user){

        Scanner scn=new Scanner(System.in);
        boolean isStart=true;
        while(isStart) {
            out.println(user+">");
            String commandDec=scn.nextLine();
            switch (commandDec){
                case "/stop":
                    isStart=false;
                    break;
                case "/menu":
                    new Console();
                    break;
            }
        }
    }
}