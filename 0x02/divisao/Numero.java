package divisao;

public class Numero {
    public static void dividir(int a, int b){
        int resultado = 0;
        try {
            if(b == 0) {
                throw new Exception("Nao eh possivel dividir por zero");
            }
            resultado = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("%d / %d = %d", a, b, resultado);
        }
    }
}
