
package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Work {

    
    public static void main(String[] args) {
         
        System.out.println("Part-1");
        
        Scanner input = new Scanner(System.in);
        int size=0, lower=0, upper=0, sum=0;
        System.out.println("Enter array size: ");
        size = input.nextInt();
        
        ArrayList <Integer> array = new ArrayList <Integer>();
        ArrayList <Integer> array2 = new ArrayList <Integer>();

        for(int i=0; i<size; i++){
            System.out.println("Enter number "+(i+1)+ ":");
            array.add(input.nextInt());
        }
        System.out.println("Enter lower limit: ");
        lower = input.nextInt();
        
        System.out.println("Enter upper limit: ");
        upper = input.nextInt();
        
        
        for(int i=0; i<array.size(); i++){
            
            if((array.get(i)<=upper)&&(array.get(i)>=lower))
            {
               array2.add(array.get(i));
               sum = sum+array.get(i);
            }
            
        }
        
          System.out.println("Numbers between "+lower+" and "+upper+" are "+ array2);
          System.out.println("Sum: " + sum);
          System.out.println("--------------------------------------------------------");
          
          
          System.out.println("\nPart-2");
          
          System.out.println("Enter matrix size: ");
          int size2 = input.nextInt();
          makeMatrix(size2);
          
        
           System.out.println("--------------------------------------------------------");
        
           System.out.println("\nPart-3");
           System.out.println("Enter number of elements: ");
           int size3 = input.nextInt();
           makeRandomStrList(size3);
           
        
           System.out.println("--------------------------------------------------------");
           
            System.out.println("\nPart-4");
            Scanner input3=new Scanner(System.in);
            System.out.println("Enter number of strings: ");
             ArrayList<String> str = new ArrayList<>();
            int number=input.nextInt();
       
            for(int i=0; i<number; i++){
                System.out.println("Enter String " + (i+1)+":");
                String tut = input3.nextLine();
                str.add(tut);
            }
             for(int i=0; i<str.size(); i++){
                System.out.print(str.get(i)+"->");
            }
            inputStringAL(str, number);
            
          
    }
    
    public static void makeMatrix(int n){
        Random rand = new Random();
         ArrayList <Integer> rowArray = new ArrayList <>();
         ArrayList <Integer> columnArray = new ArrayList <>();


        int sum=0;
        int [][] a = new int [n][n];
        for(int row=0; row<n; row++)
        {
            for(int column=0; column<n; column++)
            {
                a[row][column] = rand.nextInt((999-100)+1)+100;
                System.out.print(a[row][column]+"\t");
                
                  if((column==n/2)&&(n%2!=0))
                  {
                   columnArray.add(a[row][n/2]);

                  }
                   if((column==n/2)&&(n%2==0))
                  {
                   columnArray.add(a[row][n/2-1]);

                  }
                   if((row==n/2)&&(n%2!=0))
                  {
                    rowArray.add(a[n/2][column]);

                  }
                   if((row==n/2)&&(n%2==0))
                  {
                   rowArray.add(a[n/2-1][column]);

                  }

            }
            
            System.out.println(" ");

        }
            for(int sayi:columnArray)
		{
                   sum= sum + sayi;
                }
            for(int sayi:rowArray)
		{
                   sum= sum + sayi;
                }
 
         System.out.println("Column Array: " + columnArray);
         System.out.println("Row Array: " + rowArray);
         System.out.println("Sum is: " + sum);
       
    }
    
        private static ArrayList<String> makeRandomStrList(int n){
          Scanner input2 = new Scanner(System.in);
          System.out.println("Enter an uppercase letter: ");
          String letter = input2.nextLine();
            Random rnd = new Random();
            ArrayList <String> str = new ArrayList <String>();

         String a = "", b = null;
            int sayac=0;

             for(int i=0; i<n; i++){
                for(int j=0; j<2; j++){
                    char c = (char)(65 + rnd.nextInt(26));
                    if(j==0){
                        b=""+c;
                        if(b.equals(letter))
                        {
                            sayac++;
                        }
                    }
                     a+=c;
                }
                str.add(a);
                  a="";

             }
            System.out.println("ArrayList: " + str);
            System.out.println(sayac);
            
        return str;
        }       
        
        
         public static void inputStringAL(ArrayList<String> str, int number){
            Scanner input3 = new Scanner(System.in);
           
             System.out.println("\nEnter string to be inserted: ");
             String newStr=input3.nextLine();
             
             System.out.println("Enter index: ");
             int index=input3.nextInt();
             
              str.add(index,newStr);
              
              for(int i=0; i<str.size(); i++){
                   System.out.print(str.get(i) + "->");

            }
             
        }
    
       
}
