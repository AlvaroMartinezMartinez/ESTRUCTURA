/**
 * Box
 */
public class Box <T>{
    private T t;
    public T getT(){ return t;}
    public void setT(T t){this.t = t;}
    
    public <U extends Number> void inspect(U u){
        System.out.println("A: " + t.getClass().getName());
        System.out.println("B: " + u.getClass().getName());
    }
    
    
}