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
