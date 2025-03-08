<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion - JOBCONNECT</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .login-container {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        .login-box {
            max-width: 400px;
            padding: 2rem;
            background: white;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .image-container {
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .image-container img {
            max-width: 100%;
            height: auto;
        }

    </style>
</head>
<body>
    <nav class="navbar navbar-light bg-white shadow-sm">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="logoConnectJOB.png" alt="JOBCONNECT" height="30">
            </a>
        </div>
    </nav>
    <div class="container login-container">
        <div class="row w-100">
            <div class="col-md-6 d-flex align-items-center justify-content-center">
                <div class="login-box">
                    <h2 class="text-center">CONNEXION</h2>
                    <p class="text-center">Entrez vos informations pour accéder à votre compte</p>
                    <form action="LoginServlet" method="post">
                        <div class="mb-3">
                            <label for="email" class="form-label">EMAIL</label>
                            <input type="email" class="form-control" id="email" name="email" placeholder="" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">MOT DE PASSE</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="" required>
                        </div>
                        <button type="submit" class="btn btn-dark w-100">CONNEXION</button>
                    </form>
                    <div class="text-center mt-3">
                        <p>ou</p>
                        <button class="btn btn-outline-dark w-100 mb-2">Connectez-vous avec Google</button>
                        <button class="btn btn-outline-dark w-100">Connectez-vous avec Apple</button>
                    </div>
                    <p class="text-center mt-3">Vous n'avez pas de compte ? <a href="register.jsp">Inscrivez-vous</a></p>
                </div>
            </div>
            <div class="col-md-6 image-container">
                <img src="pagesConnectJob1.png" alt="Illustration">
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
