package programme;

import java.util.Scanner;

public class TaskTwelve {
    public static void main (String[]args){
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        myNumber = scanner.nextInt();
        boolean isPrimeNumber =false;
        for (int i= 2; i<=myNumber;++i){
            if(myNumber%i==0);
            isPrimeNumber=true;
            break;
        }
    }
}
