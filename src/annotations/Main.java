package annotations;


import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Servidor servidor = new Servidor();

        Method[] listMethods = servidor.getClass().getMethods();
        System.out.println(listMethods[0].getName());
        System.out.println();

        AnnotatedElement annotatedElement = servidor.getClass();

        Annotation[] an = annotatedElement.getAnnotationsByType(annotation.class);

        System.out.println(((annotation)an[0]).date());
        System.out.println(((annotation)an[0]).nome());
    }
}
