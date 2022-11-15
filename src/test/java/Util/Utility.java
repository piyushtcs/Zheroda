package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Testclasses.TC1;

public class Utility  {
public static String getTD(int rowindex, int colindex) throws Throwable {
	FileInputStream Fis=new FileInputStream("C:\\Users\\admin\\Desktop\\TestNG\\Actitime.xlsx");
	Sheet sh=WorkbookFactory.create(Fis).getSheet("Sheet1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
}
}
