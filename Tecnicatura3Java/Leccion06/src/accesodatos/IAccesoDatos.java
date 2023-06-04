package accesodatos;

// Una interface no hereda de la clase Object
// Si puede heredar de otra interface
// No tiene constructores
public interface IAccesoDatos {
    // Atributo de la interface como constante (public final static)
    // No se puede declarar el atributo sin darle un valor
    int MAX_REGISTRO = 10;
    
    // Cualquier método va a ser publico y abstracto, aunq no lo agreguemos
    // el compilador lo hace automaticamente
    // Metodo insertar es abstracto y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
