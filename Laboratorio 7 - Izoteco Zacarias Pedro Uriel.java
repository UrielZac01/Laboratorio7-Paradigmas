import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    public LecturaNumeros(Reader r) {
        super(r);
    }

    public int readInt() throws IOException {
        return Integer.parseInt(this.readLine());
    }

    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Integer.parseInt(this.readLine());
    }

    public Integer readInteger() throws IOException {
        return Integer.parseInt(this.readLine());
    }

    public double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return Double.parseDouble(this.readLine());
    }

    public static void main(String[] args) {
        try {
            LecturaNumeros lector = new LecturaNumeros();
            
            System.out.println("Introduzca un numero entero: ");
            int entero1 = lector.readInt();

            System.out.println("Introduzca otro numero entero: ");
            int entero2 = lector.readInt("Introduzca un numero entero: ");

            System.out.println("Introduzca un numero Integer: ");
            Integer integer = lector.readInteger();

            System.out.println("Introduzca un numero double: ");
            double double1 = lector.readDouble();

            System.out.println("Introduzca otro numero double: ");
            double double2 = lector.readDouble("Introduzca un numero double: ");

            System.out.println("Numeros introducidos:");
            System.out.println("Entero 1: " + entero1);
            System.out.println("Entero 2: " + entero2);
            System.out.println("Integer: " + integer);
            System.out.println("Double 1: " + double1);
            System.out.println("Double 2: " + double2);

            lector.close();
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}