package classes;

/**
 *
 * @author vitorsergio
 */
public class ProblemaTransporte {
    private int[][] custos;
    private int[] oferta;
    private int[] demanda;
    private int[][] alocacao;

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

    public void imprimirCustoTotal() {
        int custoTotal = 0;
        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                custoTotal += alocacao[i][j] * custos[i][j];
            }
        }
        System.out.println("Custo Total: " + custoTotal);
    }
    
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
}
