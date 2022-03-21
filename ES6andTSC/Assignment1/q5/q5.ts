let add=function(a=5){
    console.log(a);
};
add();
add(20);

var names = ["shrirang", "sumantra", "siddhesh", "shriyash", "pradnyesh"];

let userFriend = function(username: any,...friends: any){
    console.log(username);
    for(let friend of friends){
        console.log(friend);
    }
}
var username = "Shriram";
userFriend(username, names);

let printCapitalNames = function(...names:any){
    for(let name in names){
        console.log(name.toUpperCase());
    }
}

printCapitalNames(names);


