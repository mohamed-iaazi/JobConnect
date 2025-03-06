<%--
  Created by IntelliJ IDEA.
  User: iaazi
  Date: 05/03/2025
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


    <div class="container">
    <div class="row">
        <div class="col-lg-10 mx-auto mb-4">
            <div class="section-title text-center ">
                <h3 class="top-c-sep">Trouver Votre Emploi</h3>
                <p>Trouvez votre emploi maintenant dans JobConnect </p>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-10 mx-auto">
            <div class="career-search mb-60">

                <form action="#" class="career-form mb-60">
                    <div class="row">
                        <div class="col-md-6 col-lg-3 my-3">
                            <div class="input-group position-relative">
                                <input type="text" class="form-control" placeholder="Enter Your Keywords" id="keywords">
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3 my-3">
                            <div class="select-container">
                                <select class="custom-select">
                                    <option selected="">Location</option>
                                    <option value="1">Canada</option>
                                    <option value="2">France</option>
                                    <option value="3">Maroc</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3 my-3">
                            <div class="select-container">
                                <select class="custom-select">
                                    <option selected="">Select Job Type</option>
                                    <option value="1">Ui designer</option>
                                    <option value="2">JS developer</option>
                                    <option value="3">Web developer</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-3 my-3">
                            <button type="button" class="btn btn-lg btn-block btn-light btn-custom" id="contact-submit">
                                Search
                            </button>
                        </div>
                    </div>
                </form>

                <div class="filter-result">
                    <p class="mb-30 ff-montserrat">Total Job Openings : ${listOffer.size()}</p>
                    <c:forEach var="offer" items="${listOffer}"   >
               <div class="job-box d-md-flex align-items-center justify-content-between mb-30">
                        <div class="job-left my-4 d-md-flex align-items-center flex-wrap">
                            <div class="img-holder mr-md-4 mb-md-0 mb-4 mx-auto mx-md-0 d-md-none d-lg-flex">
                                FD
                            </div>
                            <div class="job-content">
                                <h5 name="title" class="text-center text-md-left">${offer.titre}</h5>
                                <ul class="d-md-flex flex-wrap text-capitalize ff-open-sans">
                                    <li class="me-2 d-block w-100">
                                        <p  name="description" style="font-weight: normal ;">${offer.description}</p>
                                    </li>


                                        <li class="mr-md-4 ">
                                           <span style="color: black ; font-weight: bold"> Date De Publication : </span>${offer.date_publication}
                                        </li>
                                </ul>
                            </div>
                        </div>
                        <div class="job-right my-4 flex-shrink-0">
                            <a href="#" class="btn d-block w-100 d-sm-inline-block btn-success">Apply now</a>
                        </div>
                    </div>

                    </c:forEach>
            <!-- START Pagination -->
            <nav aria-label="Page navigation">
                <ul class="pagination pagination-reset justify-content-center">
                    <li class="page-item disabled">
                        <a class="page-link" href="#" tabindex="-1" aria-disabled="true">
                            <i class="zmdi zmdi-long-arrow-left"></i>
                        </a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item d-none d-md-inline-block"><a class="page-link" href="#">2</a></li>
                    <li class="page-item d-none d-md-inline-block"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#">...</a></li>
                    <li class="page-item"><a class="page-link" href="#">8</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#">
                            <i class="zmdi zmdi-long-arrow-right"></i>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- END Pagination -->
        </div>
    </div>


</div>
    </div>
    </div>