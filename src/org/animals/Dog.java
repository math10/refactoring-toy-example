package org.animals;


public class Dog {

	private int age = 0;
	public int magicNumber = 17;

	public int getAge() {
		boolean flag;
		if(this.age%2 == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return this.age;
	}

	public void takeABreath() {
		System.out.println("...");
	}

}
