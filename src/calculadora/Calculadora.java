package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean menu = true;
        int op;
        Double a, b;
        while (menu) {
            System.out.println("Ingrese dos numeros");
            a=leer.nextDouble();
            
            b=leer.nextDouble();
            Operaciones o=new Operaciones(a,b);
            menu();
            op = leer.nextInt();
//            leer.nextLine();
            switch (op) {
                case 1:
                    System.out.println(a+ "+" +b+ "=" + o.suma());
                   
                    break;
                case 2:
                    System.out.println(a+ "-" +b+ "=" + o.resta());
                    break;
                case 3:
                    System.out.println(a+ "*" +b+ "=" + o.multiplicacion());
                    break;
                case 4:
                    try{
                    System.out.println(a+ "/" +b+ "=" +o.division());
                    }catch(Error e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            

        }
        
    }

    public static void menu() {
        System.out.println("Elija una opción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
//        System.out.println("5. Salir");
    }
}
    
