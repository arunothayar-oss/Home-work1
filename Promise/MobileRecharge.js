let paymentSuccess = true;

let mobileRecharge = new Promise((resolve, reject) => {

    if (paymentSuccess) {
        resolve("Recharge Successful");
    } else {
        reject("Recharge Failed");
    }

});

mobileRecharge
    .then((message) => {
        console.log(message);
    })
    .catch((error) => {
        console.log(error);
    });