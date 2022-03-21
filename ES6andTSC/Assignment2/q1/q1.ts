class MyClass {
    private previousNo;
    private currentNo;
    constructor() {
        this.previousNo = fibo(currentNum - 1);
        this.currentNo = currentNum: number;
    }
    next() {
        return fibonacci(this.currentNo + 1);
    }
}
var fibonacci = function (num: number) {
    var a = 0,
        b = 1,
        f = 1;
    for (var i = 2; i <= num; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};

let myClass = new MyClass(5);
console.log(myClass.next());

function fibo(arg0: number) {
    throw new Error("Function not implemented.");
}


