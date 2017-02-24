
import java.util.*;
 
// X in example is my Alf

public class AlfGen<Alf>{
    
   private int size=0;
   private Alf[] obj;
  
   public void AlfsGen(){
      obj = (Alf[]) new Object[10];
   }
   
   public void add(Alf a){
       obj[size] = a;
       size++;
    }
   
    
   
    public void remove(int index){
       
       if(obj [index] != null){
           obj [index] = null; 
           for (int i = index; i >= size; i--){
             obj[i] = obj[i+1];
            }
          size--;
        }
        else{
           throw new Inception();
        }

    }
       
    public int size(){
        return size+1;
    }
    
        public Alf get(int index){
       if(obj [index] == null){
           throw new Inception();
        }
        else{
           return obj[index];
        }
    }
    
    public void set(int index, Alf a){
        if (index > size){
            throw new Inception();
        }
        obj[index] = a;
        }
        
    //********************************************    
    public String toString(){
        for (int i = 0; i <=size; i++){
           // return obj[i].Arrays.toString(arr);
        }
        return "ok";
    }
    
    public void insert(int index, Alf a){
        if(index>size){
            throw new Inception();
        }
        for (int i = index; i >= size; i--){
             obj[i+1] = obj[i];
          }
          obj[index] = a;
          size++;
          
    }
    
    public int indexOf(Alf a){
        for(int i = 0; i <= size; i++){
            if(obj[i]==a){
                return i;
            }
        }
        return -1;
    }
    
    
   public void clear(){
       for(int i=0; i<=size; i++){
       obj[i] = null;
    }
    }
    
   public static void main (String[] args){
       
       
       
   }

}