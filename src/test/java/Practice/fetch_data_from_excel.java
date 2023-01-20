package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fetch_data_from_excel 
{
public static void main(String[] args) 
{
int [] arr= {1,2,44,643,7,37,657};
for(int i=0;i<arr.length-1;i++)
{
	//System.out.println("i");
	for(int j=0;j<arr.length-1;j++)
	{
		//System.out.println("j");
		if(arr[j]>arr[j+1])
		{
			//System.out.println("if");
			int temp=arr[j];
			arr[j]=arr[j+1];
			//arr[j+1]=arr[j];
			arr[j+1]=temp;
			
		}
	}

}
System.out.println(Arrays.toString(arr));
}

}
