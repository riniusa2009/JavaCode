package com.coding;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeset {

	public static void main(String[] args) {
		TreeSet<Empl> nameComp= new TreeSet<Empl>(new NewComp());
         nameComp.add(new Empl(1000,"ads"));
         nameComp.add(new Empl(1100,"mads"));
         nameComp.add(new Empl(1200,"dads"));
         nameComp.add(new Empl(1300,"sads"));
         for(Empl e:nameComp){
        	 System.out.println(e);
         }
     }
		
	
	
	}


class NewComp implements Comparator<Empl>{
	public int compare(Empl e1,Empl e2){
		return e1.getName().compareTo(e2.getName());
	}
}


	class Empl{
		int salary;
		
		String name;
		
	public Empl(int sal,String nam){
		this.salary=sal;
		this.name=nam;
	}	
		
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "Name:"+this.name+"&&&Slary :"+this.salary;
	}
			}	
	
	
	
	
	
	
	
	
	
	

