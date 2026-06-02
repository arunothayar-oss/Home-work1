let number=8;
let promise=new Promise(function(resolve,reject)
{
    setTimeout(function(){
        if(number%2==0)
        {
            resolve("The number is even");
        }
        else
            {
                reject("The number is odd");
        }
    },2000);
    });
    promise
        .then(function(result){

            console.log(result);
        
 })
    .catch(function(error){
        console.log(error);
    });



