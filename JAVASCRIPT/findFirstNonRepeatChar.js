import Map
str  = "sachins";

function findFirstNonRepeatChar(str) {
    //  arr = [];
     const freq = Map();
     for (let i = 0; i < str.length; i++) {
         if(freq.has(str[i])) {
             freq.set(str[i], freq.get(str[i]) + 1);
         } else {
             freq.set(str[i], 1);
         }
     }
     return [...freq].find(([key, value]) => value === 1)[0];
}


console.log(findFirstNonRepeatChar(str));