package Diziler;
import java.util.Scanner;
public class Diziler {

	public static void main(String[] args) {
		//Array
		//VeriTipi diziadi[]= new VeriTipi[elemanSayisi]
		//VeriTipi[] diziadi= new VeriTipi[elemanSayisi]
		//VeriTipi[] diziAdi={v1,v2,v3}
		
		//int[] liste=new int[4];
		//int[] liste={1,2,3,4};
		
		/*liste[0]=1;
		liste[1]=2;
		liste[2]=3;
		liste[3]=4;
		
		//System.out.println(liste[0]);
		//i<4 = liste.length
		
		for(int i=0;i<liste.length;i++)
		{
			System.out.println("Liste dizisinin " +i+ ". " +"elemanı "+liste[i]);
		}
		
		int[] liste2=new int[4];
		Scanner scan=new Scanner(System.in);
		System.out.println("Dizinin elemanlarını girin : ");
		for(int i=0;i<liste2.length;i++)
		{
			liste2[i]=scan.nextInt();
		}
		
		for(int i=0;i<liste2.length;i++)
		{
			System.out.println(liste2[i]);
		}*/
		
		
		//Çok boyutlu diziler
		//int[] 1Darr=new int[5]
		/*int[][] tablo=new int[][]
				{
			{1,75,10},
			{2,87,13},
			{3,95,15},
			{4,103,17},
			{5,110,9}
				};*/
				
		Scanner scan=new Scanner(System.in);
		int[][] tablo2=new int[3][3];
		System.out.println("5x3 'lük matris girin : ");
		for(int i=0;i<tablo2.length;i++)
		{
			for(int j=0;j<tablo2[0].length;j++)
			{
				tablo2[i][j]=scan.nextInt();
			}
			

		}
		
		for(int i=0;i<tablo2.length;i++)
		{
			for(int j=0;j<tablo2[0].length;j++)
			{
				System.out.print(tablo2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
