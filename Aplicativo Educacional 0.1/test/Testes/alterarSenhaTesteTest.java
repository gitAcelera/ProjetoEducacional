
package Testes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
  * Teste que simila um recebimento dos dados para recuperar senha.
 * @author Mateus
 * @author Pedro
 * @author Izabelle
 * @author Felipe
 */
public class alterarSenhaTesteTest {
     alterarSenhaTeste altSen = new alterarSenhaTeste();
    public alterarSenhaTesteTest() 
    {
    }
    
    /**
     * Teste do método alterarSenha, da classe alterarSenhaTeste.
     */
    @Test
    public void testalterarSenhaProf() {
        int ra = 2147;
        String recuperar = "alface";
        String expResult = "2147alface";
        String result = altSen.alterarSenha(ra, recuperar);
        assertEquals(expResult, result);
    }
    }
    