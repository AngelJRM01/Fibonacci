package org.mps2022.fibonacci;

/**
 * Class providing a method that computes the fibonacci sequence of a given valid position
 *
 * @author Ángel Joaquín Rodríguez Mercado
 */

public class Fibonacci {

    public int compute(int value) {

        if(value < 0){
            throw new RuntimeException("The value is negative: " + value);
        }

        int result = 0, resultValue1 = 0, resultValue2 = 1;

        for(int i = 1; i <= value; i++){
            result = resultValue1 + resultValue2;
            resultValue2 = resultValue1;
            resultValue1 = result;
        }

        return result;
    }
}
