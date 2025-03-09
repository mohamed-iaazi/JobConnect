
# JobConnect: Plateforme de Recrutement 📑

JobConnect est une plateforme web conçue pour faciliter le processus de recrutement en ligne. Elle permet aux candidats de postuler à des offres d'emploi et aux recruteurs de gérer efficacement les candidatures. L'application est construite selon l'architecture MVC pour séparer les différentes responsabilités et garantir une gestion fluide des données et de l'interface utilisateur.

## Fonctionnalités Principales

### Gestion des Offres d'Emploi (Recruteur) 💼
- Créer une offre d'emploi avec un titre, une description et une date de publication.
- Afficher et gérer toutes les offres d'emploi publiées.
- Modifier une offre d'emploi existante.
- Supprimer une offre pour ne plus recevoir de candidatures sur un poste déjà pourvu.

### Gestion des Candidats (Candidat) 🧑‍💼
- Créer un compte avec nom, email, téléphone et CV (format PDF).
- Consulter la liste des offres d'emploi et voir les détails de chaque offre.
- Modifier son profil et mettre à jour ses informations (nom, email, CV).
- Supprimer son compte si l'utilisateur souhaite ne plus utiliser la plateforme.

### Gestion des Candidatures 📝
- Candidats peuvent postuler à une offre d'emploi.
- Suivi des candidatures (acceptée ✅, refusée ❌, en cours de traitement ⏳).
- Modifier une candidature ou retirer une candidature.
- Recruteurs peuvent voir la liste des candidatures reçues pour chaque offre d'emploi.
- Recruteurs peuvent filtrer et trier les candidatures.
- Recruteurs peuvent changer le statut des candidatures (acceptée ✅, refusée ❌, en attente ⏳).

### Authentification et Sécurité 🔐
- Connexion sécurisée avec email et mot de passe.
- Redirection vers la page de connexion si l'utilisateur n'est pas authentifié.
- Accès restreint selon le rôle de l'utilisateur :
    - Les recruteurs ne voient que leurs propres offres et candidatures.
    - Les candidats ne peuvent gérer que leur propre profil et candidatures.

## Diagrammes UML 📊

- **Diagramme de Classes** : Modélisation des entités principales (OffreEmploi, Candidat, Candidature).
- **Diagramme de Cas d'Utilisation** : Illustration des interactions entre candidats, recruteurs et le système.
- **Diagramme de Séquence** : Représentation du processus de soumission de candidature.

### Diagramme de cas d'utilisation
![UseCaseDiagram](https://github.com/user-attachments/assets/193f5b5c-19bd-4d71-9597-96df307d601d)


### Diagramme de séquence
![diagramme_sequence](https://github.com/user-attachments/assets/8c23477f-1549-4bd1-85ea-5e1edbbe0731)


## Technologies Utilisées 💻

- **Backend** : Java EE (Servlets, Filtres, JSP, JDBC), Maven
- **Base de données** : MySQL
- **Frontend** : HTML, CSS, Bootstrap, JavaScript
- **Serveur d'application** : Apache Tomcat
- **Outils de développement** : Eclipse, IntelliJ IDEA

## Installation ⚙️

1. Clonez ce repository :
    ```bash
    git clone https://github.com/mohamed-iaazi/JobConnect.git
    ```

2. Importez le projet dans votre IDE préféré (Eclipse, IntelliJ IDEA).

3. Configurez la base de données MySQL en créant une base de données nommée `jobconnect` et en ajustant les configurations de connexion dans le fichier `web.xml` ou dans les classes Java correspondantes.

4. Déployez le projet sur un serveur Apache Tomcat.

5. L'application est maintenant prête à être utilisée !

## Contribuer 🤝

Les contributions sont les bienvenues ! Si vous souhaitez améliorer l'application, veuillez créer une branche pour vos modifications et soumettre une pull request.

## Licence 📜

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus d'informations.


