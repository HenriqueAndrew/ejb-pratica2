
package com.henriqueandrewsilva.jsf;

import com.henriqueandrewsilva.ejb.EJBCalculadoraSimplesLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

//@author Henrique Andrew da Silva

@Named(value = "jsfCalcSimples")
@RequestScoped
public class JsfCalcSimples {

    @EJB
    private EJBCalculadoraSimplesLocal eJBCalculadoraSimples;

    /**
     * Creates a new instance of JsfCalcSimples
     */
    public JsfCalcSimples() {
    }
    
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void dobrar(){
        this.valor = eJBCalculadoraSimples.dobrar(valor);        
    }
}
