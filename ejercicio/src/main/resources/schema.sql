-- Crear la tabla Material
CREATE TABLE Material (
    id_material SERIAL PRIMARY KEY,
    ds_codigo VARCHAR(20) UNIQUE,
    ds_nombre VARCHAR(200) NOT NULL,
    id_dependencia INT,
);

-- Crear la tabla Formato
CREATE TABLE Formato (
    id_formato SERIAL PRIMARY KEY,
    ds_codigo VARCHAR(10) UNIQUE,
    ds_descripcion VARCHAR(180)
);

-- Crear la tabla Material_Detalle
CREATE TABLE Material_Detalle (
    id_material INT NOT NULL,
    id_formato INT NOT NULL,
    qt_duracion INT DEFAULT 0,
    fg_validado BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (id_material, id_formato),
    CONSTRAINT fk_material_detalle_material FOREIGN KEY (id_material) REFERENCES Material(id_material) ON DELETE CASCADE,
    CONSTRAINT fk_material_detalle_formato FOREIGN KEY (id_formato) REFERENCES Formato(id_formato) ON DELETE CASCADE
);

-- Poblar Material
INSERT INTO Material (ds_codigo, ds_nombre, id_dependencia) VALUES
('MAT001', 'Curso de Java Básico', NULL),
('MAT002', 'Módulo 1: Introducción a Java', 1),
('MAT003', 'Módulo 2: Estructuras de Control', 1),
('MAT004', 'Documento de Especificaciones API', NULL),
('MAT005', 'Video Tutorial: Docker Básico', NULL);

-- Poblar Formato
INSERT INTO Formato (ds_codigo, ds_descripcion) VALUES
('VID', 'Video'),
('PDF', 'Documento PDF'),
('TXT', 'Archivo de Texto Plano'),
('URL', 'Enlace Web');

-- Poblar Material_Detalle
INSERT INTO Material_Detalle (id_material, id_formato, qt_duracion, fg_validado) VALUES
(1, 1, 120, TRUE),  -- Curso de Java Básico en formato Video, 120 minutos, validado
(1, 2, 0, TRUE),    -- Curso de Java Básico también tiene un PDF asociado, 0 duración (no aplica), validado
(2, 1, 30, TRUE),   -- Módulo 1 en Video, 30 min
(3, 1, 45, FALSE),  -- Módulo 2 en Video, 45 min, no validado
(4, 2, 0, TRUE),    -- Documento Especificaciones en PDF
(5, 1, 15, TRUE),   -- Video Tutorial Docker en Video, 15 min
(5, 4, 0, TRUE);    -- Video Tutorial Docker también tiene un enlace web