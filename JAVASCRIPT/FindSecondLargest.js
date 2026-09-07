
function FindSecondLargest(arr) {
    let max = 0;
    let SecondMax = 0;
    for (let i = 0; i < arr.length; i++) {
        if(max < arr[i]){
            SecondMax = max;
            max = arr[i];
        }
        else if(SecondMax < arr[i] && arr[i] < max){
            SecondMax = arr[i];
        }
    }
    return SecondMax;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(FindSecondLargest(arr));