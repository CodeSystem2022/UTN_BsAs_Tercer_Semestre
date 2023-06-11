class Persona { //Clase padre

    static contadorPersonas = 0; // Atributo estático
   // email = 'Valor deafult email'; //Atributo no estático

   static get MAX_OBJETO(){ //Este método simula una constante
    return 5;
   }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido=apellido;
        if (Persona.contadorPersonas < Persona.MAX_OBJETO){
            this.idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se ha superado el máximo de objetos permitidos');
        }
       // console.log('Se incrementa el contador: '+Persona.contadorObjetosPersona);
    }
    get nombre(){
        return this._nombre;
    }
    set nombre (nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        return this._apellido= apellido;
    }
    nombreCompleto(){
        return this.idPersona+' '+ this._nombre +' '+ this._apellido;
    }
    //SobreEscribiendo el método de la clase padre (Object)
    toString(){ 
        return  this.nombreCompleto();
    }

    static saludar (){
        console.log('Saludos desde este método static');
    }
    static saludar2 (persona){
        console.log(persona.nombre+' '+ persona.apellido);

    }

}

class Empleado extends Persona{ //empleado clase hija
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

    //SobreEscritura = Modificicar el comportamiento de algun método em la clase padre
    nombreCompleto(){
        return super.nombreCompleto()+ ', '+this._departamento;
    }
}

let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
persona1.apellido = 'Lopez';
console.log(persona1.apellido);

let persona2= new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);
persona2.apellido = 'Pereyra';
console.log(persona2.apellido);


let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manera de acceder a atributos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar();  # no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email); // Accedemos desde el objeto
//console.log(Persona.email) No se puede acceder desde la clase porque no es estático
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Carla', 'Pertosi' );
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJETO);
//Persona.MAX_OBJETO = 10; No se puede modificar ni alterar
console.log(Persona.MAX_OBJETO);

let persona4 = new Persona ('Franco', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona ('Liliana', 'Paz');
console.log(persona5.toString());