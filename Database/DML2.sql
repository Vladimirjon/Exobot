-- database: :memory:

WITH RECURSIVE Incremento AS (
  SELECT 1 AS i
  UNION ALL
  SELECT i + 1 FROM Incremento WHERE i < 1000
)
INSERT INTO Ejemplo (Nombre, Apellido, Identificacion)
SELECT
  'Alex Johan' || i,
  'Torres' || i,
  1000 + i
FROM Incremento
WHERE (i - 1) % 10 = 0;
DELETE FROM Ejemplo WHERE Identificacion > 1000;