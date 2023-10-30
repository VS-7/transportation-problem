package ifrp.problematranspoorte;

import ifrp.problematranspoorte.view.FrPTransporte;

/**
 *
 * @author vitorsergio
 */
public class ProblemaTranspoorte {

    public static void main(String[] args) {
        FrPTransporte fr = new FrPTransporte();
         fr.setVisible(true);
          /* int[][] custos = {
                {8, 12, 10},
                {4, 10, 6},
                {6, 15, 12}
        };
        int[] oferta = {50, 70, 40};
        int[] demanda = {60, 70, 30};

        ProblemaTransporte problema = new ProblemaTransporte(custos, oferta, demanda);
        
        if (problema.verificarBalanceamento()) {
            System.out.println("O problema está balanceado.");
            CantoNoroeste cn = new CantoNoroeste();
            cn.cantoNoroeste(problema);
            problema.imprimirAlocacao();
            problema.imprimirCustoTotal();
        } else {
            System.out.println("O problema não está balanceado.");
        }*/
    }
}
