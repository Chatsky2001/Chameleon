

import static java.lang.System.out;

public class Error {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
     Error(String command){
        out.println(ANSI_RED+command+"-не является командой"+ANSI_GREEN);

    }
}
