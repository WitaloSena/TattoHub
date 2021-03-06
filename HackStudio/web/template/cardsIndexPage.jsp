<%-- 
    Document   : 
    Created on : 20/05/2019, 21:51:51
    Author     : witalo
--%>

<!-- Breadcrumbs-->
<ol class="breadcrumb">
    <li class="breadcrumb-item">
        <a href="index.jsp">Dashboard</a>
    </li>
    <li class="breadcrumb-item active">Admin Page <%request.getAttribute("email"); %></li>
</ol>

<div class="row justify-content-center">
    <div class="col-xl-3 col-sm-6 mb-3">
        <div class="card text-white bg-primary o-hidden h-100">
            <div class="card-body">
                <div class="card-body-icon">
                    <i class="fas fa-fw fa-comments"></i>
                </div>
                <div class="mr-5">Tatuadores</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="tatuadores?acao=todos">
                <span class="float-left">Detalhes</span>
                <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                </span>
            </a>
        </div>
    </div>
    <div class="col-xl-3 col-sm-6 mb-3">
        <div class="card text-white bg-warning o-hidden h-100">
            <div class="card-body">
                <div class="card-body-icon">
                    <i class="fas fa-fw fa-list"></i>
                </div>
                <div class="mr-5">Clientes</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="clientes?acao=todos">
                <span class="float-left">Detalhes</span>
                <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                </span>
            </a>
        </div>
    </div>
    <div class="col-xl-3 col-sm-6 mb-3">
        <div class="card text-white bg-success o-hidden h-100">
            <div class="card-body">
                <div class="card-body-icon">
                    <i class="fas fa-fw fa-shopping-cart"></i>
                </div>
                <div class="mr-5">Estoque</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="estoque?acao=todos">
                <span class="float-left">Detalhes</span>
                <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                </span>
            </a>
        </div>
    </div>
    <!-- <div class="col-xl-3 col-sm-6 mb-3">
         <div class="card text-white bg-danger o-hidden h-100">
             <div class="card-body">
                 <div class="card-body-icon">
                     <i class="fas fa-fw fa-life-ring"></i>
                 </div>
                 <div class="mr-5">13 New Tickets!</div>
             </div>
             <a class="card-footer text-white clearfix small z-1" href="#">
                 <span class="float-left">View Details</span>
                 <span class="float-right">
                     <i class="fas fa-angle-right"></i>
                 </span>
             </a>
         </div> -->
</div>
</div>
</div>
