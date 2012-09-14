
package com.properties.patterns.decorators;

/**
 * This is an object you want to be decorated
 * @author Josh Wretlind
 */
public class ObjectToBeDecorated implements OveralDecoratedInterface{

    public ObjectToBeDecorated(){
    
    }
    
    public void performAction(){
        //Perform some basic action that needs to be decorated, such as rendering
    }
}
