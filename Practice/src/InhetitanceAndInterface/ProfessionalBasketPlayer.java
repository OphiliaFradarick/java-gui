package InhetitanceAndInterface;

public class ProfessionalBasketPlayer extends BasketballPlayer{
   double salary;
   
   //We can never override final methods, hence use the object of the class to call the method as a inlining code
   public void display(BasketballPlayer chicagoBulls) {
	   chicagoBulls.displayMessage();
   }
}
