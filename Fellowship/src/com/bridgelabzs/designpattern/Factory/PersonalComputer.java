/******************************************************************************
 *  
 *  Purpose: It is part of Factory Pattern Program here we create Personal Computer class. 
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabzs.designpattern.Factory;

public class PersonalComputer  extends Computer
{
	private String ram;
	private String hardDisk;
	private String cpu;

	public PersonalComputer(String ram, String hardDisk, String cpu) 
	{
		this.ram = ram;
		this.hardDisk = hardDisk;
		this.cpu = cpu;
	}

	@Override
	public String getRAM_Storage_Capacity()
	{
		
		return this.ram;
	}

	@Override
	public String getHardDisk_Storage_Capacity() {
		
		return this.hardDisk;
	}

	@Override
	public String getCPU_Storage_Capacity() {
		
		return this.cpu;
	}

}
