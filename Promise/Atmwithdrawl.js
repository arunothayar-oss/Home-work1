let balance = 5000;
let amount = 2000;

let atmWithdrawal = new Promise((resolve, reject) => {

    if (balance >= amount) {
        resolve("Money Withdrawn");
    } else {
        reject("Insufficient Balance");
    }

});

atmWithdrawal
    .then((message) => {
        console.log(message);
    })
    .catch((error) => {
        console.log(error);
    });