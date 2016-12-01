

package ListaEstatica;

public class ListaEstatica {
    private int lista[];
    private int inicio;
    private int fim;
    private int qtd;
    
    public ListaEstatica (int tamanho) {
        lista = new int [tamanho];
        inicio = fim = -1;
        qtd = 0;
} 
    
    public boolean isEmpty(){
        return qtd == 0;
    }
    
    
    public boolean isFull(){
       return  qtd == lista.length;
    }
    
    public int size(){
        return qtd;
    }
    
    
    
    public void add (int elemento, int indice){
         if (isFull()){
             
             System.out.println("Lista esta cheia");
        }else if (indice < 0 || indice > qtd){
            
            System.out.println("indice invalido");
            
        }else{
         
             for (int i = fim; i >= indice; i--){
                  
                  lista[i+1] = lista[i];
                  
             }
             
                             
             lista[indice]= elemento;
             qtd++;
             fim++;
             if (qtd == 1){
                 inicio= 0;
             }
             
         }
            
    }
    public int remove(int indice){
        int aux = -1;
        if (isEmpty()){
            System.out.println("Lista esta vazia");
        }else if (indice < 0 || indice > fim ){
            
            System.out.println("indice invalido");
            
        }else{
            aux = lista[indice];
            for (int i = indice; i < fim ; i++){
                 lista[i] = lista[i+1];
            }
            fim--;      
            qtd--;
            if (qtd == 0 ){
                inicio = -1;
                
            }
              
            
        
    }return aux;
    
      
}
    
    public void imprimir (){
        
        if (isEmpty()){
            System.out.println("Fila vazia");
        }else{
        
        for (int i = inicio; i <= fim; i++){
            System.out.print(lista[i]+ " - " );
        }
    }
    }
    
    
    public void set(int elemento, int indice){
        
       if (indice < 0 || indice > qtd){
            System.out.println("indice invalido");
            
        }else{
            
            
            lista[indice] = elemento;
            
            
        }
        
    }
    public int get (int indice){
        if (indice < 0 || indice > qtd){
            
            return -1;
            
        }else{
            
            return lista[indice];
            }
            
        }
        
    }
    
    
    
