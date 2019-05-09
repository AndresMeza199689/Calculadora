
package calculadora;


public class Operaciones {
    private Double a;
    private Double b;

    public Operaciones(Double a,Double b) {
        this.a = a;
        this.b = b;
    }
    
    public Double suma (){
        return a+b;
    }
    
    public Double resta(){
        return a-b;
    }
    
    public Double multiplicacion(){
        return a*b;
    }
    
    public Double division()throws Error{
        if(b==0.0){
            throw new Error ("No se puede dividir por cero");
        }
        return a/b;
    }
}
