
package ListaEstatica;

public class Teste {
     public static void main(String []args){
         
         ListaEstatica lista = new ListaEstatica(5);
         
         lista.add(0, 0);
         lista.add(1, 1);
         lista.add(2, 1);
         lista.add(3, 0);
         lista.add(4, 4);
         lista.add(5, -7);
         lista.imprimir();
         System.out.println();
         lista.remove(0);
         lista.remove(1);
         lista.remove(2);
         lista.imprimir();
     }
}
