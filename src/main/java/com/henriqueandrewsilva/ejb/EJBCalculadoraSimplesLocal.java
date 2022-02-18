
package com.henriqueandrewsilva.ejb;

import javax.ejb.Local;

// @author Henrique Andrew da Silva

@Local
public interface EJBCalculadoraSimplesLocal {
    
    public int dobrar(int valor);
    
}
