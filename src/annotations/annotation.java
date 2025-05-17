package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Anotação pode ser utilizada em tempo de execução
@Target(ElementType.TYPE)
public @interface annotation {

    public String nome();
    public String date();
}
