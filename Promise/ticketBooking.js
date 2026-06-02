let ticketAvailable = true;

let ticketBooking = new Promise((resolve, reject) => {

    if (ticketAvailable) {
        resolve("Ticket Booked");
    } else {
        reject("House Full");
    }

});

ticketBooking
    .then((message) => {
        console.log(message);
    })
    .catch((error) => {
        console.log(error);
    });