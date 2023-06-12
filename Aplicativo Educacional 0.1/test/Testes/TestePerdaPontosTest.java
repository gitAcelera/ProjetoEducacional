
package Testes;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Teste para verificar se a função de perder pontos está funcionando
 * @author Pedro
 * @author Mateus
 * @author Izabelle
 * @author Felipe
 *
 */
public class TestePerdaPontosTest 
{
    private final TestePerdaPontos perda = new TestePerdaPontos();
    
    public TestePerdaPontosTest() 
    {
    }
  /**
     * Teste do método subtracao, da classe TestePerdaPontos.
     * 
     */
    @Test
    public void testSubtracaoPontuacao() 
    {
       
        int pontosTotal = 20;
        int pontosPerdidos = 5;
        int resultadoEsperado = 15;
        int resultado;
        resultado = perda.subtracao(pontosTotal, pontosPerdidos);
        Assert.assertEquals(resultadoEsperado, resultado);
    }
  
}