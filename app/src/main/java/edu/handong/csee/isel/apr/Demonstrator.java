/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.handong.csee.isel.apr;

public class Demonstrator {
    public int add(int one, int two) {
        return one * two;
    }

    public static void main(String[] args) {
    	Demonstrator demoRunner = new Demonstrator();
    	
    	demoRunner.add(2, 3);
    }
}
