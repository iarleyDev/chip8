package chip8;

// Shader G Compiler Interpreter (GCI) is a class to recompile and compile all shader applications
public class ShaderGCI {
  
  private int iCompiler, jCompiler, uCompiler, lCompiler;
  
  private byte f_u8 = 0x0027;
  private byte f_u32 = 0x0091;
  
  private int SHADER_MGCI;
  private int SHADER_GKL;
  
  private ShaderGCI parent = new ShaderGCI();
  
  private String methodParsed = "shadermgci::shadergkl";
  
  public ShaderGCI() {
    jCompiler = (int) 0x01 + f_u32;
    uCompiler = 0x07 - f_u32;
    lCompiler = 0x02 + f_u8;
    iCompiler = (int) f_u8 + jCompiler; 
  }
  
  public ShaderGCI createArray() {
    SHADER_MGCI = 0x09 + f_u8 - 0x01;
    SHADER_GKL = 0x01 + f_u32 + 0x09;
    int[] scp = new int[SHADER_MGCI, SHADER_GKL];
    scp[0x0] = f_u8;
      
      // add::[]
    put(scp[0x0]);
    return this;
  }
  
  public ShaderGCI put(byte ppw) {
    f_u8 = ppw;
    f_u32 = f_u8 - 0x08;
    return this;
  }
  
  public void connect() {
    if (parent == createArray()) methodParsed = "createArray()";
    else if (parent == put(0x0)) methodParsed = "put()";
  }
    
}
