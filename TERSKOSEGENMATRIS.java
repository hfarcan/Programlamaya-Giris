package matriskosegen;

import java.util.Scanner;

public class kosegen {
	
public static void main(String[] args) {
	
	int a;   //boyut icin girilen degisken
	System.out.println("Lutfen Matrisin boyutunu girin: ");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	for(int i=a; i>0; i--) { 
		for(int j=1; j<=a; j++)
		{
	                 if(j!=i)
	                	 System.out.print("0");
	                 else 
	                	 System.out.print("1");
	    }
		System.out.println("");
	
                           }
                                        }
                    }
