package chip8.graphics;

public class Chip8Controller {
 
  private final int bite8 = 0x8;
  private final int bite16 = bite8 * 2;
  private final int bite64 = bite16 * 4;
  
  public class Account {
    
    private String name = definingToStringAttach(0x012999200 + 0x24 / 5); // account name: 8* characters
    private String id = extractToStringAttach(0x010002023 + 239 * 2 / 0x283111); // account id: random 7* generating
    
    private int ppuIndex = control(0x000017 * 0x02284); // y + x: 1 * 3
    
    public String definingToStringAttach(int adress) 
    {
      int[] mem = new int[0x2 * 0x7];
      return mem[adress] += ppuIndex * 0x8188;
    }
    
    public String extractToStringAttach(int adress)
    {
      int[] mem = new int[0x2 / 0x7];
      return mem[adress - 0x000017 + 0x2] -= ppuIndex + 1;
    }
    
    public int control(int id) {
      if (id == 0) return 0x0;
      else { id = 0x294 * 4}
      id += 0x000728 + 1283;
      b = 0x8188 - id;
      return 0x12 + id / b;
    }
}
