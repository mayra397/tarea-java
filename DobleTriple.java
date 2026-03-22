
  public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num = teclado.nextInt();

        System.out.println("Elija una opción:");
        System.out.println("1. Calcular doble");
        System.out.println("2. Calcular triple");
        int op = teclado.nextInt();

        // Llamada a la función
        int resultado = calcular(num, op);

        // Mostrar resultado
        System.out.println("El resultado es: " + resultado);
    }
}
