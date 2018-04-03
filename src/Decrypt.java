import java.net.UnknownHostException;
import java.util.Scanner;

import static java.lang.System.out;

public class Decrypt {
    Decrypt(String user){
        out.println("Проснись," + user);
        Scanner scn=new Scanner(System.in);
        boolean isStart=true;
        while(isStart) {
            String commandDec=scn.nextLine();
            switch (commandDec){
                case "/stop":
                    isStart=false;
                    break;
            }
        }
    }
}