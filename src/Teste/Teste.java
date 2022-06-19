package Teste;

import java.util.ArrayList;
import java.util.List;

public class Teste {


    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> sequence = new ArrayList<>();

        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);


        sequence.add(5);
        sequence.add(1);
        sequence.add(22);
        sequence.add(22);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(8);
        sequence.add(10);

        System.out.println(isValidSubsequence(array, sequence));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        boolean resultado = false;
        int posicaoAtual=-1;
        int posicaoItem;

        for (Integer integer : sequence) {

            for (Integer num : array) {
                if (num.equals(integer)) {
                    posicaoItem = array.indexOf(num);

                    if (posicaoItem > posicaoAtual) {
                        posicaoAtual = posicaoItem;
                        resultado = true;
                        break;
                    }
                } else {
                    resultado = false;
                }
            }

            if(resultado == false){
                break;
            }
        }
        return resultado;
    }

}