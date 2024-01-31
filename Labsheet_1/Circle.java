public class Circle implements Shape{
    //labsheet 01:Question 05: Inheritance and Polymorphism  


     double radius;

     public Circle(double radius){
        this.radius=radius;
     }

     public double calculateArea(){
            return Math.PI*radius*radius;
     }

     public void displayShape(){
        System.out.println("Circle radius is "+radius);
     }

    
}
