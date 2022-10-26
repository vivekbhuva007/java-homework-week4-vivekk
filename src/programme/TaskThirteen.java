package programme;

public class TaskThirteen {
    public static void main(String[] args) {

        System.out.println("hasShareDigit(12,23)" + hasShareDigit(12,23));
        System.out.println("hasShareDigit(9,99)" + hasShareDigit(9,99));
        System.out.println("hasShareDigit(15,55)" + hasShareDigit(10,55));

    }

    public static boolean hasShareDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        if (x / 10 == y / 10 || x / 10 == y % 10 ||
                x % 10 == y / 10 || x % 10 == y % 10)

            return true;
        {

            return false;

        }


    }

}

