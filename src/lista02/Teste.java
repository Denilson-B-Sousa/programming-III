package lista02;

import lista02.exceptions.EntradaInvalida;
import lista02.exceptions.SolucaoNaoReal;

public class Teste {
    public static void main(String[] args) throws SolucaoNaoReal {

        try {
            EquacaoSegundoGrau equacaoSegundoGrau =
                    new EquacaoSegundoGrau(2.0, 2.0, -4.0);

            System.out.println("Valor de X1: " + String.format("%.0f" , equacaoSegundoGrau.x1()));
            System.out.println("Valor de X2: " +  String.format("%.0f" , equacaoSegundoGrau.x2()));
            System.out.println("Valor de Delta " + String.format("%.0f" , equacaoSegundoGrau.delta()));


        } catch (EntradaInvalida error) {
            System.out.println(error);
        }

    }
}
