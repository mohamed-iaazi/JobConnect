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
        padding-top: 56px; /* Adjust this value if your navbar height differs */
    }
  </style>
</head>
<body class="bg-light">

<nav class="navbar navbar-light bg-white shadow-sm fixed-top">
  <div class="container">
    <a href="#" class="navbar-brand d-flex align-items-center">
      <img src="logoConnectJOB.png" alt="JOBCONNECT" height="30">
    </a>
  </div>
</nav>

<div class="container my-5 d-flex justify-content-center  align-items-center">
  <div class="row justify-content-center col-6">
    <div class=" bg-white p-5 shadow rounded">
      <h2 class="text-center mb-4">CONNEXION</h2>
      <p class="text-center text-secondary mb-4">Entrez vos informations pour accéder à votre compte</p>

      <form action="LoginServlet" method="POST">
        <div class="mb-3">
          <label for="email" class="form-label">Email</label>
          <input type="email" id="email" name="email" class="form-control" required>
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Mot de passe</label>
          <input type="password" id="password" name="password" class="form-control" required>
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
        Vous avez deja un compte ? <a href="login.jsp" class="text-primary">Connectez-vous</a>
      </p>


    </div>


  </div>
  <img src="./image/page.png" alt="Illustration" style="height:400px ; width : 500px" class="img-fluid col-6">


</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
