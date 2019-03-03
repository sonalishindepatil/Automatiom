package files.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream ("D:\\UserLogin.xls");
		
		HSSFWorkbook wb =new HSSFWorkbook(file);
		
		/*HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row= sheet.getRow(0);
		HSSFCell cell=row.getCell(0);
		String cellval=cell.getStringCellValue();
		System.out.println(cellval);*/
		
		String cellval=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellval);
		int Lrow = wb.getSheetAt(0).getLastRowNum();
		int Lcol = wb.getSheetAt(0).getRow(0).getLastCellNum();
		
		System.out.println("Rows="+Lrow+" Columns"+Lcol);
		
		for(int r=1;r<=Lrow;r++)
		{
			for(int c=0;c<Lcol;c++)
			{
				System.out.print(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
	}

}
