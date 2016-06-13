<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Apricot 1.3</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/loader-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/profile.css">


    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/timepicker/bootstrap-timepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/datepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/clockface.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datetimepicker.css">

    <link href="${pageContext.request.contextPath}/assets/js/colorPicker/bootstrap-colorpicker.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/js/validate/validate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/js/idealform/css/jquery.idealforms.css" rel="stylesheet">



    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/ico/minus.png">
</head>

<body>
    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>

    <!--  PAPER WRAP -->
    <div class="wrap-fluid">

            <!-- CONTENT -->

            <!-- BREADCRUMB -->
            <ul id="breadcrumb">
                <li>
                    <span class="entypo-home"></span>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">Extra Pages</a>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">Blank Page</a>
                </li>
                <li class="pull-right">
                    <div class="input-group input-widget">

                        <input style="border-radius:15px" type="text" placeholder="Search..." class="form-control">
                    </div>
                </li>
            </ul>

            <!-- END OF BREADCRUMB -->


            <div class="content-wrap">
                
                <div class="row">
				
				<div class="col-sm-3">
				
				</div>
				<div class="col-sm-6"  id="profileShow">
                    <!-- Profile -->
                        <div class="well profile">
                            <div class="col-sm-12">
                                <div class="col-xs-12 col-sm-4 text-center">

                                    <ul class="list-group">
                                        <li class="list-group-item text-left">
                                            <span class="entypo-user"></span>&nbsp;&nbsp;Profile</li>
                                        <li class="list-group-item text-center">
                                            <img src="http://api.randomuser.me/portraits/men/10.jpg" alt="" class="img-circle img-responsive img-profile">

                                        </li>
                                        <li class="list-group-item text-center">
                                            <span class="pull-left">
                                                <strong>热度</strong>
                                            </span>


                                            <div class="ratings">

                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star"></span>
                                                </a>
                                                <a href="#">
                                                    <span class="fa fa-star-o"></span>
                                                </a>

                                            </div>


                                        </li>

                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>入伙</strong>
                                            </span>${account.personCreateTime}</li>
                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>上次登录</strong>
                                            </span>${account.personLastTime}</li>
                                        <li class="list-group-item text-right">
                                            <span class="pull-left">
                                                <strong>昵称</strong>
                                            </span>${account.personNickname}</li>

                                    </ul>

                                    <button class="btn btn-info btn-block" id="editProfileBN"><span class="fa fa-user"></span>&nbsp;&nbsp;Edit Profile</button>
                                </div>
                                <div class="col-xs-12 col-sm-8 profile-name">
                                    <h2>${account.personNickname}
                                        <span class="pull-right social-profile">
                                            <i class="entypo-facebook-circled"></i>  <i class="entypo-twitter-circled"></i>  <i class="entypo-linkedin-circled"></i>  <i class="entypo-github-circled"></i>  <i class="entypo-gplus-circled"></i>
                                        </span>
                                    </h2>
                                    <hr>

                                    <dl class="dl-horizontal-profile">
                                        <dt>账号</dt>
                                        <dd>${account.personAccountNum}</dd>

                                        <dt>个性签名</dt>
                                        <dd>${account.personSignature}</dd>

                                        <dt>等级</dt>
                                        <dd>${account.personGrade}</dd>

                                        <dt>积分</dt>
                                        <dd>${account.personIntegration}</dd>

                                        <dt>性别</dt>
                                        <dd>${account.personSex}</dd>

                                        <dt>生日</dt>
                                        <dd>${account.personBirthday}</dd>

                                        <dt>星座</dt>
                                        <dd>${account.personConstellation}</dd>

                                        <dt>邮箱</dt>
                                        <dd>${account.personEmail}</dd>

                                        <dt>手机</dt>
                                        <dd>${account.personPhone}</dd>

                                        <dt>学校</dt>
                                        <dd>${account.personSchool}</dd>

                                        <dt>公司</dt>
                                        <dd>${account.personCompany}</dd>

                                        <dt>家庭地址</dt>
                                        <dd>${account.personAddress}</dd>

                                        <dt>邮编</dt>
                                        <dd>${account.personPostcode}</dd>



                                        <dt>绝技</dt>
                                        <dd>
                                            <span class="tags">html5</span>
                                            <span class="tags">css3</span>
                                            <span class="tags">jquery</span>
                                            <span class="tags">bootstrap3</span>
                                        </dd>

                                    </dl>


                                    <hr>





                                </div>

                            </div>
                            <div class="col-xs-12 divider text-center">
                                <div class="col-xs-12 col-sm-4 emphasis">
                                    <h2>
                                        <strong>20,7K</strong>
                                    </h2>
                                    <p>
                                        <small>Followers</small>
                                    </p>
                                    <button class="btn btn-success btn-block">
                                        <span class="fa fa-plus-circle"></span>&nbsp;&nbsp;Follow</button>
                                </div>
                                <div class="col-xs-12 col-sm-4 emphasis">
                                    <h2>
                                        <strong>245</strong>
                                    </h2>
                                    <p>
                                        <small>Following</small>
                                    </p>
                                    <button class="btn btn-info btn-block">
                                        <span class="fa fa-user"></span>&nbsp;&nbsp;View Profile</button>
                                </div>
                                <div class="col-sm-4 emphasis">
                                    <h2>
                                        <strong>43</strong>
                                    </h2>
                                    <p>
                                        <small>Likes</small>
                                    </p>
                                    <button class="btn btn-default btn-block">
                                        <span class="fa fa-user"></span>&nbsp;&nbsp;Likes</button>
                                </div>
                            </div>
                        </div>




					</div>

                <div class="col-sm-6" style="display: none" id="profileEdit">
                        <!-- BLANK PAGE-->

                        <div style="margin:-20px 15px;" class="nest" id="Blank_PageClose">
                            <div class="title-alt">
                                <h6>
                                    <span class="entypo-user"></span>&nbsp;&nbsp;Profile</h6>


                            </div>

                            <div class="body-nest" id="Blank_Page_Content">




                                <div class="row">


                                    <!-- left column -->
                                    <div class="col-md-3">
                                        <div class="text-center">
                                            <img src="http://api.randomuser.me/portraits/men/10.jpg" class="avatar img-circle" alt="avatar">
                                            <h6>Upload a different photo...</h6>

                                            <div class="input-group">
                                                    <span class="input-group-btn">
                                                        <span class="btn btn-primary btn-file">
                                                            Browse
                                                            <input type="file" multiple="">
                                                        </span>
                                                    </span>
                                                <input type="text" class="form-control">
                                            </div>

                                        </div>
                                    </div>

                                    <!-- edit form column -->
                                    <div class="col-md-9 personal-info">
                                        <div class="alert alert-info alert-dismissable">
                                            <a class="panel-close close" data-dismiss="alert">×</a>
                                            <i class="fa fa-coffee"></i>
                                            This is an
                                            <strong>.alert</strong>. Use this to show important messages to the user.
                                        </div>
                                        <h3>Personal info</h3>

                                        <form class="form-horizontal" role="form" action="Hoole_account_modify" method="post">
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">昵称：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personNickname}" type="text" name="personNickname">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">个性签名：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personSignature}" type="text" name="personSinature">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">邮箱：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personEmail}" type="text" name="personEmail">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">手机：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personPhone}" type="text" name="personPhone">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">生日：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" id="dp1" value="${account.personBirthday}" type="text" name="personBirthday">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">学校：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personSchool}" type="text" name="personSchool">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">公司：</label>
                                                <div class="col-lg-8">
                                                    <input class="form-control" value="${account.personCompany}" type="text" name="personCompany">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-lg-3 control-label">Time Zone:</label>
                                                <div class="col-lg-8">
                                                    <div class="ui-select">
                                                        <select id="user_time_zone" class="form-control">
                                                            <option value="Hawaii">(GMT-10:00) Hawaii
                                                            <option value="Alaska">(GMT-09:00) Alaska
                                                            <option value="Pacific Time (US &amp; Canada)">(GMT-08:00) Pacific Time (US &amp; Canada)
                                                            <option value="Arizona">(GMT-07:00) Arizona
                                                            <option value="Mountain Time (US &amp; Canada)">(GMT-07:00) Mountain Time (US &amp; Canada)
                                                            <option value="Central Time (US &amp; Canada)" selected="selected">(GMT-06:00) Central Time (US &amp; Canada)
                                                            <option value="Eastern Time (US &amp; Canada)">(GMT-05:00) Eastern Time (US &amp; Canada)
                                                            <option value="Indiana (East)">(GMT-05:00) Indiana (East)
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">家庭地址：</label>
                                                <div class="col-md-8">
                                                    <input class="form-control" value="${account.personAddress}" type="text" name="personAddress">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">邮编：</label>
                                                <div class="col-md-8">
                                                    <input class="form-control" value="${account.personPostcode}" type="text" name="personPostcode">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="col-md-3 control-label"></label>
                                                <div class="col-md-8">
                                                    <input class="btn btn-primary" value="Save Changes" type="submit">
                                                    <span></span>
                                                    <input class="btn btn-default" value="Cancel" type="reset" id="cancelEditProfileBN">
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END OF BLANK PAGE -->

                <div class="col-sm-3">
        </div>
                </div>



              

                    </div>

                <!-- END OF PROFILE -->


                <!-- /END OF CONTENT -->

        <!--  END OF PAPER WRAP -->
    </div>





        <!-- MAIN EFFECT -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/preloader.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/app.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/load.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>


    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/colorPicker/bootstrap-colorpicker.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/inputMask/jquery.maskedinput.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/validate/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/idealform/jquery.idealforms.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/timepicker/bootstrap-timepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/clockface.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/datepicker/bootstrap-datetimepicker.js"></script>


        <script>
            <!--日期选择器-->
            $('#dp1').datepicker();
            <!-- show Or edit-->
            $('#editProfileBN').click(
                    function edit(){
                        $("#profileShow").css("display","none");
                        $("#profileEdit").removeAttr('style');
                    });
            $('#cancelEditProfileBN').click(
                    function cancelEdit(){
                        $("#profileEdit").css("display","none");
                        $("#profileShow").removeAttr('style');
                    });
        </script>

</body>

</html>
