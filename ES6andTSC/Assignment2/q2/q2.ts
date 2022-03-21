let lowNum = 10;
function armstrong(){
    for(let i = lowNum; i>0;i++){
        let numOfDigits = i.toString().length;
        let sum = 0;
        let temp = i.toString();
        for (let char of temp){
            sum += Math.pow(parseInt(char), numOfDigits);
        }
        if(sum == i){
            console.log(i);
            lowNum = i;
            break;
        }
    }
}

function getNextArmstrong(){
    lowNum++;
    armstrong();
}

armstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();