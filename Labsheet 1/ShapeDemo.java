public class ShapeDemo {


     //labsheet 01:Question 05: Inheritance and Polymorphism  
    
public static void main(String args[]){

    Shape circle=new Circle(5.0);
    Shape rectanle=new Rectangle(4.0,6.0);

   displayShape(circle);
   displayShape(rectanle);
}
private staticvoid displayShape(Shape shapeDemo){
    Shape.displayShape();
}


}
