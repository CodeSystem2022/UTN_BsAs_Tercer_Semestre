import psycopg2  # Librería para conectar con PostgreSQL

dns = "dbname=test_bd user=postgres password=admin host=127.0.0.1 port=5432"
conexion = psycopg2.connect(dns)

# Insertar registro
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
            valores = (
                ('Carlos','Lara','clara@mail.com'),
                ('Marcos','Canto','mcanto@mail.com'),
                ('Marcelo','Cuenca','cuencaM@mail.com')
            )# Es una tupla de tuplas   
            cursor.execute(sentencia, (valores))
            # conexion.commit() # Se utiliza para guardar los cambios en la Base de Datos
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
