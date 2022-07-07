package comm.platzi.javatests.util;

/**
 * Clase para saber si un año es bisiesto o no
 * */
public class DateUtil {

    public static boolean isLeapYear(int year){

        /**
         * Si el residuo de la división entre 4 es 0, es true o entre 100
         * y que sea diferente de 0 */

        //If refactorizado y simplificado
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        /**
         * Si el residuo de la división entre 400 es 0, es true*/
        /*if (year % 400 == 0){
            return true;
        }else {
            return false;
        }*/
    }
}
