package com.datasturct.mixing;

public class Random {

	public final static int[] mixArray(int arr[]){
		for(int i=0;i<arr.length;i++){
		arr[i]=(int)(Math.random()*arr.length+1);
		}
		return arr;
	}

}
