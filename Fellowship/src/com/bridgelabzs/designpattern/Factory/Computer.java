/******************************************************************************
 *  
 *  Purpose: It is part of Factory Pattern Program here we create abstract method in abstract class 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.designpattern.Factory;

public abstract class Computer
{
	public abstract String getRAM_Storage_Capacity();
	public abstract String getHardDisk_Storage_Capacity();
	public abstract String getCPU_Storage_Capacity();
	
	
	@Override
	public String toString() {
		return "RAM_Storage_Capacity=" + getRAM_Storage_Capacity() + ", HardDisk_Storage_Capacity="
				+ getHardDisk_Storage_Capacity() + ", CPU_Storage_Capacity=" + getCPU_Storage_Capacity();
	}
	
	
}
