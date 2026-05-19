let n1=0, n2=1;
let next;
let count=10;
console.log("Fibonacci Series:");
for(let i=1; i<=count; i++)
{    console.log(n1);
     next=n1+n2;
     n1=n2;
     n2=next;
}