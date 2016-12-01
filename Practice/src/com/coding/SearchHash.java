package com.coding;
import java.util.HashMap;
import java.util.Set;

public class SearchHash {

	public static void main(String[] args) {
		
		HashMap<Price,String> hm = new HashMap<Price,String>();
		hm.put(new Price("Banana",20),"Banana");
		hm.put(new Price("mango",18),"mango");
		hm.put(new Price("grapes",17),"grapes");
		printMap(hm);
		Price key = new Price("mango",18);
		System.out.println("Does this price is available in the price hashmap"+hm.containsKey(key));
		
	}
	public static void printMap(HashMap<Price,String> map){
		Set<Price> Keys=map.keySet();
		for(Price p: Keys){
			System.out.println(map.get(p));
		}

		
	}

}
class Price{
	
	private String item;
	private int price;
	
	public Price(String itm,int pr){
		this.item=itm;
		this.price=pr;
		
	}
	
	public int hashCode(){
		System.out.println("In hashcode");
		 int hashcode=0;
		 hashcode=price*20;
		 hashcode+=item.hashCode();
		 return hashcode;
	}
	
	public boolean equals(Object obj){
		System.out.println("In equals");
		if(obj instanceof Price){
			Price pp =(Price) obj;
			return(pp.item.equals(this.item)&& pp.price==this.price);
		}else{
			return false;
		}
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	}
