let lowNum2 = 9;
function armstrong2(){
    for(let i = lowNum2; i>0;i++){
        let numOfDigits = i.toString().length;
        let sum = 0;
        let temp = i.toString();
        for(let char of temp){
            sum += Math.pow(parseInt(char), numOfDigits);
        }
        if(sum == i){
            console.log(i);
            lowNum2 = i;
            break;
        }
    }
}

function getNextArmstrong2(){
    lowNum2++;
    armstrong2();
}

function reset(){
    lowNum2 = 9;
}

armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstrong2();
getNextArmstrong2();