package com.tnsif.constructorprogram;

public class Customer {

	private String Customername;
	private String customeradress;
	private int customerid;
	//DEFAULT CONSTRUCTOR
	public Customer() {
		
	}
    //PARAMETER CONSTRUCTOR
	public Customer(String customername, String customeradress, int customerid) {
	
		Customername = customername;
		this.customeradress = customeradress;
		this.customerid = customerid;
	}
	//GETTER AND SETTER
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getCustomeradress() {
		return customeradress;
	}
	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", customeradress=" + customeradress + ", customerid="
				+ customerid + "]";
	}
	
}
