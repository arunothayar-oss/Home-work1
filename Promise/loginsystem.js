let correctPassword = true;

let loginSystem = new Promise((resolve, reject) => {

    if (correctPassword) {
        resolve("Login Successful");
    } else {
        reject("Invalid Password");
    }

});

loginSystem
    .then((message) => {
        console.log(message);
    })
    .catch((error) => {
        console.log(error);
    });