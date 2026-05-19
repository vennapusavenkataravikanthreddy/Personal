class Employee {
    #salary; // private field

    constructor(name, baseSalary) {
        this.name = name;
        this.#salary=baseSalary;
    }

    // Getter
    get salary() {
        return this.#salary;
    }       
    // Setter
    set salary(amount) {
        if (amount > 0) {
            this.#salary = amount; 
        } else {
           console.log("Salary must be positive");
        }
    }

    // Method to calculate total salary with bonus
    calculateSalary(bonus) {
        return this.#salary  + bonus;
    }
    
    
    //Display details
    display(){
        console.log(`Employee : ${this.name}, Salary: ${this.#salary}`);
    }
}

//create an object
const emp1 = new Employee("John Doe", 50000);

//Access using getter
console.log(emp1.salary);

//update using setter
emp1.salary = 55000;

//Calculate total salary with bonus
console.log(emp1.calculateSalary(5000));

emp1.display();