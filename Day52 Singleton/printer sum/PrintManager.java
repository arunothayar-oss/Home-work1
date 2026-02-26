
package singleton;

public class PrintManager
{
    private static PrintManager instance;    //object Creation

    private PrintManager() 
    {
        System.out.println("PrinterManager object created");
    }
    public static  PrintManager getInstance()
    {
        if(instance==null)
        {
            instance=new PrintManager();
        }
        return instance;
    }
    
    public void print()
    {
        System.out.println("printing document");
    }
    
    }
/*.Printer Manager (Basic Singleton) Problem Statement:
Create a PrinterManager class using Singleton Design Pattern.

Requirements:
Only one printer object should exist.

Constructor must be private.

Provide getInstance() method.

Method: print() → prints
"Printing document..."

Task:
Call getInstance() twice in main().

Call print() using both references.

Check whether both references point to the same object.*/


