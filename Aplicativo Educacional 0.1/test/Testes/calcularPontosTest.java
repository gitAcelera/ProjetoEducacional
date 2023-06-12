
package Testes;

import junit.framework.Assert;
import org.junit.Test;


/**
 * Teste para verificar se função de somar pontos está correta
 * @author Felipe
 * @author Pedro
 * @author Izabelle
 * @author Mateus

 */
public class calcularPontosTest {
    
    private final calcularPontos calc = new calcularPontos();
    
    public calcularPontosTest() {
    }
    
    /**
     * Teste do método soma, da classe calcularPontos.
     * 
     */
    @Test
    public void SomaDoisNumerosInteiros()
    {
        int pontosTotal = 0;
        int pontosMat = 20;
        int resultadoEsperado = 20;
        int resultado;
        
        resultado = calc.soma(pontosTotal,pontosMat);
        
        Assert.assertEquals(resultadoEsperado, resultado);
        
    }
    }

  