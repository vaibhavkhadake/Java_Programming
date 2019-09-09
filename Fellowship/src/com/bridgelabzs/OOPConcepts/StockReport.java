/******************************************************************************
 *  
 *  Purpose: Stock Report
 *  @author  Vaibhav P Khadake
 *  @version 1.0
 *  @since   09/09/2019
 *
 ******************************************************************************/
package com.bridgelabzs.OOPConcepts;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport
{
	private String stockName;
	private int numberOfShares;
	private int sharePrice;
	
	public String getStackName() {
		return stockName;
	}

	public void setStackName(String stackName) {
		this.stockName = stackName;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public static void main(String[] args)
	{
		
		File file=new File("/home/user/Desktop/Vaibhav_VK/Fellowship/JSON/StockReport.json");
		ObjectMapper mapper=new ObjectMapper();
		try
		{
			JsonNode rootNode=mapper.readTree(file);
			JsonNode allnode=rootNode.findPath("Stock");
			
			for(JsonNode stock:allnode)
			{
				String stockName=stock.findPath("stockName").asText();
				int numberOfShares=stock.findPath("numberOfShares").asInt();
				int sharePrice=stock.findPath("sharePrice").asInt();;
				
				System.out.println("Stock Name			:"+stockName);
				System.out.println("Number of shares		:"+numberOfShares);
				System.out.println("Single share price		:"+sharePrice);
				double total_share_price=numberOfShares*sharePrice;
				System.out.println("Total share Price		:"+total_share_price);
				System.out.println();
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
