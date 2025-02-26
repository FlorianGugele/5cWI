
//Aufgabe 1

let sum =0;
for(let i =1; i <= 10; i++){   
    sum = sum += i;
    console.log(sum);  
}

//Aufgabe 2
for(let i = 1; i<30;i++){
    if(i%3==0){
        console.log(i);
    }
}

//Aufgabe 3
for(let i =1; i<20; i++){
    if(i%2==0){
        console.log(i)
    }
}

//Aufgabe 4
for(let i=1; i<20;i++){
    if(i%2==1){
        console.log(i)
    }
}

//Aufgabe 5
for(let i=10;i>0;i--){
    console.log(i);
}

//Aufgabe 6
let sum1=0;
for(let i=1; i<=5;i++){
    sum1 = sum1+=(i*i);
}
console.log(sum1);

//Aufgabe 7
let sum2=0;
for(let i=1; i<=100;i++){
    sum2=sum2+=i;
}
console.log(sum2);

//Aufgabe 8
let sum3=1;
for(let i=1;i<=5;i++){
    sum3=sum3*=i;
}
console.log(sum3);

//Aufgabe 9
let sum4=0
for(let i=1;i<=10;i++){ 
    sum4=3*i;
    console.log("3 * " +i +" = "+sum4);
}

//Aufgabe 10
let text = "Florian"
let letters = text.split("");
for(let i =text.length; i>=0;i--){
    console.log(i);
}

