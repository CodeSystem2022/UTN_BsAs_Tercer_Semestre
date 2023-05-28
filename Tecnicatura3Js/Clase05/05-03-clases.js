class Persona{
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }


}

let persona1 = new Persona('Martin','Perez');
console.log(persona1);
let persona2 = new Persona('Carlos','Lara');
console.log(persona2);

let persona3 = new Persona('Maxi', 'Chalin');
console.log('Se crea persona3: ', persona3);
// Probando setter de persona3
persona3.nombre = 'Maximiliano';
persona3.apellido = 'Chalo';
console.log('Probando getters de persona3: Nombre: ', persona3.nombre, ', Apellido: ', persona3.apellido);

console.log();

let persona4 = new Persona('Vale', 'Alvarez');
console.log('Se crea persona4: ', persona4);
// Probando setter de persona4
persona4.nombre = 'Valeria';
console.log('Probando getter de nombre de persona2: ', persona4.nombre);
