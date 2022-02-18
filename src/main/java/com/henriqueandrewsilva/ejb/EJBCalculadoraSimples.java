
package com.henriqueandrewsilva.ejb;

import javax.ejb.Stateless;

// @author Henrique Andrew da Silva

@Stateless
public class EJBCalculadoraSimples implements EJBCalculadoraSimplesLocal {

    @Override
    public int dobrar(int valor) {
       return valor+valor;
    }
    
}
