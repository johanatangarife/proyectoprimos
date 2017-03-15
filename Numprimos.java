/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprimos;

/**
 *
 * @author Usuario
 */
public class Numprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int count = 0;

            for (int i = 2; i <= 100; i++)
            {

                for (int x = 1; x <= i; x++)
                {
                    if (i % x == 0)
                    {
                        count = count + 1;

                    }
                }
                    if (count < 3)
                    {
                        System.out.println( i + ",");
                        
                    }
                    count = 0;
                
              
            }
    }
    
}
