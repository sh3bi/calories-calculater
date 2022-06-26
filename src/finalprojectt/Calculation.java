
package finalprojectt;


public class Calculation {
    
    
    public static double Bmr(int H, int W, int A, char G){
 double BMR;
 
 
    if (G =='M')
        {
            

           BMR = (66 + (6.23 * W) + (12.7 * H) - (6.8 * A));
        }
        else
        {

           BMR =   (665 + (4.35 * W) + (4.7 * H) - (4.7 * A));
        }
   
  return BMR; }
    
    
      public static double cal(double Bmi,int ex ){
 double cal;
  
  
    cal = switch (ex) {
            case 0 -> Bmi * 1.2;
            case 2 -> Bmi * 1.375;
            case 3 -> Bmi * 1.55;
            case 4 -> Bmi * 1.725;
            default -> Bmi * 1.9;   
     };
    
    return cal;
    }

}

