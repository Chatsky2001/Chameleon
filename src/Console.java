import java.net.UnknownHostException;
import java.util.Scanner;
import java.net.InetAddress;
import static java.lang.System.out;

public class Console {
    public static void main(String args[]) throws UnknownHostException {
        String computername=InetAddress.getLocalHost().getHostName();
        Scanner scn=new Scanner(System.in);
        out.println("Добро пожаловать в Chameleon");
        boolean isWork=true;
        while(isWork){
            out.print(computername+":");
            String command=scn.nextLine();
            switch(command){

                    case "/enc":
                    new Encrypt();
                    break;
                    case "/dec":
                    new Decrypt();
                    break;
                    case "/help":
                    new Help();
                    break;
                    case "/exit":
                    isWork=false;
                    break;
            }
        }
    }
}
