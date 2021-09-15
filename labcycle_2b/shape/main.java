package labcycle_2b.shape;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter choice : ");
            System.out.println("1. area of square : ");
            System.out.println("2. area of triangle : ");
            System.out.println("3. area of circle : ");
            System.out.println("4. exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter side of a square");
                float side = sc.nextFloat();
                square sq = new square(side);

            } else if (ch == 2) {
                System.out.println("Enter breadth and height");
                float b = sc.nextFloat();
                float h = sc.nextFloat();
                triangle tr = new triangle(b,h);

            } else if (ch == 3) {
                System.out.println("Enter radius");
                float r = sc.nextFloat();
                circle cr = new circle(r);

            } else {
                System.out.println("....EXITING....");
                break;
            }
        }

    }
}
