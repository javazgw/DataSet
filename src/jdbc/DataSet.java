package jdbc;

import java.io.Serializable;
import java.util.Vector;

public class DataSet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -670895950551932457L;
	protected Vector<Row> v = new Vector<Row>();
//	//和getrowcount 是有区别的，服务器并不会返回所有数据，返回数据的总数更快。
//	//所以totalcout只是告诉客户端总共有怎么多是数据，getrowcount
	//取消 用finddataset
//	int totalcout =0;
	
//	DataSet parentDs=null;//父数据集
//	java.util.LinkedList<DataSet> chileDS = new java.util.LinkedList<DataSet>();
//	String[] parentLinkString = null; //链接父数据集的关联字段
//	String[] chileLinkString = null;//子数据集和父数据集关联字段
/**
 * 空的构造函数，序列化的要求
 */
	
	public DataSet()
	{
		
	}
	public void addRow(Row row)
	{
		v.add(row);
		
	}
	public void removerow(Row row)
	{
		v.remove(row);
	}
	public String getValue(int rownum,String name)
	{
		return v.get(rownum).getValue(name);
	}
	public String  getValue(int rownum,int columnindex)
	{
		return v.get(rownum).getValue(columnindex);
	}
/*	*//**
	 * 获取日期类型的字段值
	 * @param rownum
	 * @param name
	 * @return
	 *//*
	public Date getDate(int rownum,String name)
	{
		return v.get(rownum).getDateValue(name);
	}*/
	/**
	 * 获得字段类型
	 * @param rownum
	 * @param name
	 * @return
	 */
	public int getCellType(int rownum,String name)
	{

		return v.get(rownum).getCellType(name);
	}
	public String toString()
	{
		String str = "";
		for(Row row : v)
		{
			for(Cell cell:row.getVector())
			{
				str +=" name="+cell.getCellname()+" value="+cell.getValue();
			}
			str +="\n";
		}
		return str;
	}
	/**
	 * dataset的行数
	 * @return
	 */
	public int getRowCount()
	{
		return v.size();
	}
	/**
	 * 取得字段数量
	 * @return
	 */
	public int getColumncount()
	{
		return v.get(0).getVector().size();
	}
	
	public Row getRow(int index)
	{
		return v.get(index);
	}
	/**
	 * 设置行，列值
	 * @author zgw 20120802
	 * 
	 * @param row
	 * @param name
	 * @param value
	 * 
	 * 
	 */
	public void setValue(int row,String name,String value)
	{
		if(row>=getRowCount())
		{
			Row r = new Row();
			addRow(r);
			r.PutValue(name, value);
			addRow(r);
		}
		else {
			v.get(row).PutValue(name, value);
		}
	}

    public Vector<Row> getV() {
        return v;
    }

}
