
package com.construction.patterns.factory;

public interface AbstractProduct {
    
    //General Product methods. You'll probably want an action() or update() type method, so that you can call these from the driver. I'll use the action() method
    abstract public void update();
}
