<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JobConnect</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <style>
        body {
            padding-top: 56px;
            height: 100vh;
        }
         .form-container {
             max-width: 600px;
             margin: 0 auto;
             padding: 20px;
         }
         .maxwidth {
             max-width: 500px;
         }
    </style>
</head>
<body class="bg-light d-flex flex-column">

<nav class="navbar navbar-light bg-white shadow-sm fixed-top">
    <div class="container">
        <a href="#" class="navbar-brand d-flex align-items-center">
            <img src="logoConnectJOB.png" alt="JOBCONNECT" height="30">
        </a>
    </div>
</nav>

<div class="container-fluid d-flex flex-grow-1 justify-content-center align-items-center">
    <div class="row w-100 justify-content-center align-items-center">

        <div class=" col-md-6 col-sm-4 pt-3 pb-5 ps-5 pe-5 maxwidth">
            <div class="bg-white p-4 shadow rounded">
                <h4 class="text-center mb-4">INSCRIPTION</h4>
                <p class="text-center text-secondary mb-4">Creez un compte pour acceder a JobConnect</p>

                <form action="userServlet" method="POST">
                    <div class="mb-2">
                        <label for="username" class="form-label">Username</label>
                        <input type="text" id="username" name="Nom" class="form-control" required>
                    </div>
                    <div class="mb-2">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" id="email" name="Email" class="form-control" required>
                    </div>
                    <div class="mb-2">
                        <label for="Telephone" class="form-label">Telephone</label>
                        <input type="number" id="Telephone" name="Telephone" class="form-control" required>
                    </div>
                    <div class="mb-2">
                        <label for="password" class="form-label">Mot de passe</label>
                        <input type="password" id="password" name="password" class="form-control" required>
                    </div>

                    <div class="mb-2">
                        <label for="role" class="form-label">Role</label>
                        <select id="role" name="Role" class="form-control" required>
                            <option value="Candidate">Candidate</option>
                            <option value="Recruteur">Recruteur</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-dark w-100">S'inscrire</button>
                </form>

                <div class="text-center my-4">
                    <p class="text-secondary">Ou inscrivez-vous avec :</p>
                    <div class="d-flex justify-content-center gap-3">
                        <button class="btn btn-outline-secondary d-flex align-items-center">
                            <i class="fab fa-google text-danger me-2"></i> Google
                        </button>
                        <button class="btn btn-outline-secondary d-flex align-items-center">
                            <i class="fab fa-apple text-dark me-2"></i> Apple
                        </button>
                    </div>
                </div>

                <p class="text-center text-secondary">
                    Vous avez deja un compte ? <a href="Login.jsp" class="text-primary">Connectez-Nous</a>
                </p>
            </div>
        </div>


        <div class="col-12 col-md-6 d-flex justify-content-center">
            <img src="pagesConnectJob1.png" alt="Illustration" class="img-fluid" style="max-height: 350px;">
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
