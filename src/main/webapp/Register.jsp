
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> JobConnect</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
</head>
<body class="bg-gray-100">
    <div class="min-h-screen flex items-center justify-center">
        <div class="bg-white shadow-lg rounded-lg p-10 flex w-4/5 max-w-4xl">

            <div class="w-1/2 p-5">
                <h2 class="text-2xl font-bold text-gray-800 text-center">INSCRIPTION</h2>
                <p class="text-gray-600 text-center mb-5">Creez un compte pour acceder a JobConnect</p>

                <form action="RegisterServlet" method="POST" class="space-y-4">
                    <div>
                        <label class="block text-gray-700">Nom</label>
                        <input type="text" name="nom" required class="w-full p-3 border rounded-lg focus:ring focus:ring-indigo-300">
                    </div>
                    <div>
                        <label class="block text-gray-700">Email</label>
                        <input type="email" name="email" required class="w-full p-3 border rounded-lg focus:ring focus:ring-indigo-300">
                    </div>
                    <div>
                        <label class="block text-gray-700">Mot de passe</label>
                        <input type="password" name="password" required class="w-full p-3 border rounded-lg focus:ring focus:ring-indigo-300">
                    </div>
                    <button type="submit" class="w-full bg-black text-white p-3 rounded-lg hover:bg-gray-800">
                        S'inscrire
                    </button>
                </form>

                <div class="mt-5 text-center">
                    <p class="text-gray-600">Ou inscrivez-vous avec :</p>
                    <div class="flex justify-center gap-3 mt-3">
                        <button class="flex items-center px-4 py-2 border rounded-lg">
                            <i class="fab fa-google text-red-500 mr-2"></i> Google
                        </button>
                        <button class="flex items-center px-4 py-2 border rounded-lg">
                            <i class="fab fa-apple text-black mr-2"></i> Apple
                        </button>
                    </div>
                </div>

                <p class="mt-4 text-center text-gray-600">
                    Vous avez deja un compte ? <a href="login.jsp" class="text-blue-500">Connectez-vous</a>
                </p>
            </div>


            <div class="w-1/2 flex items-center justify-center">
                <img src="\image\pagesConnectJob 1.png" alt="Illustration" class="w-90">
            </div>
        </div>
    </div>
</body>
</html>
