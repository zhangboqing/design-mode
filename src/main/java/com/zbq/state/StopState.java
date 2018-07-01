package com.zbq.state;

/**
 * ConcreteState
 * 具体状态类
 */
public class StopState implements State {
 
   @Override
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   @Override
   public String toString(){
      return "Stop State";
   }
}