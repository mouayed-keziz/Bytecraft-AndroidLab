public class pizza {

    String bread;
    String sauce;
    String cheese;
    String Topping;

    pizza(String abread, String asauce, String acheese, String aTopping) {
        this.bread = abread;;
        this.sauce = asauce;
        this.cheese = acheese;
        this.Topping = aTopping;
    }

    pizza(String abread, String asauce, String acheese) {
        this.bread = abread;;
        this.sauce = asauce;
        this.cheese = acheese;  
    }

    pizza(String abread, String asauce) {
        this.bread = abread;;
        this.sauce = asauce; 
    }
}
