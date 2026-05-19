let value1 = 30;
let value2 = 50;
let value3 = 45;

let largest = (value1 > value2)
   ? ((value1 > value3) ? value1 : value3) 
   : ((value2 > value3) ? value2 : value3);

console.log("The largest value is:", largest);