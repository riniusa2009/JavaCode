package com.coding;
import java.util.Arrays;

public class Arraymethod {
	
	private Object[] newStore;
	private int newsize=0;
	
	public Arraymethod(){
		
		newStore= new Object[5];
		
	}
	public Object get(int index){
		if(index<newsize){
			return newStore[index];
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add1(Object obj){
      if(newStore.length-newsize<=5){
       increaseListSize();	
     }
      newStore[newsize++]=obj;
}
	
	
	private void increaseListSize(){
	newStore=Arrays.copyOf(newStore, newStore.length*2);
	System.out.println("new created length :"+ newStore.length );
	}
	public Object remove(int index){
		if(index<newsize){
			Object obj =newStore[index];
			newStore[index]=null;
			int temp = index;
			while(temp<newsize){
				newStore[temp]=newStore[temp+1];
				newStore[temp+1]=null;
				temp++;
			}
			newsize--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
			
		}
	}
	
	public int size(){
		return newsize;
	}
	
	public static void main(String args[]){
		Arraymethod ar = new Arraymethod();
		ar.add1(new Integer(2));
		ar.add1(new Integer(3));
		ar.add1(new Integer(4));
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i)+"");
		}
		System.out.println("Size of array is :"+ ar.size());
		ar.remove(1);
		for(int j =0;j<ar.size();j++){
			System.out.println(ar.get(j)+"");
		}
		
		
	}
	
	
}	
	


