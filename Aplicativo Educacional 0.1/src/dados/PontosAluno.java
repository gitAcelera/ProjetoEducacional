package dados;

/**
 *
 * @author ALUNO
 */
public class PontosAluno {
    
    private static int pontosPt = 0;
    
    public static int getPontosPt() {
        return pontosPt;
    }

    public static void setPontosPt(int quantidade) {
        pontosPt += quantidade;
    }
    
     private static int pontosMt = 0;
    
    public static int getPontosMt() {
        return pontosMt;
    }

    public static void setPontosMt(int quantidade) {
        pontosMt += quantidade;
    }
    
    private static int pontosQE=0;
    
    public static int getPontosQE()
    {
        return pontosQE;
    }
     public static void setPontosQE(int quantidade)
     {
         pontosQE += quantidade;
     }
    
     private static int pontosQA=0;
     
     public static int getPontosQA()
     {
         return pontosQA;
     }
     public static void setPontosQA (int quantidade)
     {
         pontosQA += quantidade;
     }


}
