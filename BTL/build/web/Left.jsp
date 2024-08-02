
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
                    <div class="card bg-light mb-3">
                        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i>  Các Loại Phòng</div>
                        <ul class="list-group category_block">
                            <c:forEach items="${listM}" var="o">
                                <li class="list-group-item text-white ${tag == o.idMucLuc ? "active" : ""}"><a href="mucluc?mid=${o.idMucLuc}">${o.tenMucLuc}</a></li>
                            </c:forEach>

                        </ul>
                    </div>
                    <div class="card bg-light mb-3">
                        <div class="card-header bg-success text-white text-uppercase">Phòng Ưu Đãi</div>
                        <div class="card-body">
                            <img class="img-fluid" src="${p.image}" />
                            <h5 class="card-title">${p.tenPhong}</h5>
                            <p class="card-text">${p.loaiPhong}</p>
                            <p class="bloc_left_price">${p.donGia} $</p>
                        </div>
                    </div>
                </div>