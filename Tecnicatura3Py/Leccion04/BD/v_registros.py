import psycopg2  # Librería para conectar con PostgreSQL

dns = "dbname=test_bd user=postgres password=admin host=127.0.0.1 port=5432"
conexion = psycopg2.connect(dns)

# Mostrar todos los registros
try:
    with conexion:
        with conexion.cursor() as cursor:
            # sentencia = 'SELECT * FROM persona ORDER BY id_persona'

            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'
            entrada = input('Digite los Id Persona a buscar (separados por coma):')
            # Se usa una tupla de tuplas para indicar los valores de la cláusula IN
            llaves_primarias = (tuple(entrada.split(',')),)
            cursor.execute(sentencia, llaves_primarias)

            # cursor.execute(sentencia)
            registros = cursor.fetchall()

            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
