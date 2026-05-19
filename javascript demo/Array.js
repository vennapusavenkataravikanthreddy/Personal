var languages = ["JavaScript", "Python", "C++", "Java", "Lua"];
 
          // truncate the Array to 3 elements
         // languages.length = 3
          // Output: [ 'JavaScript', 'Python', 'C++' ]
          //console.log(languages)
 
          //The push() method adds an element at the end of the array
          languages.push(".Net");
          console.log("After Push ",languages)
          //The unshift() method adds an element at the beginning of the array.

         // unshift()- add element at end of the array
            languages.unshift("Ruby");
            console.log("After unshift ",languages);

        //concat()- merge arays
        let newlanguages = ["Go", "Swift"];
        let combinedArray = languages.concat(newlanguages);
        console.log("After Concat ",combinedArray);

        //forEach()-iterate over the array
        console.log("Using forEach");
        languages.forEach((language,index) => {
            console.log(index +":" + language);
        });

        //map()- transform array
        let upperCaseLanguages = languages.map(language => language.toUpperCase());
        console.log("Mapped(uppercase):", upperCaseLanguages);

        //filter()- filter elements based on condition
        let filteredLanguages = languages.filter(language => language.length > 5);
        console.log("Filtered (length > 5):", filteredLanguages);

        //splice()- add/remove elements from array
        languages.splice(2, 1, "TypeScript"); // remove 1 element at index 2 and add "TypeScript"
        console.log("After Splice ",languages);
 
          //The pop() method removes the last element from an array and returns that element.
         var lastElement= languages.pop()
         console.log("After Pop",languages);

         
 
         // removes the first element of the array
            let firstElement = languages.shift();
            console.log(firstElement);
            console.log(languages);
         //reverse
       /*  The reverse() method reverses the order of elements in place,
         it means the method changes the original array.*/  
         let reversedArray =languages.reverse();
         console.log(languages);
 
         // slicing from the second element to fourth element
            let new_arr2 = languages.slice(1,3);
            console.log(new_arr2);
        //sort  
        let sortedArray = languages.sort();
        console.log(sortedArray);
 
 
 
        let number=[3,4,6,7,10]
     
      //reduce
      const message = ["JavaScript ", "is", "fun."];
 
// function to join each string elements
                         
function joinStrings(accumulator, currentValue) {  
  return accumulator + currentValue;  // javascript   , javascript is,  javascript is fun
}
 
// reduce join each element of the string
let joinedString = message.reduce(joinStrings);
console.log(joinedString);
 
// Output: JavaScript is fun.
 
const numbers = [1, 2, 3, 4, 5, 6];
                                 
function sum_reducer(accumulator, currentValue) {
  return accumulator + currentValue;
}
 
let sum = numbers.reduce(sum_reducer);
console.log(sum); // 21
 
// using arrow function
let summation =numbers.reduce(
  (accumulator, currentValue) => accumulator + currentValue
);
console.log(summation); // 21