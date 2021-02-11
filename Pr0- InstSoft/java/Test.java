public class Test {
    public static void main(String[] args) {
        System.out.println("constante: " + Prueba.CONSTANTE);
        int DNI = 26760425;
        String valor = Prueba.funcion(DNI);
        System.out.println("funcion(" + DNI + "): " + valor);
    }
}