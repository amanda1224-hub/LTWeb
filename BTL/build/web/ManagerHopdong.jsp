<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Khánh Sạn VIP</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Quản lý <b>Hợp đồng</b></h2>
                        </div>
                        
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>idKH</th>
                            <th>idPhong</th>
                            <th>Tên KH</th>
                            <th>SDT</th>
                            <th>Email</th>
                            <th>CCCD/CMND</th>
                            <th>Check in</th>
                            <th>Check out</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listHD}" var="o">
                            <tr>
                                <td>${o.idHD}</td>
                                <td>${o.idKH}</td>
                                <td>
                                    ${o.idphong}
                                </td>
                                <td>${o.tenKH}</td>
                                <td>${o.sdtKH}</td><!-- comment -->
                                <td>${o.emailKH}</td>
                                <td>${o.citizenKH}</td> 
                                <td>${o.checkin}</td>
                                <td>${o.checkout}</td>
                                <td>
                                    
                                    <a href="huyhopdong?idHD=${o.idHD}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Hủy">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <a href="home"> <button type="button" class="btn btn-primary">Back to home</button></a>
        </div>
      
     
      
        <script src="js/manager.js" type="text/javascript"></script>
       
    </body>
</html>