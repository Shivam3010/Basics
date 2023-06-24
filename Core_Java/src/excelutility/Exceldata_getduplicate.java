package excelutility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata_getduplicate {


	public static String getdata(String path, int sheetno, int colmno, int rowno)
	{
		String value="";
		try
		{
			FileInputStream inp=new FileInputStream(path);
XSSFWorkbook exl=new XSSFWorkbook(inp);
			XSSFSheet sheet = exl.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colmno).getStringCellValue();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Shivam\\eclipse-workspace\\Core_Java\\src\\Testdata\\Age data.xlsx";
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<=15;i++)
		{
		 ar.add(getdata(path, 0, 1, i));
		}
		Set<String>s=new HashSet<>();
		for(String data:ar)
		{
			if(s.add(data)==false)
			System.out.println(data);
		}
	}
		
	}

