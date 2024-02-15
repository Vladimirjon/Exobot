-- database: :memory:
DROP TABLE IF EXISTS Ejemplo;

CREATE TABLE Ejemplo (
    IdEjemplo INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre TEXT NOT NULL,
    Apellido TEXT NOT NULL,
    Identificacion INTEGER NOT NULL
);
