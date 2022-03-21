interface Printable{
    print();
}

class Circle implements Printable{
    radius: number;
    area: number;
    constructor(radius: number){
        this.radius = radius;
        this.area = 3.18 * radius * radius;
    }
    print() {
        console.log(this.radius);
        console.log(this.area);
    }
}

class Employee implements Printable{
    id: number;
    name: string;
    constructor(id: number, name: string){
        this.id = id;
        this.name = name;
    }
    print() {
        console.log("Id:" + this.id+" \nName:"+this.name);
    }
}

let circle = new Circle(4);

let employee = new Employee(20, "Shridhara");

function PrintAll(obj1, obj2){
    obj1.print();
    obj2.print();
}

PrintAll(circle,employee);


