public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // FAMILIA  - TIPO PRIMITIVO - WRAPPER CLASS - TAMANHO
        // LÓGICO   -    boolean     -    Boolen     - 1 bit
        // LITERAIS -      char      -    Character  - 1 byte
        //          -      -         -    String     - 1 byte/cada caractere
        // INTEIROS -      byte      -    Byte       - 1 byte
        //          -     short      -    Short      - 2 bytes
        //          -      int       -    Integer    - 4 bytes
        //          -      long      -    Long       - 8 bytes
        // REAIS    -     float      -    Float      - 4 bytes
        //          -     double     -    Double     - 8 bytes

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
        char letra = 'a';
        boolean semDefinicao = false;

        /////////////

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // Erro de compilação, nao pode converter.
        short numeroCurto2 = (short) numeroNormal; // cast, pega um tipo abrangente e transforma em tipo especifico

        /////////////////////

        //VARIAVEIS E CONSTANTES

        //VARIAVEIS= area de memoria, associada a um nome, que pode armazenar valores de um determinado tipo.
        //CONSTANTES= valores armazenados em memoria que nao podem ser alterados (uma vez declarados, elas nunca podem ser alteradas). esses valores são representados por "final" e estar em caixa alta.
        int numero = 1;
        numero = 2;

        double valor_de_pi = 3.14; //pode mudar o valor

        final double VALOR_DE_PI = 3.14; //nao pode mudar o valor
    }
}
