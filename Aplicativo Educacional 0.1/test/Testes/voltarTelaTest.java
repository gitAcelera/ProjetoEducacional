
package Testes;

import junit.framework.Assert;
import org.junit.Test;

/**
  * Teste para verificar se o retorno das telas está correto
 *  @author Izabelle
 * @author Pedro
 * @author Mateus
 * @author Felipe
 */
public class voltarTelaTest {
    private final voltarTela telavolta= new voltarTela();
    public voltarTelaTest() {
    }
    
    

    /**
     * Teste do método retornar, da classe voltarTela.
     * 
     */
    @Test
     public void testVolta() {
        int TelaAtual = 1;
        int TelaAnterior = 1;
        int resultadoEsperado = 0;
        int resultado;
        
        resultado=telavolta.retornar(TelaAtual, TelaAnterior);
        Assert.assertEquals(resultadoEsperado, resultado);
      
    }
    
}
