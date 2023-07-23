import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enter = "";
        do {
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Address: ");
            String address = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Do you want to continue? Y/N");
            enter= scanner.nextLine();

        }while ( enter=="Y" );

        while (true){
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Address: ");
            String address = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Do you want to continue? Y/N");
            enter= scanner.nextLine();
            if (enter == "N"){
                break;
            }
        }
    }
}
