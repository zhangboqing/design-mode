package com.zbq.state;

/**
 * ConcreteState
 * 具体状态类
 */
public class StartState implements State {
 
   @Override
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this); 
   }
 
   @Override
   public String toString(){
      return "Start State";
   }
}