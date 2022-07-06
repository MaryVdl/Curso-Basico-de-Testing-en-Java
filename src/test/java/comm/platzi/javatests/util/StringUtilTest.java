package comm.platzi.javatests.util;


public class StringUtilTest {
    public static void main(String[] args) {
        /* PARA SABER SI ES IGUAL AL RESULTADO
        String result = StringUtil.repeat("Hello", 3);
        //System.out.println(result);
        if (result.equals("HelloHelloHello")){
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("Hello", 1);
        //System.out.println(result2);
        if (result2.equals("Hello")){
            System.out.println("OK");
        }*/

        //PARA SABER SI ES DIFERENTE AL RESULTADO

        String result = StringUtil.repeat("Hello", 3);
        //System.out.println(result);
        if (!result.equals("HelloHelloHello")){
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hello", 1);
        //System.out.println(result2);
        if (!result2.equals("Hello")){
            System.out.println("ERROR");
        }


    }
}