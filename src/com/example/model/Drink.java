package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Drink {
	private String drinkType = null;
	 private List<String> brand  = new ArrayList();
    public List<String> getBrand(String drinkType){
    	if(drinkType.equals("��֭")){
    		this.brand.add("��֭Դ");
    		this.brand.add("��Դ");
    	}else{
    		this.brand.add("����");
    		this.brand.add("��ţ");
    		}

    	
    	return this.brand;
    	
    }
}
