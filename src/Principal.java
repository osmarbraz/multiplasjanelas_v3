import controle.ControlJanela;
import controle.ControlReusaJanela1;

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Use executa 1  ou executa 2 (passando parametros)");
//            System.exit(0);
//        }
        //int p = Integer.parseInt(args[0]);
        int p = 1;
        switch (p) {
            case 1: {
                ControlJanela controle = new ControlJanela();
                controle.executar();
                break;
            }
            case 2: {
                ControlReusaJanela1 controle = new ControlReusaJanela1();
                controle.executar();
                break;
            }
        }

    }
}
