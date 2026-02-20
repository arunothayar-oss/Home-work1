
package arraylist;


public class Acer
{
    String model;
    String colour;
    boolean rgbKeyboard;
    String processor;
    double price;

    public Acer(String model, String colour, boolean rgbKeyboard, String processor, double price)
    {
        this.model = model;
        this.colour = colour;
        this.rgbKeyboard = rgbKeyboard;
        this.processor = processor;
        this.price = price;
    }
    void display()
    {
        System.out.println("Enter the model:"+model);
        System.out.println("Enter the colour:"+colour);
        System.out.println("is this rgb Keyboar:"+rgbKeyboard);
        System.out.println("Enter the processor:"+processor);
        System.out.println("Enter the price:"+price);
    }
    
}
