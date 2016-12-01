
package Fila;
/**
 *
 * Natalia Oliveira 20470090
 */
public class FilaCircular {
    private int fila[];
    private int inicio;
    private int fim;
    private int qtd;
    
    
    public FilaCircular (int tamanho){
        fila = new int [tamanho];
        qtd = inicio = fim = 0;
       
    }
    
    public boolean isEmpty(){
        return qtd == 0;
    }
    
    public boolean isFull(){
       return  qtd == fila.length;
    }
    
    public int size(){
        return qtd;
    }
    
    public void enqueue (int elemento){
        if (isFull()){
            System.out.println("Fila esta cheia");
        }else{
            
            fila[fim] = elemento;
            qtd++;
            fim = (fim+1)% fila.length;
            
        }
           
    }
    public int dequeue (){
         if (isEmpty()){
            return 0;
        }else{
            int aux = fila[inicio];
            inicio = (inicio+1)% fila.length;
            qtd--;
            return aux;
         }
           
           
         
    }
    public int front(){
        if (isEmpty()){
            return -1;
        }else{
            return fila[inicio];
        }
        
    }
    public void imprime (){
        int i = 0; 
        int indice = inicio;
        
        if (isEmpty()){
            System.out.println("Fila vazia");
        }else{
        for ( i = 0; i < qtd; i++){
            System.out.println(fila[indice]);
            indice = (indice+1)% fila.length;
        }
    }
    
    
    }
}
