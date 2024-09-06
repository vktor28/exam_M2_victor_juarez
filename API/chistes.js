



fetch('https://v2.jokeapi.dev/joke/Any?lang=es&type=single')
.then((response) => response.json())
.then((data) => {

let chiste1 = data.joke;
console.log(chiste1);
document.getElementById("chiste1").innerHTML = chiste1;

})



fetch('https://api.chucknorris.io/jokes/random')
.then((response) => response.json())
.then((data) => {
let chiste2 = data.value;
console.log(chiste2);
document.getElementById("chiste2").innerHTML = chiste2;

})




fetch('https://v2.jokeapi.dev/joke/Any?lang=es&type=single')
.then((response) => response.json())
.then((data) => {

let chiste3 = data.joke;
console.log(chiste3);
document.getElementById("chiste3").innerHTML = chiste3;

})



fetch('https://api.chucknorris.io/jokes/random')
.then((response) => response.json())
.then((data) => {
let chiste4 = data.value;
console.log(chiste4);
document.getElementById("chiste4").innerHTML = chiste4;

})