create table Agent (
   id INT NOT NULL auto_increment,
   nume VARCHAR(20),
   agentie  VARCHAR(20),
   varsta     INT,
   adresa INT,
   PRIMARY KEY (id),
   FOREIGN KEY (adresa) REFERENCES Adresa(id)
   
);
