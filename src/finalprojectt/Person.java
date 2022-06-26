
package finalprojectt;

/**
 *
 * @author a.sh3bi
 */
public class Person extends Calculation
  {
    private String name ;
    public int age;
    private int height;
    private int weight;
    private char gender;
    private static double Bmi;
    private double cal;
    private int exercise;
     
     
     public Person(String nemo ,int H, int W , int A, char c ,double Bmr, double Cal, int ex ){
     name = nemo;
         age = A;
     height= H;
     weight =W;
      gender =c;
      Bmi = Bmr;
      cal = Cal;
      exercise = ex;
      
     } 
     
     public Person (int H, int W , int A, char c  ){
     age = A;
     height= H;
     weight =W;
      gender =c;
     } 
     
     public Person(){}
     
     
     public  void set_name(String A){
     name = A;
    }
     
    public  void set_age(int A){
     age = A;
    }
    
     public  void set_height(int H){
     height = H;
    }
     
      public  void set_weight(int W){
     weight = W;
      }
     
      public  void set_gender(char c){
     gender = c;
    }
      
      public void set_Bmr(int H, int W , int A, char c){
      Bmi = Calculation.Bmr(H,W,A, c);
  
    }
      
       public  void set_Cal(double B, int E ){
      
           
           cal = Calculation.cal(B,E);
  
    }
            
       public  void set_exercise(int c){
     exercise = c;
    }
       
      /////////gggggggeeeeeetttttttttttttt
       
       
      public int get_age(){
      
          return age ;
      }
    
       public int get_height(){
      
          return height ;
      }
       
        public int get_weight(){
      
          return weight ;
      }
        
        public char get_gender(){
      
          return gender ;
      } 
        
        public double get_bmr(){
      
          return Bmi ;
      }
        
        public int get_exercise(){
      
          return exercise ;
      }
        
     public double get_cal(){
      
          return cal ;
      }
     
      public String get_name(){
      
          return name ;
      }
        
    @Override
 public String toString(){ 
  return "\n                 "+exercise+"             "+cal+"          "+Bmi+"           "+weight+"          "+height+"           "+gender+"          "+age+"         "+name;  
  //  return System.out.printf("%-10s %-10d %-10d %-10s %-10s %-10s %-10s %-10s",name,age,height,weight,gender,Bmi,cal,exercise);  
 }  
}

