package lista02;

import lista02.exceptions.EntradaInvalida;
import lista02.exceptions.SolucaoNaoReal;

public class EquacaoSegundoGrau {

    private Double a;
    private Double b;
    private Double c;


    public EquacaoSegundoGrau(Double a, Double b, Double c) throws EntradaInvalida{
        if(a == 0) throw new EntradaInvalida("A equação é de 1º grau.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double delta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public Double x1() throws SolucaoNaoReal {
        if(delta() < 0) throw new SolucaoNaoReal("Solucao nao real");
        return (-b + Math.sqrt(delta())) / (2 * a);
    }

    public Double x2() throws SolucaoNaoReal{
        if(delta() < 0) throw new SolucaoNaoReal("Solucao nao real");
        return (-b - Math.sqrt(delta())) / (2 * a);
    }

}


