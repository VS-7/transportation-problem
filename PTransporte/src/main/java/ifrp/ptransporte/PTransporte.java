package ifrp.ptransporte;

import classes.CantoNoroeste;
import classes.ProblemaTransporte;

/**
 *
 * @author vitorsergio
 */
public class PTransporte {

     public static void main(String[] args) {
        int[][] custos = {
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
        }
    }
}



