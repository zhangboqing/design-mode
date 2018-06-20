package com.zbq.prototype;

/**
 *  Prototype Class
 *  原型类
 */
public class Cookie implements Cloneable {
   
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //In an actual implementation of this pattern you would now attach references to
        //the expensive to produce parts from the copies that are held inside the prototype.
        return (Cookie) super.clone();
    }
 }