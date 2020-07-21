import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantas filas quieres tu array");
        int filas = sc.nextInt();
        System.out.println("De cuantas columnas quieres tu array");
        int columnas = sc.nextInt();
        ArrayBidimensionalRelleno nuevoArray= new ArrayBidimensionalRelleno(filas,columnas);

        nuevoArray.rellenar();
        nuevoArray.draw();
    }
}
