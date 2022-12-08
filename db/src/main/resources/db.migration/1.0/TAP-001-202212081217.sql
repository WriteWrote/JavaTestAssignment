CREATE SCHEMA test_assignment2022;

CREATE TABLE test_assignment2022.types
(
    type_id   SERIAL PRIMARY KEY,
    type_name VARCHAR(50) UNIQUE
);

INSERT INTO test_assignment2022.types
VALUES (1, 'INSIDE'),
       (2, 'INCOMING'),
       (3, 'OUTCOMING');

CREATE TABLE test_assignment2022.documents
(
    id            SERIAL PRIMARY KEY,
    doc_type      INTEGER NOT NULL REFERENCES test_assignment2022.types (type_id),
    header        VARCHAR(50),
    text          VARCHAR(1000),
    serial_number INTEGER NOT NULL
);

INSERT INTO test_assignment2022.documents
VALUES (1, 1, 'DOC1', 'INSIDE1', '12345'),
       (2, 1, 'DOC2', 'INSIDE2', 13245),
       (3, 2, 'DOC3', 'INCOMING1', 13425),
       (4, 2, 'dOC4', 'INCOMING2', 14532),
       (5, 3, 'DOC5', 'OUTCOMING1', 12453),
       (6, 3, 'DOC6', 'OUTCOMING2', 14352),
       (7, 3, 'DOC7', 'OUTCOMING3', 14523);

CREATE TABLE test_assignment2022.links
(
    id_left  INTEGER NOT NULL REFERENCES test_assignment2022.documents (id),
    id_right INTEGER NOT NULL REFERENCES test_assignment2022.documents (id)
);

INSERT INTO test_assignment2022.links
VALUES (1, 2),
       (1, 3),
       (3, 2),
       (3, 6),
       (2, 7),
       (4, 7);