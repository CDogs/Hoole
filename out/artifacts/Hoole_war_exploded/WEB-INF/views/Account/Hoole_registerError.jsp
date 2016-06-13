<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <title>Hoole 1.3</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>

    <!--  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/loader-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/signin.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/media.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/social.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/timepicker/bootstrap-timepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/datepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/clockface.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datetimepicker.css">

    <link href="${pageContext.request.contextPath}/assets/js/colorPicker/bootstrap-colorpicker.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/js/validate/validate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/js/idealform/css/jquery.idealforms.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/assets/js/switch/bootstrap-switch.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/assets/js/iCheck/flat/all.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/js/iCheck/line/all.css" rel="stylesheet">




    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/ico/minus.png">
</head>

<body>


<div class="container">



    <div class="" id="login-wrapper">
        <div class="row">
            <div class="col-md-8">
                <div class="blog-list-nest">
                    <div class="vendor">
                        <blockquote>
                            <p>"How can we win when fools can be king"</p>
                            <p>
                                <small>Mattew Bellamy</small>
                            </p>
                        </blockquote>
                    </div>

                    <div class="blog-list-content">
                        <h2>Muse</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. Aliquam in felis sit amet augue.</p>

                        <p class="pull-right">
                            <span class="label label-default">keyword</span>
                            <span class="label label-default">tag</span>
                            <span class="label label-default">post</span>
                        </p>
                        <ul class="list-inline">
                            <li>
                                <a href="#">
                                    <span class="entypo-network"></span>&nbsp;2 Days Ago</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-chat"></span>&nbsp;2 Comments</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-share"></span>&nbsp;14 Shares</a>
                            </li>
                        </ul>
                        <hr>

                    </div>
                </div>

            </div>


            <div class="col-md-4"  id="login" style="display:none">
                <div id="logo-login">
                    <h1>Hoole
                        <span>CDogs</span>
                    </h1>
                </div>
                <div class="account-box" >
                    <form role="form" action="Hoole_account_login" method="post">
                        <div class="form-group">
                            <!--a href="#" class="pull-right label-forgot">Forgot email?</a-->
                            <label for="inputUsernameEmail">邮箱/手机号/账号</label>
                            <input type="text" id="inputUsernameEmail" class="form-control" name="accountname">
                        </div>
                        <div class="form-group">
                            <a href="#" class="pull-right label-forgot">忘记密码？</a>
                            <label for="inputPassword">密码</label>
                            <input type="password" id="inputPassword" class="form-control" name="password">
                        </div>
                        <div class="checkbox pull-left">
                            <label>
                                <input type="checkbox">记住账号</label>
                        </div>
                        <button class="btn btn btn-primary pull-right" type="submit">
                            登 录
                        </button>
                    </form>
                    <a class="forgotLnk" href="index.html"></a>
                    <div class="or-box">

                        <center><span class="text-center login-with">Login or <a href="javascript:loginOrregister()">Register</a></span></center>

                    </div>

                    <div class="row-block">
                        <div class="row">

                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4" id="register" >
                <div id="logo-login">
                    <h1>Hoole
                        <span>CDogs</span>
                    </h1>
                </div>
                <div class="account-box" >
                    <form role="form" action="Hoole_account_register" method="post">
                        <div class="form-group ">
                            <input type="text" class="form-control" name="accountname" id="email" placeholder="邮箱/手机号">

                        </div>
                        <div class="form-group ">
                            <input type="password"  class="form-control" placeholder="密码" name="password">
                        </div>

                        <div class="form-group ">
                            <input type="text" class="form-control" id="dp1" placeholder="生日：06/08/2016" name="birthday">
                        </div>
                        <div class="form-group pull-left">
                            <span class="label label-info">性别</span>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            <input tabindex="19" type="radio" id="line-radio-1" name="sex" checked=”“ value="男">
                            <span for="line-radio-1" class="badge ">男</span>
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            <input tabindex="19" type="radio" id="line-radio-2" name="sex" value="女">
                            <span  for="line-radio-2" class="badge ">女</span>
                        </div>


                        <button class="btn btn btn-primary pull-right" type="submit">
                            注 册
                        </button>

                    </form>


                    <div class="or-box">

                        <center><span class="text-center login-with"><a href="javascript:loginOrregister()">Login</a> or Register</span></center>

                    </div>

                    <div class="row-block">
                        <div class="row">
                            <span style="color: orangered">${registerError}</span>
                        </div>
                    </div>
                </div>

            </div>

        </div>


    </div>



</div>




<!--  END OF PAPER WRAP -->




<!-- MAIN EFFECT -->

<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/app.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/load.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>


<!-- /MAIN EFFECT -->


<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/colorPicker/bootstrap-colorpicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/inputMask/jquery.maskedinput.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/switch/bootstrap-switch.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/validate/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/idealform/jquery.idealforms.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/timepicker/bootstrap-timepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/clockface.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datetimepicker.js"></script>



<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tag/jquery.tagsinput.js"></script>

<script type="text/javascript">
    $('#dp1').datepicker();
    <!-- login Or register-->
    function loginOrregister(){
        if($("#login").attr('style')){
            $("#register").css("display","none");
            $("#login").removeAttr('style');

        }else{
            $("#login").css("display","none");
            $("#register").removeAttr('style');
        }

    }
</script>










</body>

</html>
