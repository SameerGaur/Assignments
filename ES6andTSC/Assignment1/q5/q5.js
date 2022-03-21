var add = function (a) {
    if (a === void 0) { a = 5; }
    console.log(a);
};
add();
add(20);
var names = ["shrirang", "sumantra", "siddhesh", "shriyash", "pradnyesh"];
var userFriend = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    for (var _a = 0, friends_1 = friends; _a < friends_1.length; _a++) {
        var friend = friends_1[_a];
        console.log(friend);
    }
};
var username = "Shriram";
userFriend(username, names);
var printCapitalNames = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var name_1 in names) {
        console.log(name_1.toUpperCase());
    }
};
printCapitalNames.apply(void 0, names);
