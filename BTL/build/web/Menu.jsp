
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="home">Trang chủ</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul class="navbar-nav m-auto">
                        <c:if test ="${sessionScope.acc.isAdmin == 1}">
                            <li class="nav-item">
                                <a class="nav-link" href="hopdong">Quản lý Hợp đồng</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="quanly">Quản lý Phòng</a>
                            </li>
                        </c:if>
                        
                        <c:if test ="${sessionScope.acc != null}">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Xin chào ${sessionScope.acc.username}</a>
                            </li>
                            <li class="nav-item">
                             <a class="nav-link" href="dangxuat">Đăng xuất</a>
                            </li>
                        </c:if>
                        <c:if test ="${sessionScope.acc == null}">
                            <li class="nav-item">
                                <a class="nav-link" href="Login.jsp">Đăng nhập</a>
                            </li>
                        </c:if>
                        
                    </ul>

                 
                </div>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Chào Mừng Bạn đến với Khách Sạn VIP</h1>
                <p class="lead text-muted mb-0">Các loại phòng cho thuê sẽ làm bạn hài lòng với tất cả các dịch vụ</p>
            </div>
        </section>
        <!--end of menu-->