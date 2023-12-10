package com.baseclass;


public class Christy {
	public void bottleInfo(String Quality) {
        System.out.println("Bottle Quality: "+Quality);
    }
         public void bottleInfo(String Quality,int price) {
         System.out.println("Bottle Quality: "+Quality);
         System.out.println("Bottle Price: "+price);
    }
        public void bottleInfo(String Quality,int price,String color) {
        System.out.println("Bottle Quality: "+Quality);
        System.out.println("Bottle Price: "+price);
        System.out.println("Bottle color: "+color);
    }
 
        public static void main(String[] args) {
        	Christy B=new Christy();
            B.bottleInfo("good",25);
            B.bottleInfo("good",25,"Blue");
           
        }
}
