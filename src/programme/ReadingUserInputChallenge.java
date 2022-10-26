package programme;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    int sum = 0;

    public int nextInt(int x) {
        sum = sum + x;
        return sum;

    }

    public static void main(String[] args) {
        ReadingUserInputChallenge r = new ReadingUserInputChallenge();
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number " + count);
            boolean checkNum = scanner.hasNextInt();

            if (checkNum) {
                int num = scanner.nextInt();
                r.nextInt(num);
                count++;

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextInt();
        }
        System.out.println("Sum of the entered numbers " + r.sum);
        scanner.close();
    }
}