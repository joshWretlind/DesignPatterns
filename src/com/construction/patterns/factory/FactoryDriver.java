package com.construction.patterns.factory;

/**
 * Insert your comments here
 * @author Josh Wretlind
 */
public class FactoryDriver {

    public FactoryDriver(){
        ProductFactory pf = new ProductFactory();
        (pf.makeProduct()).update(); //Does whatever you need.
    }
}
