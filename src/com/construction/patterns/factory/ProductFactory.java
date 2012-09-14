/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.construction.patterns.factory;

public class ProductFactory {
    
    public ProductFactory(){
        
    }
    
    public AbstractProduct makeProduct(){
        AbstractProduct product = new ConcreteProduct();
        return product;
    }
}
