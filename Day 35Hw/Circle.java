



public class Circle extends Shape
{   
     
        Circle(double radius)
         {
             super(radius);
         }

    @Override
    double calculateArea() 
    {
        double area=3.14*radius*radius; 
        return area;
         
    }
    
}
