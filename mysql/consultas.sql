-- PROPIETARIOS

SELECT COUNT(*) FROM viviendas.propietarios;

SELECT * FROM viviendas.propietarios WHERE apellido = "Garcia";

SELECT email FROM viviendas.propietarios;

SELECT * FROM viviendas.propietarios WHERE nombre LIKE "F%";

-- CASAS

SELECT * FROM viviendas.casas WHERE ano BETWEEN 1990 AND 2020;

SELECT * FROM viviendas.casas ORDER BY precio DESC;

SELECT ROUND(AVG(precio)) as "Precio Medio" FROM viviendas.casas;

SELECT * FROM viviendas.casas WHERE precio=(SELECT MIN(precio) FROM viviendas.casas);

-- JOIN
SELECT c.*, p.nombre, p.apellido FROM viviendas.casas c LEFT JOIN viviendas.propietarios p ON p.id=c.idPropietario;

SELECT p.nombre,c.precio FROM viviendas.propietarios p JOIN viviendas.casas c  ON p.id=c.idPropietario WHERE c.precio>180000;






