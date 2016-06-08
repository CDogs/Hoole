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






    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
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
			
			
                <div class="col-md-4" style="display:none" id="login">
                    <div id="logo-login">
                        <h1>Hoole
                            <span>CDogs</span>
                        </h1>
                    </div>
					<div class="account-box" > 
                        <form role="form" action="1.htm" method="post">
                            <div class="form-group">
                                <!--a href="#" class="pull-right label-forgot">Forgot email?</a-->
                                <label for="inputUsernameEmail">邮箱/手机号/账号</label>
                                <input type="text" id="inputUsernameEmail" class="form-control">
                            </div>
                            <div class="form-group">
                                <a href="#" class="pull-right label-forgot">忘记密码？</a>
                                <label for="inputPassword">密码</label>
                                <input type="password" id="inputPassword" class="form-control">
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
                          
                            <center><span class="text-center login-with">Login or <a href="javascript:loginAndsignup()">Sign Up</a></span></center>
							
                        </div>
                        
                        <div class="row-block">
	                        <div class="row">
							
		                    </div>
                        </div>
                    </div>
					
                </div>
				
				 <div class="col-md-4" id="signup">
                    <div id="logo-login">
                        <h1>Hoole
                            <span>CDogs</span>
                        </h1>
                    </div>
					<div class="account-box" > 
                        <form role="form" action="1.htm" method="post">
							<div class="form-group well">
									<input type="text" class="form-control" name="email" id="email" placeholder="邮箱/手机号">

							</div>
                            <div class="form-group well">
								<input type="password" id="inputPassword" class="form-control" placeholder="密码">
                            </div>
							
							<div class="form-group well">
								<input type="text" class="form-control" id="dp1" placeholder="生日：06/08/2016">
							</div>

                            <button class="btn btn btn-primary pull-right" type="submit">
                                注 册
                            </button>
							
                        </form>
						

						<div class="or-box">
                          
                           <center><span class="text-center login-with"><a href="javascript:loginAndsignup()">Login</a> or Sign Up</span></center>
							
                        </div>
                        
                        <div class="row-block">
	                        <div class="row">
							
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
		function loginAndsignup(){
		if($("#login").attr('style')){
			$("#signup").css("display","none");
			$("#login").removeAttr('style');
		
		}else{
			$("#login").css("display","none");
			$("#signup").removeAttr('style');
		}
			
		}
	</script>
	
	








</body>

</html>
