
import java.util.Scanner;

public class Main {

    private static String root;

    public static void main(String[] args) {
        System.out.println("Part-1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("Enter a character: ");
        String ch = scanner.nextLine();

        String array[] = new String[string.length()];
        String str = null;

        for (int i = 0; i < string.length(); i++) {
            array[i] = string.substring(i, i + 1);
        }

        for (int i = 1; i < array.length; i += 2) {
            array[i] = ch;
        }

        for (int i = 0; i < array.length; i++) {
            if (str == null) {
                str = array[i];
            } else
                str = str + array[i];
        }
        System.out.println(str);{
            Scanner scan= new Scanner (System.in);
            System.out.println("PART2 ");
            System.out.println("Enter a string: ");
            String s = scan.nextLine();
            char a[] = new char[s.length()];
            int count=0;

            for(int i=0;i<s.length();i++)
            {
                a[i]= s.charAt(i);
                if( ((i>0)&&(a[i]!=' ')&&(a[i-1]==' ')) || ((a[0]!=' ')&&(i==0)) )
                    count++;

            }

            System.out.println(count);
        }
        System.out.println("=========================");
        System.out.println("PART3:");
        System.out.println("Enter a string: ");
        String letter = scanner.nextLine();
        char j[] = new char[4];

        for(int i=0;i<3;i++){
            j[i]=letter.charAt(i);
        }
        j[3]=letter.charAt(letter.length()-1);
        char str1;
        for(int i=0; i<j.length; i++){
            str1=j[i];
            System.out.println(str1);
        }
        System.out.println("PART4:");
        int start=2, bound=4, k=2;
        double x=0 , square =0 , squareVariable=0;
        for(int i=0; i<k; i++){
            x =start+(double)(Math.random()* (bound-start));
            square=Math.pow(x, 1.0/k);
            squareVariable=Math.pow(x, k);
            System.out.println("number: " + x + " square root: "+ square + " square variable: " + squareVariable);

        }










    }

    }

