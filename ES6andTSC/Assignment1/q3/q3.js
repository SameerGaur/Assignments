var order = {
    id: 125,
    title: "iPhone",
    price: 70000,
    printorder: function () {
        return (this.id);
    },
    getprice: function () {
        return (this.price);
    }
};
var order2 = Object.assign({}, order);
console.log(order);
console.log(order2);
