package domain;

public enum TipoEscritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escrituta difital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){//Constructor
        this.descripcion = descripcion;
    }
    
    //Método GET
    public String getDescripcion(){
        return this.descripcion;
    }
    
}
