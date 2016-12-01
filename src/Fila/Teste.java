

package Fila;

import java.util.Scanner;

/**
 *
 * @author lab1503
 */
public class Teste {
    
    public static void main(String []args){
        Scanner entrada = new Scanner (System.in);
        
        FilaCircular f = new FilaCircular(6);
        
        
        System.out.println(f.isEmpty());
        System.out.println(f.isFull());
        System.out.println(f.size());
        f.enqueue(5);
        System.out.println(f.size());
        
        f.enqueue(2);
        f.enqueue(5);
        f.enqueue(3);
        f.enqueue(5);
        f.enqueue(5);
        f.enqueue(5);
       
        
        System.out.println(f.isEmpty());
        System.out.println(f.isFull());
        System.out.println(f.size());
        System.out.println(f.dequeue());
        int a = f.dequeue();
        System.out.println(a*2);
        f.front();
        System.out.println();
        f.imprime();
    }
        
    }
    
