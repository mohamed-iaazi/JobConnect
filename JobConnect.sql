create database connectjob;
use connectjob;
CREATE TABLE User (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Telephone VARCHAR(20)
);
CREATE TABLE OffreEmploi (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Description TEXT NOT NULL,
    Date DATE NOT NULL,
    Titre VARCHAR(255) NOT NULL
);
CREATE TABLE Recruteur (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Id_OffreEmploi INT,
    FOREIGN KEY (Id_OffreEmploi) REFERENCES OffreEmploi(Id) ON DELETE SET NULL
);
CREATE TABLE Candidat (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Cv TEXT NOT NULL,
    Id_User INT UNIQUE, 
    FOREIGN KEY (Id_User) REFERENCES User(Id) ON DELETE CASCADE
);
CREATE TABLE Candidature (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Id_OffreEmploi INT,
    Id_Recruteur INT,
    Id_Candidat INT,
    FOREIGN KEY (Id_OffreEmploi) REFERENCES OffreEmploi(Id) ON DELETE CASCADE,
    FOREIGN KEY (Id_Recruteur) REFERENCES Recruteur(Id) ON DELETE CASCADE,
    FOREIGN KEY (Id_Candidat) REFERENCES Candidat(Id) ON DELETE CASCADE
);
insert into User (Id, Nom, Email, Telephone)values
(1, 'ahmed', 'ahmed@job.com', '0287927920'),
(2, 'khadija', 'khadija@job.com', '0719274024'),
(3, 'anas', 'anas@job.com', '0182037492');

INSERT INTO OffreEmploi (Id, Description, Date, Titre) VALUES
(1, 'Développeur Web Full-Stack', '2025-03-01', 'Développeur Web'),
(2, 'Ingénieur DATA', '2025-03-02', 'Ingénieur Data'),
(3, 'Chef de projet', '2025-03-03', 'Chef de Projet IT');

INSERT INTO Recruteur (Id, Id_OffreEmploi) VALUES
(1, 1),
(2, 2), 
(3, 3); 

INSERT INTO Candidat (Id, Cv) VALUES
(1, 'cv_karim.pdf'),
(2, 'cv_nadia.pdf'); 

INSERT INTO Candidature (Id, Id_OffreEmploi, Id_Recruteur) values
(1,1,1),
(2,2,2),
(3,3,3);

