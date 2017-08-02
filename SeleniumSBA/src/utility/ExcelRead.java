package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	@SuppressWarnings("resource")
	public String[][] ReadExcel(int i, int j) throws IOException{
		String data[][];
		File myFile=new File("D:\\Selenium\\datasheet.xlsx");
		FileInputStream fi=new FileInputStream(myFile);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		int lastRowNum=wb.getSheetAt(0).getLastRowNum();
		int lastColNum=wb.getSheetAt(0).getRow(0).getLastCellNum();
		data= new String[lastRowNum+1][lastColNum];
		for (i=1;i<=lastRowNum;i++)
		{
			for(j=0;j<lastColNum;j++)
			{
				data[i][j]=wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
				//System.out.println(data);
			}
		}
		return data;

	}
}
