package matriskosegen;

import java.util.Scanner;

public class kosegen {
	
public static void main(String[] args) {
	
	int a;   //boyut icin girilen degisken
	System.out.println("Lutfen Matrisin boyutunu girin: ");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	for(int i=0; i<a; i++) { 
		for(int j=0; j<a; j++)
		{
	                 if(i==j)
	                	 System.out.print("1");
	                 else 
	                	 System.out.print("0");
	    }
		System.out.println("");
	
                           }
                                        }
                    }
