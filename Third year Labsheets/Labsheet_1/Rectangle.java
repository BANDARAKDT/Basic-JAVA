public class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double calculateArea(){
        return length*width;
    }

    public displayShape(){
        System.out.println("Rectangle length is:"+length+" rectanle width is:"+width);

    }


}
