package com.coding;

import java.util.Set;
import java.util.TreeSet;

class Emp{
	private int empId;
	private String empName;
	private int empSal;
	
	public Emp(int Id,String Name,int Sal){
		this.empId=Id;
		this.empName=Name;
		this.empSal=Sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	public String toString(){
		return empId+":"+empName+":"+empSal;
	}
	
	
	
}

public class Duplicateusertree {
	public static void main(String args[]){
		
		Set<Emp> em = new TreeSet<Emp>(new DupliCom());
		em.add(new Emp(21,"Rini",765));
		em.add(new Emp(22,"Avi",876));
		em.add(new Emp(23,"shash",678));
		em.add(new Emp(21,"Rini",765));
		for(Emp e :em){
			System.out.println(e);
		}
		
		
		
		
		
	}
	
		

}
