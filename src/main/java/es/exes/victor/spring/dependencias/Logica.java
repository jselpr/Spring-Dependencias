package es.exes.victor.spring.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "objetoLogica")  //Repository Controller Service minuto 1:12 WS560083.WMA
@Scope(value = "prototype") // o singleton
public class Logica {
    
    @Autowired        //Carga la primer que encuentre
    private Dao dao;
    
    @Autowired        //Carga la clase nombrada como dao
    @Qualifier(value = "dao")
    private Dao dao2;
    
    @Autowired
    @Qualifier(value = "elServicio")
    private Servicio servicio;    
    
    
    public int getCount(){
        return dao.contarRegistros() + dao2.contarRegistros() + servicio.getValor();
    }
    
}
