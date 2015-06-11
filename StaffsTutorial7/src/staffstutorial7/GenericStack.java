package staffstutorial7;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class GenericStack <T>{
    
    private T t;
    private ArrayList<T> stack=new ArrayList<T>();
    
    /*
        I normally do not have to check if the ArrayList is null with 
        if(stack!=null) because I did a new ArrayList<T>(); (so allocated 
        in memory, cannot be null)
        But I prefered to check...
    */
             
    public boolean push(T element){
        if(stack!=null){
            if(stack.size()>0){
                for (int i = 0; i < stack.size(); i++){
                    stack.add(i+1, stack.get(i));
                    stack.remove(i);
                }
                stack.add(0, element);
            }else{
                stack.add(element);
            } 
        }else{
            return false;
        }
        return true;
    }
     
    public T pop() {
        if(stack!=null){
            T temp;
            temp=stack.get(0);
            if(stack.size()>0){
                //stack.remove(0);  
                for(int i=0;i<stack.size();i++){
                    if(i+1<stack.size()){
                        stack.set(i, stack.get(i+1));
                    }else{
                        stack.remove(stack.size()-1);
                    }

                }     
            }else{
                stack.remove(0);
            }
            return temp;
        }else{
            return null;
        }   
    }
    
    public T peek() {
        if(stack!=null){
            if(stack.size()>0){
                return stack.get(0);
            }else{
                return null;
            }
        }else{
            return null;
        }
           
    }
    
    public T get(int index){
        if(stack!=null){
            try{
                return stack.get(index);
            }catch(Exception e){
                return null;
            }
        }else{
            return null;
        }     
    }
    
    public String toString(){
        if(stack!=null){
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < stack.size(); i++){
                buffer.append(stack.get(i)).append (" ");
            }
            return buffer.toString();
        }else{
            return null;
        }
    }
    
    
}
