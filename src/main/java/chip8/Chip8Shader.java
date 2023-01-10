package chip8;

public class Chip8Shader {
 
  private int newIndex, index, attribute, version, level, store, max, box, circle;
  private char oneByte = '.';
  private byte[] appliers = new byte[20];
  private char[] bytes = new char[2];
  private String defaultsrc = "#core" + version
                            + "createArray(appliers)->put(" + index + ", " + attribute + ", " + bytes + ");"
                            + "storeLevel(level)->add(" + level + ");"
                            + "int index = 0;"
                            + "main() {"
                            + "  appliers[index++] = float3(" + max + ", " + box + ", " + circle ");" 
                            + "}";
  private String src;
  
 public Chip8Shader(String filename, int attribute)
 {
    this.src = "#core" + version;
    level = -appliers[attribute * 2];
    if (attribute == 0 || attribute == level) return;
    File file = new File(filename);
    boolean get = file.exists();
    if (!get)
    {
      Chip8Shader shader = new Chip8Shader("shader.tgl", 1);
      shader.src = defaultsrc; 
      Chip8.shader = shader; 
    }
 }
}
