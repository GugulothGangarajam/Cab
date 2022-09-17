package com.balu.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CabCustomer {
	
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int custid;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	@Id
	private long phone;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long i) {
		this.phone = i;
	}
	/**
	 * @param custid
	 * @param customerName
	 * @param pickupLocation
	 * @param dropLocation
	 * @param distance
	 * @param phone
	 */
	public CabCustomer(int custid, String customerName, String pickupLocation, String dropLocation, int distance,
			long phone) {
		this.custid = custid;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	public CabCustomer() {
		super();
	}
		
	
}
