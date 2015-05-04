/**
 * 
 */
package jdbc;

import java.io.Serializable;

/**
 * gwt数据库中的单元，包含名字，值，数据类型
 * @author zgw
 *2009-11-22 上午11:32:41
 * javazgw@gmail.com
 */
public class Cell implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7796088839652470203L;
	public static String zzzz="dddd";
	String cellname;
	int celltype;
	String value;
	/**
	 * 空的构造函数，序列化的要求
	 */
	public Cell()
	{
		
	}
	/**
	 * @return the cellname
	 */
	public String getCellname() {
		
		return cellname;
	}
	/**
	 * @param cellname the cellname to set
	 */
	public void setCellname(String cellname) {
		this.cellname = cellname;
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
/*	public Date getDate()
	{
		return (Date)value;
	}*/
	public int getCelltype() {
		return celltype;
	}
	public void setCelltype(int celltype) {
		this.celltype = celltype;
	}

	
}
