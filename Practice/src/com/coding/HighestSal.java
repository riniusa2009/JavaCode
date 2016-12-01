package com.coding;

import java.util.Set;
import java.util.TreeSet;
class Emp1{
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSal() {
		return empSal;
	}


	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}


	private String empName;
	private int empSal;
	
	public Emp1(String Name,int Sal){
		this.empName=Name;
		this.empSal=Sal;
	}
	public String toString(){
		return empName+":"+empSal;
	}
	

}
public class HighestSal {

	public static void main(String[] args) {
		Set<Emp1> em = new TreeSet<Emp1>(new HigestSalCom());
		em.add(new Emp1("Rini",7650));
		em.add(new Emp1("Avi",8762));
		em.add(new Emp1("shash",6783));
		em.add(new Emp1("Priya",7654));
		System.out.println("Highest Slary is :" +((TreeSet<Emp1>) em).last());
		
		
	}

}
