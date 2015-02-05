create table Telefon (
   id INT NOT NULL auto_increment,
   telefon VARCHAR(20),
   retea  VARCHAR(20),
   agent     INT,
   PRIMARY KEY (id),
   FOREIGN KEY (agent) REFERENCES Agent(id)
);
