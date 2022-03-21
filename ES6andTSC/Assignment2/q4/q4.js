var User = /** @class */ (function () {
    function User(name, message) {
        this.name = name;
        this.message = message;
    }
    return User;
}());
var msgUser1 = new Map();
msgUser1.set("message1", "This is the message 1 by user1");
msgUser1.set("message2", "This is the message 2 by user1");
var user1 = new User("Ekam", msgUser1);
var msgUser2 = new Map();
msgUser2.set("message1", "This is the message 1 by user2");
msgUser2.set("message2", "This is the message 2 by user2");
var user2 = new User("dve", msgUser2);
var msgUser3 = new Map();
msgUser3.set("message1", "This is the message 1 by user3");
msgUser3.set("message2", "This is the message 2 by user3");
var user3 = new User("trini", msgUser3);
var msgUser4 = new Map();
msgUser4.set("message1", "This is the message 1 by user4");
msgUser4.set("message2", "This is the message 2 by user4");
var user4 = new User("Chatwari", msgUser4);
var msgUser5 = new Map();
msgUser5.set("message1", "This is the message 1 by user5");
msgUser5.set("message2", "This is the message 2 by user5");
var user5 = new User("Panch", msgUser5);
var msgUser6 = new Map();
msgUser6.set("message1", "This is the message 1 by user6");
msgUser6.set("message2", "This is the message 2 by user6");
var user6 = new User("Shat", msgUser6);
var usersSet1 = new Set();
var usersSet2 = new Set();
usersSet1.add(user1);
usersSet1.add(user2);
usersSet1.add(user3);
function adduserRoom2(user) {
    if (!usersSet1.has(user) && usersSet2.size < 3) {
        usersSet2.add(user);
    }
}
adduserRoom2(user4);
adduserRoom2(user5);
adduserRoom2(user6);
var chatroom = new Map();
chatroom.set("chatroom1", usersSet1);
chatroom.set("chatroom2", usersSet2);
console.log(chatroom);
