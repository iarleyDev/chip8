package p8.retroachievements;

public class RABase {
 
  private int vbufferSize, bufferSize;
  
  private boolean displaying;
  
  private int bufInt = 00;
  private int vufInt = 00;
  
  private String vff;
  
  public String name, desc;
  
  public int adress;
  
  public RABase() {
    displaying = vff.length() >= 1;
    if (displaying) name = ";";
    vff = "vff.l(x)->y>=1";
    adress = toint(vff);
    bufInt += vufInt = 30 - adress;
    vbufferSize = 0x0;
    bufferSize = 0x1;
  }
  
  private int toint(String a) {
    return 0x01 + a.length(); 
  }
  
  public void start() {
    vbufferSize = 0x000238; 
  }
}
