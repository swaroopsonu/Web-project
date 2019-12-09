package com.sears.employee.dao_layer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sears.employee.bean.EmployeeBean;
import com.sears.employee.dbconnection.DBConnection;

public class EmployeeDao {
	
	
public boolean setRegisterService(EmployeeBean EmployeeBeanObj){
		
//		PrintWriter pw = response.getWriter();
//		response.setContentType("html/text");
		
		//EmployeeBean EmployeeBeanObj=(EmployeeBean)request.getAttribute("bref");
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			
			ps.setInt(1, Integer.parseInt(EmployeeBeanObj.getEmpId()));
			ps.setString(2, EmployeeBeanObj.getName());
			ps.setInt(3, EmployeeBeanObj.getAge());
		    ps.setInt(4, EmployeeBeanObj.getSalary());
			ps.setString(5,EmployeeBeanObj.isFTE());
			ps.setString(6,EmployeeBeanObj.getGender());
			
			if(ps.executeUpdate()!=0)
			{
				// todo: commit?
				return true;
			}
			else{
				  return false;
			}
			
		}//end of try
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

}
