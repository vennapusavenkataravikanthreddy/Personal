
const products = [
  { productName: "Gucci Round Bucklet Belt", price: 250, isPremium: false },
  { productName: "Smiley T-Shirt", price: 200, isPremium: false },
  { productName: "Shinie Nail Paint", price: 150, isPremium: false },
  { productName: "Shinie Nail Paint", price: 150, isPremium: false },
  { productName: "Esbeda Wallet", price: 280, isPremium: false },
  { productName: "Esbeda Wallet", price: 280, isPremium: false },
];

// Chain filter, map, reduce → total price of non‑premium products
const total = products
  .filter(p => !p.isPremium)       // take all non-premium
  .map(p => p.price)               // extract prices
  .reduce((sum, price) => sum + price, 0);   // sum them

console.log("Total price =", total);