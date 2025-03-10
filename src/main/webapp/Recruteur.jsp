<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JOBCONNECT-OFFERS</title>
    <style><%@include file="css/style.css"%></style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
</head>
<body id="body-pd">
<header class="header" id="header">
    <div class="header_toggle"> <i class='bx bx-menu' id="header-toggle"></i> </div>
    <div class="header_img"><i class="bi bi-person-circle"></i></div>
</header>
<div class="l-navbar" id="nav-bar">
    <nav class="nav">
        <div> <a href="#" class="nav_logo"> </i> <span class="nav_logo-name"><img style="width: 130px;" src="https://images2.imgbox.com/70/8e/0EuyS7AG_o.png" alt=""></span> </a>
            <div class="nav_list">
                <a href="./" class="nav_link "> <i class='bx bx-grid-alt nav_icon'></i> <span class="nav_name">Dashboard</span> </a>
                <a href="offers" class="nav_link "> <i class='bx bx-bar-chart-alt-2 nav_icon'></i> <span class="nav_name">Créer Emploi</span> </a>
                <a href="Recruteur" class="nav_link active"> <i class='bx bx-user nav_icon'></i> <span class="nav_name">Recruteur</span> </a> </div>
        </div> <a href="#" class="nav_link"> <i class='bx bx-log-out nav_icon'></i> <span class="nav_name">SignOut</span> </a>

    </nav>
</div>
<!--Container Main start-->
<div class="height-100 bg-light">
    <div class="container">
        <div class="row">

            <div class="container bg-lightt shadow ">
                <div class="row">




                    <div class="col-lg-7 ">
                        <form action="createAccount" method="post">
                            <div class="alert alert-danger" role="alert">
                                Comme vous n'avez jamais publié d'offre d'emploi, vous devrez créer un compte employeur.
                            </div>
                            <hr>
                            <div class="mb-3">
                                <input type="text" class="form-control" name="nom" id="Nom" placeholder="Enter votre nom">
                            </div>
                            <div class="mb-3">
                                <input type="email" class="form-control" name="email" id="Email" placeholder="Enter Votre Email">
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" name="telephone" id="Telephone" placeholder="Enter Votre Telephone">
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary mb-2 shadow">Confirm <i class="bi bi-arrow-right"></i></button>

                            </div>


                        </form>
                    </div>
                    <div class="col-lg-5">
                        <img src="https://images2.imgbox.com/b3/c9/PGgafpNd_o.png" style="width: 95%;" alt="" />

                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<script>
    document.addEventListener("DOMContentLoaded", function(event) {

        const showNavbar = (toggleId, navId, bodyId, headerId) =>{
            const toggle = document.getElementById(toggleId),
                nav = document.getElementById(navId),
                bodypd = document.getElementById(bodyId),
                headerpd = document.getElementById(headerId)

            // Validate that all variables exist
            if(toggle && nav && bodypd && headerpd){
                toggle.addEventListener('click', ()=>{
                    // show navbar
                    nav.classList.toggle('show')
                    // change icon
                    toggle.classList.toggle('bx-x')
                    // add padding to body
                    bodypd.classList.toggle('body-pd')
                    // add padding to header
                    headerpd.classList.toggle('body-pd')
                })
            }
        }

        showNavbar('header-toggle','nav-bar','body-pd','header')

        /*===== LINK ACTIVE =====*/
        const linkColor = document.querySelectorAll('.nav_link')

        function colorLink(){
            if(linkColor){
                linkColor.forEach(l=> l.classList.remove('active'))
                this.classList.add('active')
            }
        }
        linkColor.forEach(l=> l.addEventListener('click', colorLink))

        // Your code to run since DOM is loaded and ready
    });
</script>
<script src="js/script.js"></script>
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
</body>
</html>
