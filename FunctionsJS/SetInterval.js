//Print “Hello World” every 2 second
function printHello(){
    console.log("Hello World");
}

setInterval(printHello,2000);

//Display numbers from 1 to 10 every 1 second
let num=1;
function printNumbers()
{
    console.log(num);
    num++;
    if(num>10)
    {
        clearInterval(intervalId);
    }
}
let intervalId = setInterval(printNumbers, 1000);
//Display current time every second
function showTime() {

    let currentTime = new Date();

    console.log(currentTime.toLocaleTimeString());

}

setInterval(showTime, 1000);
//Display even numbers continuously every 2 seconds

let even = 2;

function printEven() {

    console.log(even);

    even = even + 2;

}

setInterval(printEven, 2000);
// Countdown timer from 10 to 0

let count = 10;

function countdown() {

    console.log(count);

    count--;

    if(count < 0) {

        clearInterval(timerId);

        console.log("Countdown Finished");

    }

}

let timerId = setInterval(countdown, 1000);