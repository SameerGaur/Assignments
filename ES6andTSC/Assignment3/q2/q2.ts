class Account{
    id: any;
    name: any;
    balance: any;
    constructor(id: any, name: any, balance: any){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    totalBalance(){
        return this.balance;
    }
}

class SavingAccount extends Account{
    constructor(id: number, name: string, balance: number, interest: number){
        super(id, name, balance = balance + (balance*interest)/100);
    }
} 

class CurrentAccount extends Account{
    constructor(id: number, name: string, balance: number, cash_credit: number){
        super(id, name, balance + cash_credit);
    }
}

let s1 = new SavingAccount(1234567899, "Mansi", 100000, 12);
let c1 = new CurrentAccount(1234567888, "Shridhara", 15000, 2000);

console.log(s1.totalBalance() +" "+ c1.totalBalance());