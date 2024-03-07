
public class Main {
    public static void main(String[] args) {
        System.out.println(soma());
        isFibonacci(10);
        System.out.println(invertString("Leo"));
    }


    static int soma() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return  soma;

    }

    public static void isFibonacci(int num) {
        int a = 0, b = 1, c = 0;

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == num){
            System.out.println("O número pertence a sequência de fibonacci" );
        }else {
            System.out.println("O número não pertence a sequência de fibonacci");
        }
    }

    public static String invertString(String palavra) {
        char[] letras = palavra.toCharArray();
        int start = 0;
        int end = palavra.length() - 1;

        while (start < end) {
            char temp = letras[start];
            letras[start] = letras[end];
            letras[end] = temp;

            start++;
            end--;
        }

        return new String(letras);
    }
}