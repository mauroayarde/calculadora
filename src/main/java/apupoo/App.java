package apupoo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = Logger.getLogger("Logger");
    public static void main( String[] args )
    {
      BasicConfigurator.configure();
      logger.info("Iniciando programa");
      Calculadora calculadora = new Calculadora ();
      double resultado = calculadora.dividir(9, 3);
      System.out.println("La division es :"+resultado);

      logger.info("Finalizando programa");
     
    }
}
