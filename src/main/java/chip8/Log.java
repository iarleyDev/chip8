package chip8;

import java.util.*;

// Log component is a util class to log messages into console
// and publish it to the memory
public class Log {
  
  private static final int LOG = 0x00014355;
  private static final int INFO = 0x00992021;
  
  private static Map<Integer, String> register = new HashMap<>();
  
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
