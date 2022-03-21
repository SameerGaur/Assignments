var MyClass = /** @class */ (function () {
    function MyClass() {
        this.previousNo = fibo(currentNum - 1);
        this.currentNo = currentNum;
        number;
    }
    MyClass.prototype.next = function () {
        return fibonacci(this.currentNo + 1);
    };
    return MyClass;
}());
var fibonacci = function (num) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= num; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
var myClass = new MyClass(5);
console.log(myClass.next());
function fibo(arg0) {
    throw new Error("Function not implemented.");
}
