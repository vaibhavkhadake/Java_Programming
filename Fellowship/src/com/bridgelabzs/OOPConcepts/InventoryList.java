package com.bridgelabzs.OOPConcepts;

import java.util.ArrayList;
import java.util.List;

public class InventoryList <T>
{
	private String inventoryName;
	private List inventoryDetails=new ArrayList();
	
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	public List getInventoryDetails() {
		return inventoryDetails;
	}
	public void setInventoryDetails(List inventoryDetails) {
		this.inventoryDetails = inventoryDetails;
	}

}
