/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberintobuffer;

import java.nio.IntBuffer;
import java.util.Arrays;
/**
 *
 * @author Ameer
 */
public class NumberIntoBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IntBuffer buffer = IntBuffer.allocate(10);
        buffer.put(4);
        buffer.put(2);
        buffer.put(4, 2);
        buffer.put(7, 2);
        System.out.println(Arrays.toString(buffer.array()));
    }
    
}
