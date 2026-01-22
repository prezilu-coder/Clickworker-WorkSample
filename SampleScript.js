// File: SampleScript.js
// Piccolo esempio di progetto JavaScript per Clickworker Work Sample

// Messaggio di benvenuto
console.log("Hello Clickworker!");

// Esempio di array e ciclo
const numbers = [1, 2, 3, 4, 5];
console.log("Array values:");
numbers.forEach(num => console.log(num));

// Funzione semplice per sommare un array
function sumArray(arr) {
    return arr.reduce((total, n) => total + n, 0);
}

const sum = sumArray(numbers);
console.log("Sum of array: " + sum);

// Funzione aggiuntiva: semplice manipolazione stringhe
function greet(name) {
    return `Welcome, ${name}!`;
}
console.log(greet("Clickworker"));