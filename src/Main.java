import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Programacion II");

        //calculadora();
        //calculadora2();
        //EjemploIf();
        saludo();

    }
    public static void calculadora(){
        int a = 10;
        int b = 5;
        //int resultado;
        //resultado = a + b;

        System.out.println("El resultado de la suma es:"+(a+b));
        System.out.println("El resultado de la resta es:"+(a-b));
        System.out.println("El resultado de la Multiplicacion es:"+(a*b));
        System.out.println("El resultado de la division es:"+(a/b));
    }
    public static void calculadora2(){
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer numero entero: ");
        n1 = sc.nextInt();

        System.out.println("Introduce segundo numero entero: ");
        n2 = sc.nextInt();

        System.out.println("Introduce tercer numero entero: ");
        n3 = sc.nextInt();

        System.out.println("Has ingresado "+n1+","+n2+","+n3+"\nLa suma de los tres numeros es: "+(n1+n2+n3));
    }
    public static void EjemploIf(){
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        n1 = sc.nextInt();
        //System.out.println("Ingresaste el numero: "+n1);

        System.out.println("Introduce Otro numero entero: ");
        n2 = sc.nextInt();
        //System.out.println("Ingresaste el numero: "+n1);

        System.out.println("Has ingresado "+n1+" y "+n2);

        if(n1>=n2){
            if(n1==n2){
                System.out.println("Los numeros "+n1+" y "+n2+" Son Iguales");
            }
            else {
                System.out.println("El numero " + n1 + " Es mayor que " + n2);
            }
        }
        else {
            System.out.println("El numero "+n2+" Es Mayor que "+n1);
        }
    }
    public static void saludo(){
        String nombre = "Greg Banegas";

        System.out.println("Bienvenido!! "+nombre);
    }
}