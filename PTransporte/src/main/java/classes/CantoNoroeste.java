package classes;

/**
 *
 * @author vitorsergio
 */
public class CantoNoroeste {
    
    public void cantoNoroeste(ProblemaTransporte problema) {
        int[][] custos = problema.getCustos();
        int[] oferta = problema.getOferta();
        int[] demanda = problema.getDemanda();
        int[][] alocacao = new int[oferta.length][demanda.length];

        int linha = 0;
        int coluna = 0;

        while (linha < oferta.length && coluna < demanda.length) {
            if (oferta[linha] > demanda[coluna]) {
                alocacao[linha][coluna] = demanda[coluna];
                oferta[linha] -= demanda[coluna];
                demanda[coluna] = 0;
                coluna++;
            } else {
                alocacao[linha][coluna] = oferta[linha];
                demanda[coluna] -= oferta[linha];
                oferta[linha] = 0;
                linha++;
            }
        }

        problema.setAlocacao(alocacao);
    }
}

