package com.tnsif.staticprogram;

public class Student {
     int rollno;
     String name;
     static String college="Reva";
     
     //static method change vaalue
     
     static void change() {
    	 college="vkit";
     }
     Student(int r,String n){
    	 rollno=r;
    	 name=n;
     }
     void display() {
    	 System.out.println(rollno+" "+name+" "+college);
     }
     public static void main(String[] args) {
    	 Student.change();
    	 Student s=new Student(1,"paddu");
    	 Student s1=new Student(2,"paddu");
    	 Student s2=new Student(3,"paddu");
    	 s.display();
    	 s1.display();
    	 s2.display();
	}
}
