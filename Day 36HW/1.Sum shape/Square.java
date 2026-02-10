public  class Square extends Shape
{
  Square(double side)
         {
             super(side);
         }

    @Override
    double calculateArea() 
    {
        double area=side*side; 
        return area;
         
    }  
}