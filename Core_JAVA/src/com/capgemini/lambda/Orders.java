package com.capgemini.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Orders {
	float orderPrice;
	
	  
	public Orders(float orderPrice) 
	{
		super();
		this.orderPrice = orderPrice;
	}
	
	
	public static void main(String[] args) 
	{
	 
        List<Orders> list=new ArrayList<Orders>();  
        list.add(new Orders(17000f));  
        list.add(new Orders(65000f));  
        list.add(new Orders(25000f));  
        list.add(new Orders(15000f));  
        list.add(new Orders(6000f));  
        list.add(new Orders(1000f)); 
        
        Stream<Orders> filtered_data = list.stream().filter(p -> p.orderPrice > 10000);
        filtered_data1 filter= ()->System.out.println("Accepted or rejected");
        
        filter.foo();
        
        filtered_data.forEach(  
                Orders -> System.out.println(Orders.orderPrice) 
        );  
	}
	interface filtered_data1
    {
    	void foo();
    }
}
