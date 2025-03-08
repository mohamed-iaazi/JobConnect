create database connectjob;
use connectjob;
CREATE TABLE User (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Nom VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Telephone VARCHAR(20),
    Password varchar(100)
);
CREATE TABLE OffreEmploi (
                             Id INT PRIMARY KEY AUTO_INCREMENT,
                             Description TEXT NOT NULL,
                             Date DATE NOT NULL,
                             Titre VARCHAR(255) NOT NULL,
                             Id_Recruteur int ,
                             FOREIGN KEY (Id_Recruteur) REFERENCES Recruteur(Id) ON DELETE SET NULL
);

CREATE TABLE Recruteur (
                           Id INT PRIMARY KEY AUTO_INCREMENT,
                           OffreEmploi INT default 0,
                           Id_User  int ,
                           FOREIGN KEY (Id_User) REFERENCES user(Id) ON DELETE SET NULL

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
insert into User (Id, Nom, Email, Telephone ,password)values
                                                          (1, 'ahmed', 'ahmed@job.com', '0287927920',"test"),
                                                          (2, 'khadija', 'khadija@job.com', '0719274024' ,"test"),
                                                          (3, 'anas', 'anas@job.com', '0182037492' ,"test");

insert into candidature ( Id ,OffreEmploi ,Id_User )  value(1,1,1);
insert into candidat ( Id ,cv ,Id_User )  value(1,"cv",2);

insert into offreemploi ( Id ,description , Date , Titre, Id_Recruteur  )  value(1,"description",'2025-04-20',"Title" , 1);
insert into offreemploi ( Id ,description , Date , Titre, Id_Recruteur  )  value(2,"description",'2025-04-20',"Title" , 1);


