var arrow = (names:string[])=>{
    let out =[];
    for(let len of names){
        var row : any={

        };
        row.name = len;
        row.length = len.length;
        out.push(row);
    }
    return out;
};

let names = ["Tom", "Ivan", "Jerry"];
console.log(arrow(names));
