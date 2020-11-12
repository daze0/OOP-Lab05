package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private static final int POPULATION_MAX_RANGE = 20;
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final Set<String> coll = new TreeSet<>();	//1
    	
    	for(int i = 1; i <= POPULATION_MAX_RANGE; i++) {	//2
    		coll.add(Integer.toString(i));
    	}
    	
    	System.out.println(coll.toString());	//3
    	
    	/*
    	 * for(String elem : coll) {	
    		  if(Integer.valueOf(elem) % 3 == 0) {		YOU CAN'T REMOVE AN ELEMENT WHILE ITERATING A COLLECTION WITH AN ITERATOR, because everything gets fucked up :)
    			  coll.remove(elem);
    		  }
    	   }
    	*/
    	
    	final Iterator<String> iter = coll.iterator();
    	for(int i = 0; i < coll.size(); i++) {	//4
    		if(Integer.parseInt(iter.next()) % 3 == 0) {			//USE THE Iterator.remove() METHOD INSTEAD
    			iter.remove();
    		}
    	}
    	
    	for(String elem : coll) {	//5
    		System.out.print(elem + " ");
    	}
    	
    	final Set<String> even = new TreeSet<>();	//6
    	for(String elem : coll) {
    		if(Integer.parseInt(elem) % 2 == 0) {
    			even.add(elem);
    		}
    	}
    	System.out.println("\n" + even.toString());
    	System.out.println(even.containsAll(coll));    	
    }
}
