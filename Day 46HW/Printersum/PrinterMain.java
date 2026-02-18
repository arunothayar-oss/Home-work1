
package threads;


public class PrinterMain
 {
    public static void main(String[] args)
    {
        HPPrinter hp=new HPPrinter();
        CanonPrinter cp=new CanonPrinter ();
        hp.start();
        cp.start();
    }
}
/*3.Printer System
(Interface + Thread)

🔹 Question:
Office has multiple printers:

All printers implement same interface

Each printer prints document using separate thread

📥 Sample Input:
HP Printer Canon Printer
📤 Sample Output:
HP Printer printing... Canon Printer printing...  */
