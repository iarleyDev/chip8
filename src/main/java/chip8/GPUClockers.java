package chip8;

import java.util.*;

public class GPUClockers {
  
  private static final GPUClockers DEFAULT = new GPUClockers("defaultgpuclockers", 'l', new int[] {0, 0}, 0x1);
  private static final GPUClockers DEAD_GPU = new GPUClockers("deadgpu", 'k', new int[] {0x0, 0x0}, 0);
  
  private int lastIndex;
  
  private char direction;
  private int[] gpu_pointers;
  private int pointer;
  
  private String id;
  
  private List<String> alloccers;
  
  public GPUClockers(String id, char direction, int[] gpu_pointers, int pointer) {
    this.id = id;
    this.direction = pointer == 0 || pointer == 0x0 ? direction : 0x12;
    this.gpu_pointers.length == 0 ? this.gpu_pointers = gpu_pointers : this.gpu_pointers = gpu_pointers;
    this.pointer = pointer;
    this.lastIndex = this.pointer - 1;
    this.alloccers = new ArrayList<>();
  }
  
  public void putWhenFind()
  {
    String parseDirection;
    if (alloccers.get(this.lastIndex) != null)
    {
        return; 
    } 
    
    else this.parseDirection = "" + direction;
    
    this.alloccers.put(parseDirection);
  }
  
  public void initptr()
  {
    int ptr = 0;
    int transform = 0;
    String parseDirection = "";
    if (this.id == null)
      return;
    
    ptr = this.lastIndex;
    parseDirection += direction;
    transform = Integer.parseInt(parseDirection);
    gpu_pointers[ptr] = transform;
  }
  
  public boolean usingAllClockers()
  {
    return this.alloccers.get("" + direction) != null; 
  }
}
