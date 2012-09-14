package com.construction.patterns;

/*
 * Implements the basic structure for a Singleton patterned object
 * NOTE: This implimentation is not for use in Threaded contexts.
 * 
 */
public class Singleton {
   private Singleton instance;
   
   private Singleton(){
   }
   
   public Singleton getInstance(){
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
   }
}
