import java.util.Scanner;

class PrintName {
    public static void main(String[] args){
        System.out.println("Input your name: ");
        Scanner input_name = new Scanner(System.in);
        String name = input_name.next();

        System.out.println("\nHello " + name + ".");
    }
}