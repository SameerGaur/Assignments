var lowNum = 10;
function armstrong() {
    for (var i = lowNum; i > 0; i++) {
        var numOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numOfDigits);
        }
        if (sum == i) {
            console.log(i);
            lowNum = i;
            break;
        }
    }
}
function getNextArmstrong() {
    lowNum++;
    armstrong();
}
armstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
