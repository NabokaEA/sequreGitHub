CREATE TABLE if not exists Person (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(30)
    );


delete from  Person;
INSERT INTO Person (id, name, password) VALUES
                                            (1, 'admin','admin'),
                                            (2, 'user', 'user');