package com.venkatyarlagadda.learning.com.applyinginterfaces;

public interface IntStack {
	void push(int item); // store the item
	int pop();	// retreive an item
	
	// Because clear() has a default, it need not be
	// implemented by a preexisting class that uses Intsteam.
	default void clear(){
		System.out.println("Clear() not implemented");
	}
}
