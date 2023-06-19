from logging import log


class PersonaDAO:

    """
    DAO significa: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read->Seleccionar
                    Update -> Actualizar
                    Delete-> Eliminar


    """
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES(%s,%s,%s)'
    _ACTUALIZAR='UPDATE persona SET nombre= %s, apellido= %s,email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor :
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = []
                for registro in registros:
                    persona = Persona()
                    persona = Persona(registro[0], registro[1], registro[2], registro[3]),
                    personas.append(persona)
                return personas

    @classmethod
    def insertar(cls,persona):
        with Conexion.obtenerConexion()
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido,persona.email)
                cursor.execute(cls._INSERTAR,valores )
                log.debug(f'Persona insertada : {persona}')
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona)
        with Conexion.obtenerConexion()
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido,persona.email,persona.id_persona)

                cursor.execute(cls._ACTUALIZAR,valores )
                log.debug(f'Persona actualizada : {persona}')
                return cursor.rowcount
if __name__ == '__main__':
    # eliminar un registro
   # persona1 = Persona(id_persona=8)
    #personas_eliminadas = PersonaDAO.elimnar(persona1)
    log.debug(f'Personas insertadas: {personas_eliminadas}')
    # actualizar  un registro
   # persona1 = Persona(nombre='Pedro', apellido='Romero', email='promero@mail.com')
   # personas_insertadas = PersonaDAO.insertar(persona1)
   # log.debug(f'Personas insertadas: {personas_insertadas}')

    # insertar un registro
    #persona1 = Persona(nombre='Pedro',apellido='Romero',email='promero@mail.com' )
    #personas_insertadas= PersonaDAO.insertar(persona1)
    #log.debug(f'Personas insertadas: {personas_insertadas}' )

    personas = PersonaDAO.seleccinar()
    for persona in personas:
        log.debug(persona)

















