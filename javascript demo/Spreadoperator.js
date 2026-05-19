//combine two arrays using spread operator
const arr1 = [1, 2, 3];
const arr2 = [4, 5];

const result = [...arr1, ...arr2];
console.log(result); 

//spread operator with objects
const obj1 = {name: "Ravi"} ;
const obj2 = {age:25};
const combinedObj = {...obj1, ...obj2};
console.log(combinedObj);

//Spread operator with function arguments
function add(x, y, z) {
    return x + y + z;
}   
const numbers = [1, 2, 3];
console.log(add(...numbers)); 

//spread operator with strings
const str = "Hello";
const chars = [...str];
console.log(chars);

//spread operator with Rest parameters
function sum(...args) {
    return args.reduce((acc, val) => acc + val, 0);
}   
console.log(sum(1, 2, 3, 4));
