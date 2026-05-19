let value1 = 30;
let value2 = 50;
let value3 = 45;

let largest;
if (value1 > value2) {
    if (value1 > value3) {
       largest = value1;
    }
} else {
    if (value2 > value3) {
       largest = value2;
    } else {
        largest = value3;
    }
}
console.log("The largest value is:", largest);