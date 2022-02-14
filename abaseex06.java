package bitcamp0214;

import java.util.Arrays;

public class abaseex06 {
	public static void main(String[] args) {
	int[] array = {3,24,1,55,17,43,5};
	int min;
	
	for(int i=0; i<array.length-1;i++) {
		min=array[i];
		for(int j=i+1; j<array.length;j++) {
			if(min>array[j]){
				min=array[j];
				array[j]=array[i];
				array[i]=min;
			}
		}		
		}
	
		for(int k=0;k<array.length;k++) {
		System.out.print(array[k] + " ");
	}
	//System.out.print(Arrays.toString(array));
	}
}