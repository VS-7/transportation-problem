package ifrp.problematranspoorte.classes;

/**
 *
 * @author vitorsergio
 */
public class ProblemaTransporte {
    private int[][] custos;
    private int[] oferta;
    private int[] demanda;
    private int[][] alocacao;
  /*  private int[][] custosReduzidos;
    private int linhaMax;
    private int colunaMax;
*/
    public ProblemaTransporte(int[][] custos, int[] oferta, int[] demanda) {
        this.custos = custos;
        this.oferta = oferta;
        this.demanda = demanda;
        this.alocacao = new int[oferta.length][demanda.length];
    }

    public void imprimirAlocacao() {
        System.out.println("Alocação:");
        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                System.out.print(alocacao[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    
    public String getImprimirAlocacao() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                sb.append(alocacao[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void imprimirCustoTotal() {
        int custoTotal = 0;
        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                custoTotal += alocacao[i][j] * custos[i][j];
            }
        }
        System.out.println("Custo Total: " + custoTotal);
    }
    
        public String getImprimirCustoTotal() {
            int custoTotal = 0;
            for (int i = 0; i < oferta.length; i++) {
                for (int j = 0; j < demanda.length; j++) {
                    custoTotal += alocacao[i][j] * custos[i][j];
                }
            }
            return "Custo Total: " + custoTotal;
        }
    /*
    public void calcularCustosReduzidos() {
        custosReduzidos = new int[oferta.length][demanda.length];

        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                if (alocacao[i][j] == 0) {
                    custosReduzidos[i][j] = custos[i][j];
                }
            }
        }
    }

    public void encontrarMaiorReducao() {
        int maxReducao = Integer.MIN_VALUE;

        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                if (custosReduzidos[i][j] > maxReducao) {
                    maxReducao = custosReduzidos[i][j];
                    linhaMax = i;
                    colunaMax = j;
                }
            }
        }
    }

    public void realocarMercadorias() {
        int q = Math.min(oferta[linhaMax], demanda[colunaMax]);

        alocacao[linhaMax][colunaMax] = q;
        oferta[linhaMax] -= q;
        demanda[colunaMax] -= q;
    }
    
    public boolean isSolucaoOtima() {
        int[][] custosReduzidos = getCustosReduzidos();

        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                if (alocacao[i][j] == 0 && custosReduzidos[i][j] < 0) {
                    return false;
                }
            }
        }

        return true;
    }
    */
    public boolean verificarBalanceamento() {
    int somaOferta = 0;
    int somaDemanda = 0;

    for (int i = 0; i < oferta.length; i++) {
        somaOferta += oferta[i];
    }

    for (int i = 0; i < demanda.length; i++) {
        somaDemanda += demanda[i];
    }

    return somaOferta == somaDemanda;
}

    public int[][] getCustos() {
        return custos;
    }

    public int[] getOferta() {
        return oferta;
    }

    public int[] getDemanda() {
        return demanda;
    }

    public int[][] getAlocacao() {
        return alocacao;
    }

    public void setCustos(int[][] custos) {
        this.custos = custos;
    }

    public void setOferta(int[] oferta) {
        this.oferta = oferta;
    }

    public void setDemanda(int[] demanda) {
        this.demanda = demanda;
    }

    public void setAlocacao(int[][] alocacao) {
        this.alocacao = alocacao;
    }
    /*
    public void setCustosReduzidos(int[][] custosReduzidos){
        this.custosReduzidos = custosReduzidos;
    }
    
    public void setLinhaMax (int linhaMax){
        this.linhaMax = linhaMax;
    }
    
    public void setColunaMax (int colunaMax){
        this.colunaMax = colunaMax;
    }
    
    public int[][] getCustosReduzidos() {
        return custosReduzidos;
    }

    public int getLinhaMax() {
        return linhaMax;
    }

    public int getColunaMax() {
        return colunaMax;
    }*/
}
