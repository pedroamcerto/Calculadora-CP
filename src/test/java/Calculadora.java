public class Calculadora {

    public int soma(int a, int b) {
        return a+b;
    }

    public int soma(int[] precos){
        int resultado = 0;
        for (int i = 0; i < precos.length; i++){
            resultado += precos[i];
        }
        return resultado;
    }

    public int subtracao(int a, int b) {
        return a-b;
    }

    public int subtracao(int[] precos){
        int resultado = 0;
        for (int i = 0; i < precos.length; i++){
            resultado -= precos[i];
        }
        return resultado;
    }

}
