package com.coding;

import java.util.Comparator;

public class HigestSalCom implements Comparator<Emp1>{
	public int compare(Emp1 e1,Emp1 e2){
		if(e1.getEmpSal()>e2.getEmpSal()){
			return 1;
		}else{
			return -1;
			
		}
	}

}
