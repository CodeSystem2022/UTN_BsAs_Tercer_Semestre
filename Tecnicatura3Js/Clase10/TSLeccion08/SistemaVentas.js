class Producto{
    static contadorProductos =0;
    constructor(nombre,precio){
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    get idProducto(){
        return this.idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }

    toString(){//Template literals : nos permite insertar codigo dinamicamente
        return 'idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio : ${this._precio}';
    }
}






