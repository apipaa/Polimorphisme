
package person2;

public class employed  extends Person2{
   public employed() {
        // eksekusi konstruktor induk
        super();
        
        System.out.println("Ekekusi konstruktor Employee()");
    }
    
    public void info(){
        super.showMessage();
    }
}
