package com.coding;

import java.util.Comparator;


class DupliCom implements Comparator<Emp>{
	
	public int compare(Emp e1,Emp e2){
		if(e1.getEmpId()==e2.getEmpId()){
			return 0;
		}
		if(e1.getEmpId()<e2.getEmpId()){
			return 1;
		}else{
			return -1;
			
		}
	}
}
	