//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined

class Persona{ //Clase padre
  constructor(nombre, apellido){
    this._nombre = nombre;
    this._apellido = apellido;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get apellido(){
    return this._apellido;
  }

  set apellido(apellido){
    this._apellido = apellido;
  }
  
  nombreCompleto(){
    return this._nombre + ' ' + this._apellido;
  }


}

class Empleado extends Persona{ //Clase hija
  constructor(nombre, apellido, departamento){
    super(nombre, apellido);
    this._departamento = departamento;
  }

  get departamento(){
    return this._departamento;
  }

  set departamento(departamento){
    this._departamento = departamento;
  }
}
/*
// Código Alejandro
let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
persona1.apellido = 'Martinez';
console.log(persona1.apellido);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
persona2.apellido = 'Gonsalez';
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);
*/

// Código Pia
let persona1 = new Persona('Martin', 'Perez')
console.log(persona1.nombre);
persona1.nombre ='Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);

let persona2= new Persona('Carlos,', 'Lara');
console.log(persona2.nombre);
persona2.nombre ='Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1)
console.log(empleado1.nombreCompleto);
