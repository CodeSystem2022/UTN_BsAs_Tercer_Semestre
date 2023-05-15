import psycopg2  # Librería para conectar con PostgreSQL

dns = "dbname=test_bd user=postgres password=admin host=127.0.0.1 port=5432"
conexion = psycopg2.connect(dns)

# Insertar registro
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
            # Se pide que ingrese los datos a insertar
            nombre = input('Ingrese el nombre de la persona a insertar: ')
            apellido = input('Ingrese el apellido de la persona a insertar: ')
            email = input('Ingrese el email de la persona a insertar: ')
            cursor.execute(sentencia, (nombre, apellido, email))
            # conexion.commit() # Se utiliza para guardar los cambios en la Base de Datos, en este caso no es necesario
                                # por el uso del with
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
