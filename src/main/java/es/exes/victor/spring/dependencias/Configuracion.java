package es.exes.victor.spring.dependencias;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:configuracion.xml")
public class Configuracion {
    @Value("${datos.radio}")
    private int radio;
    @Value("${datos.lado1}")
    private int lado1;
    @Value("${datos.lado2}")
    private int lado2;
    
    @Bean
    public Circulo circulo() {
            return new Circulo(radio);
        }
        @Bean
        public Rectangulo rectangulo() {
            Rectangulo r = new Rectangulo();
            r.setLado1(lado1);
            r.setLado2(lado2);
            return r;
        }
        @Bean
        public Calculos cl() {
            //la dependencia al objeto circulo
            //se indica con una llamada al método
            //que define dicha instancia
            return new Calculos(circulo());
        }


    @Bean(name = "elServicio")
    @Scope(value = "prototype")
    public Servicio getServicio(){
        return new Servicio();
    }
    @Bean
    public ProcesadorDeBeans getProcesadorDeBeans(){
        return new ProcesadorDeBeans();
    }
}
