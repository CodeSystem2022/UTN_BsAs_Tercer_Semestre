//Clase 5 Parte 1 JavaScript/

let persona ={
    nombre:'Carlos',
    apellido:'Gil',
    email:'cgil@gmail.com',
    edad:30
    nombrecompleto: function(){//metodo o funcion en js
        return this.nombre+' '+this.apellido;

    }
    get nombreEdad() {   //metodo get
        return 'El nombre es : ' this.nombre+' edad: '+this.edad;

    }
}
console.log('comenamos a utilizar el metodo get')
console.log(persona.nombreEdad);

//Clase 5 Parte 2 JavaScript


let persona ={
    nombre:'Carlos',
    apellido:'Gil',
    email:'cgil@gmail.com',
    edad:30,
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase();
    },  
    set lang(){
        this.idioma =this.lang.toUpperCase();
    },
    nombrecompleto: function(){//metodo o funcion en js
        return this.nombre+' '+this.apellido;
    }
    get nombreEdad() {   //metodo get
        return 'El nombre es : ' +this.nombre+' edad: '+this.edad;
    }
        
        }


console.log('comenzamos con el metodo get y set para idiomas')
persona.lang = 'en';
console.log(persona.lang);

//Clase 5 Parte 3 JavaScript
//creamos un constructor

function Persona3(nombre,apellido,email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
}
let padre = new Persona3('Leo','Lopez','lopezl@gamil.com');
console.log(padre);

//Clase 5 Parte 4 JavaScript


function Persona3(nombre,apellido,email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombrecompleto = function()
    {
        return this.nombre+' '+this.apellido;

    }
}

//Uso de prototype
Persona3.prototype.telefono = '2618383343';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '43543563465';
console.log(madre.telefono);

//Uso de call
let persona4 = {
  nombre: 'Juan',
  apellido: 'Perez',
  nombreCompleto2: function(titulo, telefono){
    return titulo+' '+this.nombre+' '+this.apellido+' '+telefono;
    //return this.nombre+' '+this.apellido;
  }
}

let persona5 = {
  nombre: 'Carlos',
  apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('lic.', '345344576457'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '456454765685'));

//Metodo Apply
let arreglo = ['Ing.', '549087890809'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));

