<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Hoole </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/loader-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/social.css">






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
    <!-- TOP NAVBAR -->
    <nav role="navigation" class="navbar navbar-static-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="entypo-menu"></span>
                </button>
                <button class="navbar-toggle toggle-menu-mobile toggle-left" type="button">
                    <span class="entypo-list-add"></span>
                </button>




                <div id="logo-mobile" class="visible-xs">
                   <h1>Hoole<span>v1.3</span></h1>
                </div>

            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">

                    <li class="dropdown">

                        <a data-toggle="dropdown" class="dropdown-toggle" href="#"><i style="font-size:20px;" class="icon-conversation"></i><div class="noft-red">23</div></a>


                        <ul style="margin: 11px 0 0 9px;" role="menu" class="dropdown-menu dropdown-wrap">
                            <li>
                                <a href="#">
                                    <img alt="" class="img-msg img-circle" src="http://api.randomuser.me/portraits/thumb/men/1.jpg">Jhon Doe <b>Just Now</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <img alt="" class="img-msg img-circle" src="http://api.randomuser.me/portraits/thumb/women/1.jpg">Jeniffer <b>3 Min Ago</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <img alt="" class="img-msg img-circle" src="http://api.randomuser.me/portraits/thumb/men/2.jpg">Dave <b>2 Hours Ago</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <img alt="" class="img-msg img-circle" src="http://api.randomuser.me/portraits/thumb/men/3.jpg"><i>Keanu</i>  <b>1 Day Ago</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <img alt="" class="img-msg img-circle" src="http://api.randomuser.me/portraits/thumb/men/4.jpg"><i>Masashi</i>  <b>2 Mounth Ago</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div>See All Messege</div>
                            </li>
                        </ul>
                    </li>
                    <li>

                        <a data-toggle="dropdown" class="dropdown-toggle" href="#"><i style="font-size:19px;" class="icon-warning tooltitle"></i><div class="noft-green">5</div></a>
                        <ul style="margin: 12px 0 0 0;" role="menu" class="dropdown-menu dropdown-wrap">
                            <li>
                                <a href="#">
                                    <span style="background:#DF2135" class="noft-icon maki-bus"></span><i>From Station</i>  <b>01B</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <span style="background:#AB6DB0" class="noft-icon maki-ferry"></span><i>Departing at</i>  <b>9:00 AM</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <span style="background:#FFA200" class="noft-icon maki-aboveground-rail"></span><i>Delay for</i>  <b>09 Min</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <span style="background:#86C440" class="noft-icon maki-airport"></span><i>Take of</i>  <b>08:30 AM</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <span style="background:#0DB8DF" class="noft-icon maki-bicycle"></span><i>Take of</i>  <b>08:30 AM</b>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <div>See All Notification</div>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#"><i data-toggle="tooltip" data-placement="bottom" title="Help" style="font-size:20px;" class="icon-help tooltitle"></i></a>
                    </li>

                </ul>
                <div id="nt-title-container" class="navbar-left running-text visible-lg">
                    <ul class="date-top">
                        <li class="entypo-calendar" style="margin-right:5px"></li>
                        <li id="Date"></li>


                    </ul>

                    <ul id="digital-clock" class="digital">
                        <li class="entypo-clock" style="margin-right:5px"></li>
                        <li class="hour"></li>
                        <li>:</li>
                        <li class="min"></li>
                        <li>:</li>
                        <li class="sec"></li>
                        <li class="meridiem"></li>
                    </ul>
                    <ul id="nt-title">
                        <li><i class="wi-day-lightning"></i>&#160;&#160;Berlin&#160;
                            <b>85</b><i class="wi-fahrenheit"></i>&#160;; 15km/h
                        </li>
                        <li><i class="wi-day-lightning"></i>&#160;&#160;Yogyakarta&#160;
                            <b>85</b><i class="wi-fahrenheit"></i>&#160;; Tonight- 72 °F (22.2 °C)
                        </li>

                        <li><i class="wi-day-lightning"></i>&#160;&#160;Sttugart&#160;
                            <b>85</b><i class="wi-fahrenheit"></i>&#160;; 15km/h
                        </li>

                        <li><i class="wi-day-lightning"></i>&#160;&#160;Muchen&#160;
                            <b>85</b><i class="wi-fahrenheit"></i>&#160;; 15km/h
                        </li>

                        <li><i class="wi-day-lightning"></i>&#160;&#160;Frankurt&#160;
                            <b>85</b><i class="wi-fahrenheit"></i>&#160;; 15km/h
                        </li>

                    </ul>
                </div>

                <ul style="margin-right:0;" class="nav navbar-nav navbar-right">
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <img alt="" class="admin-pic img-circle" src="http://api.randomuser.me/portraits/thumb/men/10.jpg">Hi,${account.personNickname } <b class="caret"></b>
                        </a>
                        <ul style="margin-top:14px;" role="menu" class="dropdown-setting dropdown-menu">
                            <li>
                                <a href="Hoole_account_profile">
                                    <span class="entypo-user"></span>&#160;&#160;My Profile</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-vcard"></span>&#160;&#160;Account Setting</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-lifebuoy"></span>&#160;&#160;Help</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="http://themeforest.net/item/apricot-navigation-admin-dashboard-template/7664475?WT.ac=category_item&WT.z_author=themesmile">
                                    <span class="entypo-basket"></span>&#160;&#160; Purchase</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="icon-gear"></span>&#160;&#160;Setting</a>
                        <ul role="menu" class="dropdown-setting dropdown-menu">

                            <li class="theme-bg">
                                <div id="button-bg"></div>
                                <div id="button-bg2"></div>
                                <div id="button-bg3"></div>
                                <div id="button-bg5"></div>
                                <div id="button-bg6"></div>
                                <div id="button-bg7"></div>
                                <div id="button-bg8"></div>
                                <div id="button-bg9"></div>
                                <div id="button-bg10"></div>
                                <div id="button-bg11"></div>
                                <div id="button-bg12"></div>
                                <div id="button-bg13"></div>
                            </li>
                        </ul>
                    </li>
                    <li class="hidden-xs">
                        <a class="toggle-left" href="#">
                            <span style="font-size:20px;" class="entypo-list-add"></span>
                        </a>
                    </li>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- /END OF TOP NAVBAR -->

    <!-- SIDE MENU -->
	
    <div id="skin-select">
        <div id="logo">
         <h1>Hoole<span>v1.3</span></h1>
        </div>
        <!-- 皮肤按钮 -->
        <a id="toggle" >
            <span class="entypo-menu"></span>
        </a>
        <div class="dark">
            <form action="#">
                <span>
                    <input type="text" name="search" value="" class="search rounded id_search" placeholder="Search Menu..." autofocus="">
                </span>
            </form>
        </div>

        <div class="search-hover">
            <form id="demo-2">
                <input type="search" placeholder="Search Menu..." class="id_search">
            </form>
        </div>

        <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar">
                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="widget-menu"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="#" title="Blog App">
                                <i class="icon-document-edit"></i>
                                <span>Blog App</span>

                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="blog-list.html" title="Blog List"><i class="entypo-doc-text"></i><span>Blog List</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="blog-detail.html" title="Blog Detail"><i class="entypo-newspaper"></i><span>Blog Details</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="social.html" title="Social">
                                <i class="icon-feed"></i>
                                <span>Social</span>

                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="media.html" title="Media">
                                <i class="icon-camera"></i>
                                <span>Media</span>

                            </a>
                        </li>
                    </ul>

                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="design-kit"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="index.html" title="Dashboard">
                                <i class="icon-window"></i>
                                <span>Dashboard</span>

                            </a>
                        </li>
                        <li>
                            <a class="tooltip-tip ajax-load" href="3.htm" title="Mail">
                                <i class="icon-mail"></i>
                                <span>mail</span>
                                <div class="noft-blue">289</div>
                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="icon.html" title="Icons">
                                <i class="icon-preview"></i>
                                <span>Icons</span>
                                <div class="noft-blue" style="display: inline-block; float: none;">New</div>
                            </a>
                        </li>

                        <li>
                            <a class="tooltip-tip" href="#" title="Extra Pages">
                                <i class="icon-document-new"></i>
                                <span>Extra Page</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="blank_page.html" title="Blank Page"><i class="icon-media-record"></i><span>Blank Page</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="profile.html" title="Profile Page"><i class="icon-user"></i><span>Profile Page</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="invoice.html" title="Invoice"><i class="entypo-newspaper"></i><span>Invoice</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="pricing_table.html" title="Pricing Table"><i class="fontawesome-money"></i><span>Pricing Table</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="5.htm" title="Time Line"><i class="entypo-clock"></i><span>Time Line</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="404.html" title="404 Error Page"><i class="icon-thumbs-down"></i><span>404 Error Page</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="500.html" title="500 Error Page"><i class="icon-thumbs-down"></i><span>500 Error Page</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2" href="6.htm" title="Lock Screen"><i class="icon-lock"></i><span>Lock Screen</span></a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a class="tooltip-tip " href="login.html" title="login">
                                <i class="icon-download"></i>
                                <span>Login</span>
                            </a>
                        </li>

                    </ul>

                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="component"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>


                        <li>
                            <a class="tooltip-tip" href="#" title="UI Element">
                                <i class="icon-monitor"></i>
                                <span>UI Element</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="element.html" title="Element"><i class="icon-attachment"></i><span>Element</span></a>
                                </li>
                                <li><a class="tooltip-tip2 ajax-load" href="button.html" title="Button"><i class="icon-view-list-large"></i><span>Button</span> <div class="noft-blue-number">10</div></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="wizard.html" title="Tab & Accordion"><i class="icon-folder"></i><span>Wizard</span><div class="noft-purple-number">3</div></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="calendar.html" title="Calender"><i class="icon-calendar"></i><span>Calendar</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="tree.html" title="Tree View"><i class="icon-view-list"></i><span>Tree View</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="grids.html" title="Grids"><i class="icon-menu"></i><span>Grids</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="chart.html" title="Chart"><i class="icon-graph-pie"></i><span>Chart</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip ajax-load" href="typhography.html" title="Typhoghrapy">
                                        <i class="icon-information"></i>
                                        <span>Typhoghrapy</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="Form">
                                <i class="icon-document"></i>
                                <span>Form</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="form-element.html" title="Form Elements"><i class="icon-document-edit"></i><span>Form Elements</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="andvance-form.html" title="Andvance Form"><i class="icon-map"></i><span>Andvance Form</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="text-editor.html" title="Text Editor"><i class="icon-code"></i><span>Text Editor</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="file-upload.html" title="File Upload"><i class="icon-upload"></i><span>File Upload</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a class="tooltip-tip" href="#" title="Tables">
                                <i class="icon-view-thumb"></i>
                                <span>Tables</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="table-static.html" title="Table Static"><i class="entypo-layout"></i><span>Table Static</span></a>
                                </li>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="table-dynamic.html" title="Table Dynamic"><i class="entypo-menu"></i><span>Table Dynamic</span></a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a class="tooltip-tip ajax-load" href="map.html" title="Map">
                                <i class="icon-location"></i>
                                <span>Map</span>

                            </a>
                        </li>
                    </ul>


                </div>
            </div>
        </div>
    </div>
    <!-- END OF SIDE MENU -->



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
                <li><a href="#" title="Sample page 1">Home</a>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">Social</a>
                </li>
                <li class="pull-right">
                    <div class="input-group input-widget">

                        <input style="border-radius:15px" type="text" placeholder="Search..." class="form-control">
                    </div>
                </li>
            </ul>

            <!-- END OF BREADCRUMB -->

            <div class="social-wrap">
				<!-- 内容开始 -->
                <div class="row">
                    <!-- SOCIAL  LEFT CONTENT -->
					<div class="col-sm-3">

					<!-- 标签 -->
					  <div class="panel panel-default">
                            <div class="panel-facebook">
							<!--
                                <span class="entypo-facebook-circled middle-social"></span>
								-->
								<span class="middle-social">Hoo</span>
                            </div>
                            <div class="panel-body">
                                <p class="lead">Facebook Statistic</p>
                                <p class="social-follower">120k Followers, 900 Posts</p>

                                <p>
                                    <img src="http://api.randomuser.me/portraits/thumb/men/14.jpg" alt="" class="social-pic img-circle">
                                    <img src="http://api.randomuser.me/portraits/thumb/women/15.jpg" alt="" class="social-pic img-circle">

                                    <a href="#" class="link-social">
                                        <span class="entypo-link"></span>
                                    </a>
                                    <a href="#" class="link-social">
                                        <span class="entypo-mail"></span>
                                    </a>
                                </p>
                            </div>
                        </div>
						
						
						<!-- 发表栏 -->
						<form role="form" class="form-horizontal">
                        <h4>What's New</h4>
                        <div style="padding:14px;" class="form-group">
                            <textarea placeholder="Update your status" rows="5" class="form-update"></textarea>
                        </div>




                        <div class="btn-group pull-right">
                            <button type="button" class="btn btn-info btn-lg dropdown-toggle" data-toggle="dropdown">Post
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu">
                                <li>
                                    <a href="#">
                                        <span class="entypo-facebook-circled insta-color"></span>&nbsp;&nbsp;Facebook</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="entypo-twitter-circled tweet-link"></span>&nbsp;&nbsp;Twitter</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="entypo-instagrem insta-color"></span>&nbsp;&nbsp;Instagram</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="entypo-gplus-circled gplus-textcolor"></span>&nbsp;&nbsp;Google Plus</a>
                                </li>
                            </ul>
                        </div>




                        <ul class="list-inline">
                            <li><a href=""><i class="glyphicon glyphicon-upload"></i></a>
                            </li>
                            <li><a href=""><i class="glyphicon glyphicon-camera"></i></a>
                            </li>
                            <li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a>
                            </li>
                            <li><a href=""><i class="glyphicon glyphicon-link"></i></a>
                            </li>
                        </ul>
                    </form>
					</div>
                    <div class="col-sm-6">

						<!-- INSTAGRAM -->
                        <div class="panel panel-default">
                            <div class="panel-fb instagram-color">
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-heart"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-instagrem "></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-thumbnail">
                                <img class="img-responsive-social" alt="" src="${pageContext.request.contextPath}/assets/img/insta-pic.jpg">
                            </div>
                            <div class="panel-body">
                                <p class="lead">Hidden City
                                    <br><i>#china</i>  <i>#soldier</i>  <i>#culture</i>
                                </p>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a class="insta-color" href="#">
                                            <span class="entypo-heart"></span>26</a>Like's



                                    </div>
                                    <ul>
                                        <li>
                                            <img src="http://api.randomuser.me/portraits/thumb/women/45.jpg" class="img-social-content img-circle pull-left">
                                            <span><a class="insta-color" href="#">Dyah Pitaloka</a> Lagi liburan di Tionkok ya jeeuungg??
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>
                                    </ul>


                                </div>
                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" class="form-control" placeholder="Add a comment..">
                                    </div>
                                </form>


                            </div>
                        </div>
						<!-- END OF INSTAGRAM -->




                        <!-- GPLUS -->
                        <div class="panel panel-default">
                            <div class="panel-fb gplus-color">
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-plus-circled"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-gplus-circled"></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-body">
                                <img class="img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/women/30.jpg">
                                <div class="social-profile">
                                    <h3> <a class="gplus-textcolor" href="#">Rubi Castello</a>
                                        <span><i class="entypo-globe"></i>&nbsp;38 Minute ago</span>
                                    </h3>
                                    <p>#4: Time Shuttle To Londa, Tana Toraja <a class="gplus-textcolor" href="#"/>
                                    </p>
                                
								</div>

                                <div class="clearfix"></div>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a class="gplus-textcolor" href="#" class="">
                                            <span class="entypo-foward"></span>+1</a>Share This



                                    </div>
                                    <ul>
                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                            <span><a class="gplus-textcolor" href="#">Ciwuk Hartadi</a> ngono saiki dolan ra ngajak ajak..
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>



                                    </ul>


                                </div>



                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" placeholder="Add a comment.." class="form-control">
                                    </div>
                                </form>

                            </div>
                        </div>
						
						
                        <!-- END OF GPLUS -->

                        <!-- FACEBOOK 2 -->
                        <div class="panel panel-default">
                            <div class="panel-fb">
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-thumbs-up"></span>
                                </a>
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-facebook-circled"></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-body">
                                <img src="http://api.randomuser.me/portraits/thumb/men/21.jpg" class="img-circle pull-left">
                                <div class="social-profile">
                                    <h3> <a href="#">Sympo Nia</a>
                                        <span><i class="entypo-globe"></i>&nbsp;2 Days ago</span>
                                    </h3>
                                    <p>yang pawaii kelulusaaaannn
                                        <br>jgn pecicilan dooooonnggg.....
                                        <br>eman eman nyawamu</p>
                                </div>

                                <div class="clearfix"></div>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a class="" href="#">
                                            <span class="entypo-thumbs-up"></span>2</a>People Like This



                                    </div>
                                    <ul>
                                        <li>
                                            <img src="http://api.randomuser.me/portraits/thumb/women/21.jpg" class="img-social-content img-circle pull-left">
                                            <span><a href="#">Krida Riyanto</a> Sampluk buu...sampluk...
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>

                                        <li>
                                            <img src="http://api.randomuser.me/portraits/thumb/women/22.jpg" class="img-social-content img-circle pull-left">
                                            <span><a href="#">Srondeng Rimawan</a> Eee karang yo cah enom, cah tuo yo podo wae ding wkwkw
                                                <br>
                                                <b>13 Minute</b>
                                            </span>

                                        </li>

                                        <li>
                                            <img src="http://api.randomuser.me/portraits/thumb/men/48.jpg" class="img-social-content img-circle pull-left">
                                            <span><a href="#">Setan Beras</a> Mesake bangsaku. jane ki yo bijine rasepiro tur mik kakehan geleleng.
                                                <br>
                                                <b>1 Hours</b>
                                            </span>

                                        </li>
                                    </ul>


                                </div>



                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" class="form-control" placeholder="Add a comment..">
                                    </div>
                                </form>

                            </div>
                        </div>
                        <!-- END OF FACEBOOK 2 -->





                    
                    <!-- END OF SOCIAL  LEFT CONTENT -->


                        <div class="panel panel-default">
                            <div class="panel-fb">
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-thumbs-up"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-facebook-circled"></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-body">
                                <img class="img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/women/21.jpg">
                                <div class="social-profile">
                                    <h3> <a href="#">Sympo Nia</a>
                                        <span><i class="entypo-globe"></i>&nbsp;1 hours ago</span>
                                    </h3>
                                    <p>yang pawaii kelulusaaaannn
                                        <br>jgn pecicilan dooooonnggg.....
                                        <br>eman eman nyawamu</p>
                                </div>

                                <div class="clearfix"></div>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a href="#" class="">
                                            <span class="entypo-thumbs-up"></span>2</a>People Like This



                                    </div>
                                    <ul>
                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                            <span><a href="#">Krida Riyanto</a> Sampluk buu...sampluk...
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>

                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/22.jpg">
                                            <span><a href="#">Srondeng Rimawan</a> Eee karang yo cah enom, cah tuo yo podo wae ding wkwkw
                                                <br>
                                                <b>13 Minute</b>
                                            </span>

                                        </li>

                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/23.jpg">
                                            <span><a href="#">Setan Beras</a> Mesake bangsaku. jane ki yo bijine rasepiro tur mik kakehan geleleng.
                                                <br>
                                                <b>1 Hours</b>
                                            </span>

                                        </li>
                                    </ul>


                                </div>



                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" placeholder="Add a comment.." class="form-control">
                                    </div>
                                </form>

                            </div>
                        </div>




                        <!-- TWITTER -->
                        <div class="panel panel-default">
                            <div class="panel-fb tweet-bgcolor">
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-loop"></span>
                                </a>
                                <a href="#" class="link-post pull-right">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-twitter-circled "></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-body">
                                <img class="img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/29.jpg">
                                <div class="social-profile">
                                    <h3> <a class="tweet-link" href="#">Ahmad Heavy Folder</a>
                                        <span><i class="entypo-globe"></i>&nbsp;1 hours ago</span>
                                    </h3>
                                    <p>mungkin pengemis yg baru saja mampir kerumah jauh lebih kaya dari saya...(minimal kaya daging, dia gemuk sedang saya kurus)....</p>
                                </div>

                                <div class="clearfix"></div>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a class="tweet-link" href="#" class="">
                                            <span class="entypo-loop"></span>5</a>People ReTweet This



                                    </div>
                                    <ul>
                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                            <span><a style="color:#0AA699;" href="#">Ciwuk Hartadi</a> nek do menehi wujud pangan palingo,,dadi gendut...he he he
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>

                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/29.jpg">
                                            <span><a class="tweet-link" href="#">Ahmad heavy Folder</a> lha pengemise mau nganggo wewangian/parfum barang....elok tenan...
                                                <a class="tweet-link" href="#">@Ciwuk Hartadi</a>
                                                <br>
                                                <b>13 Minute</b>
                                            </span>

                                        </li>
                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                            <span><a class="tweet-link" href="#">Ciwuk Hartadi</a> weh la ak we telung dino telung pekoro ra adus yo ra nganggo parfum je
                                                <br>
                                                <b>5 Minute</b>
                                            </span>

                                        </li>


                                    </ul>


                                </div>



                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" placeholder="Add a comment.." class="form-control">
                                    </div>
                                </form>

                            </div>
                        </div>
                        <!-- END OF TWITTER -->

                        <!-- INSTAGRAM 2 -->
                        <div class="panel panel-default">
                            <div class="panel-fb instagram-color">
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-cog"></span>
                                </a>
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-heart"></span>
                                </a>
                                <a class="link-post pull-right" href="#">
                                    <span class="entypo-link"></span>
                                </a>

                                <h4>
                                    <span class="entypo-instagrem "></span>&nbsp;

                                </h4>
                            </div>
                            <div class="panel-thumbnail">
                                <img src="${pageContext.request.contextPath}/assets/img/insta-pic2.jpg" alt="" class="img-responsive-social">
                            </div>
                            <div class="panel-body">
                                <p class="lead">Open the Door
                                    <br><i>#gate</i>  <i>#classic</i>  <i>#door</i>  <i>#canvas</i>
                                </p>
                                <hr>
                                <div class="social-content">

                                    <div class="social-header">
                                        <a href="#" class="insta-color">
                                            <span class="entypo-heart"></span>26</a>Like's



                                    </div>
                                    <ul>
                                        <li>
                                            <img class="img-social-content img-circle pull-left" src="http://api.randomuser.me/portraits/thumb/women/45.jpg">
                                            <span><a href="#" class="insta-color">Gifta Gina</a> Keren ini dmn ya?
                                                <br>
                                                <b>43 Minute</b>
                                            </span>

                                        </li>
                                    </ul>


                                </div>
                                <hr>
                                <form>
                                    <div class="input-group">
                                        <div class="input-group-btn">
                                            <button class="btn">+1</button>
                                            <button class="btn"><i class="glyphicon glyphicon-share"></i>
                                            </button>
                                        </div>
                                        <input type="text" placeholder="Add a comment.." class="form-control">
                                    </div>
                                </form>


                            </div>
                        </div>
                        <!-- END OF INSTAGRAM 2 -->



            
</div>
            <!-- /END OF CONTENT -->
			<div class="col-sm-3">
			
								  
						

			</div>
     </div>

<!-- 内容结束 -->
	</div>
    <!--  END OF PAPER WRAP -->

    <!-- RIGHT SLIDER CONTENT -->
    <div class="sb-slidebar sb-right">
        <div class="right-wrapper">
            <div class="row">
                <h3>
                    <span><i class="entypo-gauge"></i>&nbsp;&nbsp;MAIN WIDGET</span>
                </h3>
                <div class="col-sm-12">

                    <div class="widget-knob">
                        <span class="chart" style="position:relative" data-percent="86">
                            <span class="percent"></span>
                        </span>
                    </div>
                    <div class="widget-def">
                        <b>Distance traveled</b>
                        <br>
                        <i>86% to the check point</i>
                    </div>

                    <div class="widget-knob">
                        <span class="speed-car" style="position:relative" data-percent="60">
                            <span class="percent2"></span>
                        </span>
                    </div>
                    <div class="widget-def">
                        <b>The average speed</b>
                        <br>
                        <i>30KM/h avarage speed</i>
                    </div>


                    <div class="widget-knob">
                        <span class="overall" style="position:relative" data-percent="25">
                            <span class="percent3"></span>
                        </span>
                    </div>
                    <div class="widget-def">
                        <b>Overall result</b>
                        <br>
                        <i>30KM/h avarage Result</i>
                    </div>
                </div>
            </div>
        </div>

        <div style="margin-top:0;" class="right-wrapper">
            <div class="row">
                <h3>
                    <span><i class="entypo-chat"></i>&nbsp;&nbsp;CHAT</span>
                </h3>
                <div class="col-sm-12">
                    <span class="label label-warning label-chat">Online</span>
                    <ul class="chat">
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/20.jpg">
                                </span><b>Dave Junior</b>
                                <br><i>Last seen : 08:00 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/21.jpg">
                                </span><b>Kenneth Lucas</b>
                                <br><i>Last seen : 07:21 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-circle" src="http://api.randomuser.me/portraits/thumb/men/22.jpg">
                                </span><b>Heidi Perez</b>
                                <br><i>Last seen : 05:43 PM</i>
                            </a>
                        </li>


                    </ul>

                    <span class="label label-chat">Offline</span>
                    <ul class="chat">
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/23.jpg">
                                </span><b>Dave Junior</b>
                                <br><i>Last seen : 08:00 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/24.jpg">
                                </span><b>Kenneth Lucas</b>
                                <br><i>Last seen : 07:21 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/25.jpg">
                                </span><b>Heidi Perez</b>
                                <br><i>Last seen : 05:43 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/women/25.jpg">
                                </span><b>Kenneth Lucas</b>
                                <br><i>Last seen : 07:21 PM</i>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span>
                                    <img alt="" class="img-chat img-offline img-circle" src="http://api.randomuser.me/portraits/thumb/men/26.jpg">
                                </span><b>Heidi Perez</b>
                                <br><i>Last seen : 05:43 PM</i>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>
    </div>

    <!-- END OF RIGHT SLIDER CONTENT-->



    <!-- MAIN EFFECT -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/preloader.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/app.js"></script>
   <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/load.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/main.js"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/upload/demos/js/demo.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/upload/src/dmuploader.min.js"></script>


<%--        <!-- start由于加载错误而重新添加的js -->

        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/skin-select/skin-select.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/skin-select/jquery.cookie.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/clock/date.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/custom/scriptbreaker-multiple-accordion-1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/newsticker/jquery.newsTicker.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/search/jquery.quicksearch.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/slidebars/slidebars.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/tip/jquery.tooltipster.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/gage/jquery.easypiechart.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/pace/pace.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/clock/jquery.clock.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/chart/jquery.sparkline.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/gage/raphael.2.1.0.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/gage/justgage.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/nano/jquery.nanoscroller.js"></script>

        <!--end-->--%>

</body>

</html>