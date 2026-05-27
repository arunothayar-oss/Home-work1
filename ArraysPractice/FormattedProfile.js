const user={firstName:"Arunothaya",lastName:"Krishnan",email:"arunothayakrishnan@gmail.com"};
//fullname in upper case
let fullName=(user.firstName+" "+user.lastName).toUpperCase();
//extract email
let domain=user.email.split("@")[1];
//profile formatted string =more data arranged in one string neatly 
let profile=`Name:${fullName}
Email:${user.email}
Domain:${domain}`;
console.log(profile);
//2nd question
let sentence="JavaScript is easy to learn";
// create object
let result={totalCharacters:sentence.length,
    totalWords:sentence.split(" ").length,
lowecase:sentence.toLowerCase()};
console.log(result);
//3rd question
//Username Generator Problem

/*Generate a username using:

First 3 letters of name

Last 2 digits of phone number


Output should be lowercase*/
let name="Arunothaya";
let phone="9655523428";
let firstpart=name.slice(0,3);
let lastpart=phone.slice(-2);
let username1=(firstpart+lastpart).toLowerCase();
console.log(username1);