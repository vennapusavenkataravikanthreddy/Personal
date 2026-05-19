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

//filter premium products
const premiumProducts = products.filter(product => product.price > 300);

//Display premium products
console.log("Premium Products:(Price > $300)");
premiumProducts.forEach(product => {
    console.log(`Name: ${product.name}, Price: $${product.price}`);
});