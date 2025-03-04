<%--
  Created by IntelliJ IDEA.
  User: iaazi
  Date: 04/03/2025
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: iaazi
  Date: 04/03/2025
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <nav class="navbar navbar-expand-lg">
        <div class="container-fluid">
            <!-- Navbar brand -->
            <a class="navbar-brand h1 mb-0 " href="#">JobConnect</a>

            <!-- Navbar toggler -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon "></span>
            </button>

            <!-- Collapsible content -->
            <div class="collapse navbar-collapse ps-3" id="navbarNav">
                <ul class="navbar-nav">

                    <li class="nav-item">
                        <a class="nav-link" href="Appointement">offre dʼemploi </a>
                    </li>
                </ul>

                <section class="btns d-flex justify-content-end w-75">
                    <button class="m-2 rounded-1 btn-signup" >
                        <a id="register" class="nav-link" href="Register.jsp">Register</a>
                    </button>
                    <button class="m-2 rounded-1 btn-login" href="login"  >
                        <a id="login" class="nav-link" href="Login.jsp">login</a>


                    </button>
                </section>


                <section class="btns d-flex justify-content-end w-75">
                    <button class="m-2  btn-logout" >
                        <a id="logoutt" class="nav-link" href="" onclick="logout()">logout</a>
                    </button>



                </section>



            </div>
        </div>
    </nav>
</header>

