const menu = {
    1: {name: "pasta", price:250},
    2: {name: "pizza", price:250},
    3: {name: "burger", price:150},
    4: {name: "sandwich", price:120},
   
};
let menuNumber = 2;
switch(menuNumber) {
case 1:
    console.log("You selected pasta. Price: $", menu[1].price);
    break;
case 2:
    console.log("You selected pizza. Price: $", menu[2].price);
    break;
case 3: 
    console.log("You selected burger. Price: $", menu[3].price);
    break;
case 4:
    console.log("You selected sandwich. Price: $", menu[4].price);
    break;
default:
    console.log("Invalid menu number. Please select a number between 1 and 4.");
}
