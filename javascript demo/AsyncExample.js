// Simulating cart validation
function validateCart(){
    return new Promise((resolve, reject) => {  //Creating a new Promise
        setTimeout(() => {                      // Simulating cart validation logic
            const isCartValid = true;           // Change to false to simulate cart validation failure
            if (isCartValid) {                   // If cart is valid, resolve the promise
                resolve("Cart is valid");        // Resolve with a success message
            } else {                            // If cart is not valid, reject the promise
                reject("Cart is not valid");     // Reject with an error message
            }                                     // Simulating a delay for cart validation
        }, 1000);                                      // End of setTimeout
    });
}

// Simulating payment processing
function processPayment() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const isPaymentSuccessful = true;
            if (isPaymentSuccessful) {
                resolve("Payment processed successfully");
            }
            else {
                reject("Payment failed");
            }       
        }, 1500);
    });
}

// Simulating invoice generation
function generateInvoice() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Invoice generated");
        }, 500);
    });     
}

// Simulating sending confirmation email
function sendConfirmationEmail() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Confirmation email sent");
        }, 800);
    });
}

//Async/Await Flow
async function orderProcess() {
    try {
        const cartStatus = await validateCart();
        console.log(cartStatus);
        
        const paymentStatus = await processPayment();
        console.log(paymentStatus);
       
        const invoiceStatus = await generateInvoice();
        console.log(invoiceStatus);
       
        const emailStatus = await sendConfirmationEmail();
        console.log(emailStatus);
   
    } catch (error) {
        console.log("Error during checkout:", error);
    }     
}
//calling the async function
orderProcess();   