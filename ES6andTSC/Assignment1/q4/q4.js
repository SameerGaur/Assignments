var arrow = function (names) {
    var out = [];
    for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
        var len = names_1[_i];
        var row = {};
        row.name = len;
        row.length = len.length;
        out.push(row);
    }
    return out;
};
var names = ["Tom", "Ivan", "Jerry"];
console.log(arrow(names));
