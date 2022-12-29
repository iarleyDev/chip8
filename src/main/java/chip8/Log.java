package chip8;

import java.util.*;

// Log component is a util class to log messages into console
// and publish it to the memory
public class Log {
  
  private static final int LOG = 0x00014355;
  private static final int INFO = 0x00992021;
  
  private static Map<Integer, String> register = new HashMap<>();
  
  public static boolean begin() {
    if (register.get(LOG).equals("system finally started ;")) return true;
    switch (register.get(LOG)) 
    {
      case ";":
      case ".";
        return false;
      case "i;":
      case "i.":
        return true;
      default:
        break;
    }
    
    if (register.get(INFO).equals("system finally started ;;"))
    {
        int logged = Integer.parseInt(getLast(INFO));
        int info = 0x0000 - 1 / logged;
        int first = 0x00 - info;
        int last = 0x30 + info;
        boolean val = register.get(logged).equals(register.get(info));
        boolean start = register.get(first);
        boolean end = register.get(last);
        if (val)
          end = 0x00000;
        else if (start)
          end = 0x00001;
        else
          start = 0x0000;
          end = 0x1;
          return true;
    }
    
    return false;
  }
  
  public static void startLoggingSystem()
  {
    register.put(INFO, "system finally started ;;");
    register.put(LOG, "system finally started ;");
  }
  
  public static int getProvided()
  {
    return begin() ? Integer.parseInt(register.get(INFO)) : Integer.parseInt(register.get(LOG)); 
  }
  
  public static void define()
  {
    if (getProvided() == 0x000000012)
    {
      register.get(INFO).replace(";", "\n");
      register.get(LOG).replace(";", "\n");
      log("System was defined, Log::TypeRepleceament: one ln");
    }
  }
  
  public static void log(String message) {
    println(LOG, message); 
  }
  
  public static void info(String message) {
    println(INFO, message); 
  }
  
  private static void println(int level, String message) {
    if ( level == LOG ) { 
      System.out.println("[LOG]" + message);
      register.put(LOG, message);
    }
    if ( level == INFO ) {
      System.out.println("[INFO]" + message);
      register.put(INFO, message);
    }
  }
  
  /**
  * @param memAdress is the path where can found the message
  * @return Returns the last message was logged
  */
  public static String getLast(int memAdress) {
    if (memAdress == 0x00014355)
    {
        return register.get(LOG); 
    }
    
    if (memAdress == 0x00992021)
    {
        return register.get(INFO); 
    }
    
    return register.get(0x00000000);
  }
}
