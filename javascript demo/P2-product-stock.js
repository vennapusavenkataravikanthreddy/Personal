const products =[ 
{name: "Gucci Round Bucklet Belt", price: 400},
{name: "Gucci Round Bucklet Belt", price: 450},
{name: "Gucci Round Bucklet Belt", price: 400},
{name: "Gucci Round Bucklet Belt", price: 320}, 
{name: "Smiley T-shirt", price: 350},
{name: "Smiley T-shirt", price: 150},
{name: "Shinie Nail paint", price: 100},
{name: "Shinie Nail paint", price: 250},
{name: "Esbeda Wallet", price: 250},   ];

//use reduce() to count  stock of each product 
const stockData = products.reduce((accumulator, product) => {
    if (accumulator[product.name]) {
        accumulator[product.name]+=1;
    }
    else {
        accumulator[product.name] = 1;
    }
    return accumulator;
}, {});

//convert object to array format
const result = Object.keys(stockData).map(name => 
    ({productName: name, stock: stockData[name]}));


 //Display the result
console.log("Product Name|Stock");
result.forEach(item=>{
    console.log(item.productName +"|"+ item.stock);
});

