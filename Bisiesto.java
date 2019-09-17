public class main {

    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);

        int a;

        System.out.println("Ingresa el año para saber si es bisiesto o no");
        
        a= sc.nextInt();

        if (a % 4 == 0 && a % 100 !=0 || a % 400 == 0){
            System.out.println(" El año que ingresaste "+a+" Si es bisiesto");
        }
        else {
            System.out.println("El año que ingresaste "+a+" No es bisiesto");
        }
    }
}