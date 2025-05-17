package annotations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@annotation(date = "16/05/2025", nome = "Denilson")
public class Servidor extends Pessoa{

    private int matricula;

    @Override
    public boolean validarMatricula(int x) {
        return matricula > 0;
    }
}
