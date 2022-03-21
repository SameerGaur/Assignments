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
    constructor(id: number,name: string, balance: number, interest: number){
        super(id, name, balance = balance + (balance*interest)/100);
    }
}

class CurrentAccount extends Account{
    constructor(id: number, name: string, balance: number, cash_credit: number){
        super(id, name, balance = balance + cash_credit);
    }
}

let savingAccount = new SavingAccount(14235678, "Aditya", 11000, 12);
let currentAccount = new CurrentAccount(14235698, "Mandar", 14000, 20);

console.log(savingAccount.totalBalance());
console.log(currentAccount.totalBalance());
