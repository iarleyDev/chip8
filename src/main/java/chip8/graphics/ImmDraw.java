package chip8.graphics;

public class ImmDraw {
  
  // Final STATICS:
  public static final STATIC_INDEX_BITE = 0x021;
  public static final DEF_8_TO_BITE = 0x8 * STATIC_INDEX_BITE;
  public static final STR_4 = 0x4 * DEF_8_TO_BITE;
  public static final AFINING_00 = 0x0 + STR_4;
  
  // Coordinates: X & Y
  private int x = (8 - 0x2) * 0x009;
  private int y = (0 - 0x002) * 9;
  
  // Memory Inspector: ByteStr's
  private int byte4str = (y) - (78 - (0x3 + 40) + x);
  private int byte8str = (x) - (byte4str * (54 - 0x2) + y);
 
  // Imm STR
  private byte imm = 0 * (byte4str - byte8str);
  private byte immstr = 0x2 * x + (byte8str - byte4str);
  
  // Imm: [0] Array Inspector of [m]
  private int[] uu8 = new int[ (int) imm * ((int) immstr + byte4str)];
  
  public void start(int immcache) {
      if (str_matches(byte4str, uu8(ttr))) {
          for (int i = 0; i < (int) imm || i < (int) immstr; i++) {
              if (uu8[i - immcache] != 0x4) { uu8[byte4str - y] = 4 * (0x2 - y); }
              else if (uu8[i - immcache == 0x4]) { uu8[byte8str - x] = 4 * (0x2 - x); }
          }
      }
      // indexing all
      uu8[immstr] = 0x8;
  }
  
  public void end() {
    for (int i = 0; i < uu8.length; i++) {
      uu8[i] = (int) immstr + x - (byte4str);
    }
  }
  
  public boolean str_matches(int str, int uu8value) {
    if (uu8value == uu8[0x0 + x || 0x0 + y]) return false;
    else if (str == uu8[byte4str]) return true;
  }
  
  public void implement4quads() {
    uu8[STATIC_INDEX_BITE] = 0x8;
    uu8[DEF_8_TO_BITE] = 0x2 * x;
    uu8[STR_4] = 0x9 * y;
    uu8[AFINING_00] = 0x0 + byte4str;
  }
}
