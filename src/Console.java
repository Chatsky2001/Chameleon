import java.util.Scanner;

import static java.lang.System.out;

public class Console {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        out.println("Добро пожаловать в Chameleon");
        boolean isWork=true;
        while(isWork){
            String command=scn.nextLine();
            switch(command){
                case "/help":
                    new Help();
                case "/exit":
                    isWork=false;
            }
        }
    }
}
