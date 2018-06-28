package com.zbq.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 * 调用者
 */
public class Switch {
   private List<Command> history = new ArrayList<Command>();

   public Switch() {
   }

   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();        
   }
}