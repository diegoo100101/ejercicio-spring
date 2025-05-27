# Usar la imagen oficial de PostgreSQL
FROM postgres:13

# Copiar los scripts SQL al contenedor
COPY ./init-db/schema.sql /docker-entrypoint-initdb.d/

# Exponer el puerto 5432
EXPOSE 5432
