package comm.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;


    //Metodo setup donde normalmente se ponen los bloques de codigo comunes
    @Before // Junit ejecuta este metodo antes de ejecutar los metodos siguientes, (cada uno)
    public void setup(){
        PaymentGateway paymentGateway= Mockito.mock(PaymentGateway.class);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
    }
    @Test
    public void payment_is_correct(){
        //Parte 1 del Test: Se preparan los objetos que vamos a probar
        /*PaymentGateway paymentGateway= Mockito.mock(PaymentGateway.class);*/
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.Ok));
        /*PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);*/

        //Parte 2 del Test: Llamamos al método que estamos probando (Ejecución del metodo)
        boolean result = paymentProcessor.makePayment(1000);

        //Parte 3 del Test: Comprobamos los resultados
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong(){
        //Primera parte del test; Se preparan los objetos que vamos a probar
        /*PaymentGateway paymentGateway= Mockito.mock(PaymentGateway.class);*/
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        /*PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);*/

        //Parte 2 y 3 del Test: Se juntan en una sola línea que realiza lo mismo
        assertFalse(paymentProcessor.makePayment(1000));
    }



}