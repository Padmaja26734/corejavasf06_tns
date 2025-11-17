package com.tnsif.abstractiondemo;

public class Rameshdemo extends Mahindrademo {

	@Override
	public void AIIntegration() {
		// TODO Auto-generated method stub
	    System.out.println("welcome");	
	}

	@Override
	public void Satellitecomm() {
		// TODO Auto-generated method stub
		System.out.println("goodmorning");
	}

	@Override
	public void HealthMonitoring() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
    public static void main(String[] args) {
		Rameshdemo r=new Rameshdemo();
		r.AIIntegration();
		r.HealthMonitoring();
		r.Satellitecomm();
	}
}
