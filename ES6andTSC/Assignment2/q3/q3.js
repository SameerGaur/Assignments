var lowNum2 = 9;
function armstrong2() {
    for (var i = lowNum2; i > 0; i++) {
        var numOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numOfDigits);
        }
        if (sum == i) {
            console.log(i);
            lowNum2 = i;
            break;
        }
    }
}
function getNextArmstrong2() {
    lowNum2++;
    armstrong2();
}
function reset() {
    lowNum2 = 9;
}
armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstrong2();
getNextArmstrong2();
