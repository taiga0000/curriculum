let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
for(let i = 0; i<7; i++){
    if(numbers[i]%2===0){
        isEven(numbers[i]);
    }
}
function isEven(num) {
    console.log(num + 'は偶数です');
}

class car {
   constructor(gas,number){
    this.gas = gas;
    this.number = number
   }
   getNumGas(){
    console.log(`ガソリンは${this.gas}です。ナンバーは${this.number}です`);
   }
}

let kuruma = new car(100,777);
kuruma.getNumGas();