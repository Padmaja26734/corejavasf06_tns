package com.tnsif.encapsulation;
//demo for encapsulation
public class Encapsulation {
    int serialnumber;//declaration
    String name;
    int age;
    
    void show() {//member function
    	System.out.println(serialnumber +" "+name+" "+age);
    }
    public static void main(String[] args) {
		Encapsulation d=new Encapsulation();
	    d.serialnumber=1;
		d.name="paddu";
		d.age=25;
		
		d.show();
	}
}
