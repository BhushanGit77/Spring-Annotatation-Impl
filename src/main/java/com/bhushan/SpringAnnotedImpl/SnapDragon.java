package com.bhushan.SpringAnnotedImpl;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements Processor {

	public void process() {
		System.out.println("This is the best processor in the world");
	}

}
