
const prompt = require("prompt-sync")();

const addNumbers=(a,b,callback)=>{          //Arrowfunction+callback
let sum=a+b;
callback(sum);

};
function displayResult(result)
{
    console.log("sum is"+result);
}


//anonmyous function to check even or odd
let checkEvenOdd=function(num){

        if(num%2==0)
        {
            console.log(num+"is Even number");
        }
        else
        {
           console.log(num+"is odd number"); 
        }
};
//arrow functions for multiplication
 const multiplyNumbers=(a,b,callback)=>{
        let multiply=a*b;
        callback(multiply);
 };
//anonmymous callback function
let checkResult=function(result){   //here callback=function multiply=result
    console.log("Multiply"+result);
    if(result>100)
    {
        console.log("result is greater than 100");
    }
    else
        {
            console.log("result isnot greater than 100");
    }
};
let choice;
do{
    console.log("\n 1.Add two numbers");
    console.log("2.check even or odd");
    console.log(" 3.Multiply two numbers");
    console.log("4.Exit");
    choice=parseInt(prompt("Enter your choice: "));
    switch(choice)
    {
        case 1 :
            {
                let a=parseInt(prompt("Enter the first number: "));
                 let b=parseInt(prompt("Enter the second number: "));
                 addNumbers(a, b, displayResult);
            break;

            }
            case 2 :
                {
                    let num=parseInt(prompt("Enter the number"));
                    checkEvenOdd(num);
                    break;
                }
                case 3 :
                    {
                        let x=parseInt(prompt("Enter the first number: "));
                         let y=parseInt(prompt("Enter the second number: "));
                         multiplyNumbers(x,y,checkResult);
                         break;
                    }
                case 4:
                    {
                console.log("Program Exited");

                 break;
                    }
         default:

            console.log("Invalid Choice");

    }
}while(choice!=4);