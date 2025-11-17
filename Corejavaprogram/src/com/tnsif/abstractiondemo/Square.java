package com.tnsif.abstractiondemo;

public class Square extends Shape {

	private float side;
	public Square() {//default constructor
	   side=2.0f;	
	}
	public Square(float side) {//parameterised constructor
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
		//means it will go to parent class
	}
	public static void main(String[] args) {
		Square s=new Square();//constructor calls 1st constructor
		s.calarea();
		s.show();
	}

}
