<%--
  Created by IntelliJ IDEA.
  User: iaazi
  Date: 05/03/2025
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header" id="header">
  <div class="header_toggle"> <i class='bx bx-menu' id="header-toggle"></i> </div>
  <div class="header_img"><i class="bi bi-person-circle"></i></div>
</header>
<div class="l-navbar" id="nav-bar">
  <nav class="nav">
    <div> <a href="#" class="nav_logo"> </i> <span class="nav_logo-name"><img style="width: 130px;" src="https://images2.imgbox.com/70/8e/0EuyS7AG_o.png" alt=""></span> </a>
      <div class="nav_list"> <a href="#" class="nav_link active"> <i class='bx bxs-dashboard nav_icon'></i> <span class="nav_name">Candidate</span> </a>
        <a href="#" class="nav_link"> <i class='bx bx-list-ul nav_icon'></i><span class="nav_name">MyCandidature</span> </a>
      </div>
    </div> <a href="#" class="nav_link"> <i class='bx bx-log-out nav_icon'></i> <span class="nav_name">SignOut</span> </a>
  </nav>
</div>
<!--Container Main start-->
<div class="height-100 light">
  <div class="container">
    <div class="row">
      <div class="col-lg-4">
        <section class="offre">
          <%@include file="../component/card.jsp"%>
        </section>
      </div>
    </div>
  </div>
</div>


