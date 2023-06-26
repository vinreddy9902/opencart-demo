package utilities;

import java.io.IOException;


import org.testng.annotations.DataProvider;

public class DataProviders {

	
	// DataProvider 1
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\Copy of Opencart_LoginData.xlsx"; // Path of excel file 
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		//created for two dimension array which can store the data user and password
		String logindata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)//1   //read the data from excel storing in two dimensional array 
		{
			for(int j=0;j<totalcols;j++) //0    i is for rows j is for columns
			{
				logindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}  
			
		}
		
		return logindata; // returning two dimensional array.
			
			
	}
	
	
	// DataProvider 2
	
	// DataProvider 3
	
	// DataProvider 4
		
	
}
