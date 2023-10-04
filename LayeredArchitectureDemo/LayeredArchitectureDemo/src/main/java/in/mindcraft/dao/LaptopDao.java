package in.mindcraft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.mindcraft.pojos.Laptop;
import in.mindcraft.utils.DBUtils;

public class LaptopDao {
  private Connection cn;
  private PreparedStatement pst1;
  
  
	public void addLaptop(Laptop laptop) throws SQLException, ClassNotFoundException 
	{
		
		cn=DBUtils.openConnection();
		pst1=cn.prepareStatement("insert into laptop1 values (?,?,?)");
		pst1.setInt(1, laptop.getLid());
		pst1.setString(2, laptop.getMake());
		pst1.setDouble(3, laptop.getCost());
		pst1.execute();
		//cn.commit();
		DBUtils.closerConnection();
	}

}
