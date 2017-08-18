package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Drink {
	private String drinkType = null;
	 private List<String> brand  = new ArrayList();
    public List<String> getBrand(String drinkType){
    	if(drinkType.equals("果汁")){
    		this.brand.add("美汁源");
    		this.brand.add("汇源");
    	}else{
    		this.brand.add("脉动");
    		this.brand.add("红牛");
    		}

    	
    	return this.brand;
    	
    }
}
