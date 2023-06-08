package Dados;

/**
 * Inicia a classe PontosAluno
 * @author Felipe
 */
public class PontosAluno {
    
    private static int pontosPt = 0;
    /**
     * Método get static que obtém o valor da variável pontosPt
     * @return pontosPt
     */
    
    public static int getPontosPt() {
        return pontosPt;
    }
    /**
     * Método set static que atribui o valor para a variável pontosPt
     * @param quantidade A variável quantidade recebe um novo valor
     */

    public static void setPontosPt(int quantidade) {
        pontosPt += quantidade;
    }
    
    
     private static int pontosMt = 0;
    /**
     * Método get static que obtém o valor da variável pontosMt
     * @return pontosMt
     */
    public static int getPontosMt() {
        return pontosMt;
    }
     /**
     * Método set static que atribui o valor para a variável pontosPt
     * @param quantidade A variável quantidade recebe um novo valor
     */

    public static void setPontosMt(int quantidade) {
        pontosMt += quantidade;
    }
    
    private static int pontosQE=0;
    /**
     * Método get static que obtém o valor da variável pontosQe
     * @return pontosQe
     */
    
    public static int getPontosQE()
    {
        return pontosQE;
    }
    /**
     * Método set static que atribui o valor para a variável pontosQe
     * @param quantidade A variável quantidade recebe um novo valor
     */
     public static void setPontosQE(int quantidade)
     {
         pontosQE += quantidade;
     }
    
     private static int pontosQA=0;
     /**
      * Método get static que obtém o valor da variável pontosQa
      * @return pontosQa
      */
     
     public static int getPontosQA()
     {
         return pontosQA;
     }
      /**
      * Método set static que atribui o valor para a variável pontosQa
      * @param quantidade A variável quantidade recebe um novo valor
      */
     public static void setPontosQA (int quantidade)
     {
         pontosQA += quantidade;
     }


}
