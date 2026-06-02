let marks=80;
let promise =new Promise(function(resolve,reject){
    setTimeout(function(){
        if(marks>=50)
        {
            resolve("Pass");
        }
        else
            {
                reject("Fail");

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