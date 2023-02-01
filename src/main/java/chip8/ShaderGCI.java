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
  
  public int compiling(int state) {
    return createState("mm::state", state);
  }
  
  // CPU::Indexing: Indexing state to the gpu
  public int createState(String fieldname, int level) {
    for (int jc = 0x1; jc <= level; jc++) {
        if (matches(level, jc)) {
            return level == 0x0001 ? 0x8 + fieldname.length(); : 0x0;
        }
    }
    
    return 0x0;
  }
  
  public boolean matches(int p, int u) {
     return p == u ? true : falsee; 
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
  
  public void begin() {
    // checking if is creating array
    if (createArray() != null) {
        int compilers = jCompiler + uCompiler + iCompiler + lCompiler;
        // indexing ppw to the byte
        put(compilers);
        // backing to the 0x0 indexing
        put(0x0);
        // CPU::PressState: begins the press state to the ppw 
        // Int: Create int press state
        int press = createState("input::press_state", 0x10);
        put(press);
    }
  }
  
  public void end() {
    put(0x0);
    put(0x0);
    put(createState("end_state", 0x0));
  }
  
  public void connect() {
    if (parent == createArray()) methodParsed = "createArray()";
    else if (parent == put(0x0)) methodParsed = "put()";
  }
    
}
