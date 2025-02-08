import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama :");
        String Nama = scanner.nextLine();
        System.out.println("Masukkan nim :");
        String Nim = scanner.nextLine();
        System.out.println("Masukkan umur :");
        int Umur = scanner.nextInt();
        System.out.println("Nama saya " + Nama + "Nim " + Nim + " Umur " + Umur + " tahun \n Saya seangat senang belajar Objaect Oriented programing java");

        scanner.close();
    }
}
