
package ec.edu.espoch.yasuni.datasource;

import ec.edu.espoch.yasuni.daointerface.InterfaceInterpretiveTours;

public class InterpretiveTours extends Tours implements InterfaceInterpretiveTours {

        
  public float distance(){
     return 1.2f; 
  }
  public float totalTime(){
      return 2.1f;
  }
  public float simulation(){
      return 0.2f;
  }
}

