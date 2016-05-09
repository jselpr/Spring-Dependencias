package es.exes.victor.spring.dependencias;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzadera {

    public static void main(String[] args) {
        ApplicationContext aplicacion = new ClassPathXmlApplicationContext("configuracion.xml");
        Logica logica = aplicacion.getBean("objetoLogica", Logica.class);
        Calculos cl = aplicacion.getBean("cl",Calculos.class);
        System.out.println("Calculos ");
        cl.mostrarDatos();
        List l = (List) aplicacion.getBean("lista2");
        for (Object l1 : l) {
            Circulo c =(Circulo)l1;
            cl.setOper(c);
            cl.mostrarDatos();
        }
        System.out.println(logica.getCount());
    }
}
