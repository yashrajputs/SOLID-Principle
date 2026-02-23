//this will wrong way to wite 
public class DiscountService{
  double calculateDiscount(String type){
    if(type.equals("seasonal")){
      return 10.0;
    }else if(type.equals("clearance")){
      return 20.0;
    }
    return 0.0;
  }
}

//Using Polymorphism
//Discount will be the main partent type
// Create new class
//No modification of old logic
public interface Discount{
   

}
  
