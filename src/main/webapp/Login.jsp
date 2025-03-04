<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion - JOBCONNECT</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="d-flex align-items-center justify-content-center vh-100 bg-light">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow p-4">
                    <h2 class="text-center">CONNEXION</h2>
                    <p class="text-center">Entrez vos informations pour accéder à votre compte</p>
                    <form action="LoginServlet" method="post">
                        <div class="mb-3">
                            <label for="email" class="form-label">EMAIL</label>
                            <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">MOT DE PASSE</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Votre mot de passe" required>
                        </div>
                        <button type="submit" class="btn btn-primary w-100">CONNEXION</button>
                    </form>
                    <div class="text-center mt-3">
                        <p>ou</p>
                        <button class="btn btn-outline-danger w-100 mb-2">Connectez-vous avec Google</button>
                        <button class="btn btn-outline-dark w-100">Connectez-vous avec Apple</button>
                    </div>
                    <p class="text-center mt-3">Vous n'avez pas de compte ? <a href="register.jsp">Inscrivez-vous</a></p>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>