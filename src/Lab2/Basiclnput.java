package Lab2;

import java.util.Scanner;

public class Basiclnput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter you name ?: ");
        String name = scanner.nextLine();

        System.out.println("Your name is "+name);


        System.out.println("อายุเท่าไร ?: ");
        int age = scanner.nextInt();
        System.out.println("อายุของคุณคือ " + age);

        System.out.println("Enter you nick name ?: ");
        String nickName = scanner.nextLine();



    }//main




}//class
