<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>Order</title>
    </head>
    <body>
    	<jsp:include page="Menu.jsp"></jsp:include>
        <div id="logreg-forms">
            <form class="form-signin" action="datphong" method="post">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Điền thông tin của bạn</h1>
              
                <label for="name">Họ và tên</label>
                <input name="name" value="${tenKH}" type="text" id="name" class="form-control" placeholder="Họ và tên" required="" autofocus="">
                 <label for="phoneNumber">Số điện thoại</label>
                 <input name="phoneNumber" value="${sdtKH}" type="text" id="phoneNumber" class="form-control" placeholder="Số điện thoại" required="" autofocus="">
                <label for="email">Email</label>
                <input name="email" value="${emailKH}" type="text" id="email" class="form-control" placeholder="email" required="" autofocus="">
                <label for="deliveryAddress">Số CCCD/CMND</label>
                <input name="citizen" value="${citizenKH}" type="text" id="citizen" class="form-control" placeholder="Số CCCD/CMND" required="" autofocus="">
                <label for="checkin">Ngày nhận phòng</label>
                <p style="color: red;">${mess1}</p>
                <input name="checkin" value="${checkin}" type="text" id="checkin" class="form-control" placeholder="MM-DD-YYYY" required="" autofocus="">
                <label for="checkout">Ngày Trả phòng</label>
                <p style="color: red;">${mess2}</p>
                <input name="checkout" value="${checkout}" type="text" id="checkout" class="form-control" placeholder="MM-DD-YYYY" required="" autofocus="">
                <input name ="idphong" value="${idphong}" type="hidden">
                <label for="checkout">Vui lòng trả trước $ 200 tiền cọc, ghi tên phòng vào nội dung chuyển khoản. Hãy kiểm tra lại thông tin trước khi chuyển tiền</label>
                 <img class="card-img-top" src="data:image/png;base64,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" alt="Card image cap">
                <button class="btn btn-success btn-block" type="submit"><i class="fas fa-american-sign-language-interpreting"></i>Dat Hang</button>
                
            </form>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!--<script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle() // display:block or none
                $('#logreg-forms .form-reset').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle(); // display:block or none
                $('#logreg-forms .form-signup').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
                $('#logreg-forms #cancel_reset').click(toggleResetPswd);
                $('#logreg-forms #btn-signup').click(toggleSignUp);
                $('#logreg-forms #cancel_signup').click(toggleSignUp);
            })
            
            window.addEventListener("load",function loadAmountCart(){
                        	 $.ajax({
                                 url: "/WebsiteBanGiay/loadAllAmountCart",
                                 type: "get", //send it through get method
                                 data: {
                                     
                                 },
                                 success: function (responseData) {
                                     document.getElementById("amountCart").innerHTML = responseData;
                                 }
                             });
                        },false);         
        </script>-->
    </body>
</html>