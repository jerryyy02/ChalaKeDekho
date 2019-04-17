<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" integrity="sha384-2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link href="/docs/4.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="canonical" href="https://getbootstrap.com/docs/4.0/components/navbar/">
<link rel="icon" href="https://firebasestorage.googleapis.com/v0/b/grizzly-5a659.appspot.com/o/favicon.ico?alt=media&token=664f21e8-04d6-4aca-94ea-25915c4f8a07" type="image/gif" sizes="16x16">

<style>
      html,
body {
  height: 100%;
  width: 100%;
}

img {
  width: 100%;
}

.section-content {
  padding: 80px 0;
}

.section-title {
  padding-bottom: 20px;
}

#hero {
  background: #222 url("https://hd.unsplash.com/photo-1467703834117-04386e3dadd8") center center no-repeat;
  background-size: cover;
  color: white;
  height: 100%;
  display: flex;
  align-items: center;
  text-align: center;
}

#hero-caption {
  width: 100%;
}

#about {
  background: #ececec url("https://hd.unsplash.com/photo-1414690165279-49ab0a9a7e66") center center no-repeat;
  background-size: cover;
}

.about-text {
  background: rgba(0, 0, 0, 0.75);
  color: #fff;
  padding: 1.8rem;
}

#contact {
  background: #ececec url("https://hd.unsplash.com/38/awhCbhLqRceCdjcPQUnn_IMG_0249.jpg") center center no-repeat;
  background-size: cover;
  color: #fff;
}

#footer-main {
  background-color: #222;
  color: #fff;
  font-size: 0.8em;
  padding: 2em;
}
#footer-main a {
  color: #999;
}
#footer-main a:hover {
  color: #efefef;
}

/* modals */
.service-modal .modal-dialog {
  margin: auto;
  height: 100%;
  width: auto;
}

.service-modal .modal-content {
  border-radius: 0;
  background-clip: border-box;
  -webkit-box-shadow: none;
  box-shadow: none;
  border: none;
  min-height: 100%;
  padding: 100px 0;
  text-align: center;
}

.service-modal .modal-content h2 {
  margin-bottom: 15px;
  font-size: 3em;
}

.service-modal .modal-content img {
  margin-bottom: 30px;
}

.service-modal .modal-content p {
  margin-bottom: 30px;
}

.service-modal .close-modal {
  position: absolute;
  width: 30px;
  height: 30px;
  background-color: transparent;
  top: 50px;
  right: 50px;
  cursor: pointer;
}

.service-modal .close-modal .close-icon {
  height: 30px;
  width: 1px;
  margin-left: 15px;
  background-color: #555;
  transform: rotate(45deg);
  -ms-transform: rotate(45deg);
  -webkit-transform: rotate(45deg);
  z-index: 1000;
}

.service-modal .close-modal:hover .close-icon {
  background-color: #e74c3c;
}

.service-modal .close-modal .close-icon .close-icon-r {
  height: 30px;
  width: 1px;
  background-color: #555;
  transform: rotate(90deg);
  -ms-transform: rotate(90deg);
  /* IE 9 */
  -webkit-transform: rotate(90deg);
  /* Safari and Chrome */
  z-index: 1000;
}

.service-modal .close-modal:hover .close-icon .close-icon-r {
  background-color: #e74c3c;
}

    </style>
<script>
  window.console = window.console || function(t) {};
</script>
<script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>
<title>Batch Form</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,100,700,500);

body {
  padding-top: 90px;
  background:#85929E;
  color:#666666;
  font-family: 'Roboto', sans-serif;
  font-weight:100;
}

body{
  width: 100%;
  
  background: #85929E;
  background-size: 600% 100%;
  -webkit-animation: HeroBG 20s ease infinite;
          animation: HeroBG 20s ease infinite;
}

body::-webkit-scrollbar {
    width: 4px;
}
 
body::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
}
 
body::-webkit-scrollbar-thumb {
  background-color: darkgrey;
  outline: 1px solid slategrey;
}

@-webkit-keyframes HeroBG {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 100% 0;
  }
  100% {
    background-position: 0 0;
  }
}

@keyframes HeroBG {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 100% 0;
  }
  100% {
    background-position: 0 0;
  }
}


.panel {
  border-radius: 5px;
}
label {
  font-weight: 300;
}
.panel-login {
   border: none;
   margin-top:-18px;
  -webkit-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
  -moz-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
  box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
  }
.panel-login .checkbox input[type=checkbox]{
  margin-left: 0px;
}
.panel-login .checkbox label {
  padding-left: 25px;
  font-weight: 300;
  display: inline-block;
  position: relative;
}
.panel-login .checkbox {
 padding-left: 20px;
}
.panel-login .checkbox label::before {
  content: "";
  display: inline-block;
  position: absolute;
  width: 17px;
  height: 17px;
  left: 0;
  margin-left: 0px;
  border: 1px solid #cccccc;
  border-radius: 3px;
  background-color: #fff;
  -webkit-transition: border 0.15s ease-in-out, color 0.15s ease-in-out;
  -o-transition: border 0.15s ease-in-out, color 0.15s ease-in-out;
  transition: border 0.15s ease-in-out, color 0.15s ease-in-out;
}
.panel-login .checkbox label::after {
  display: inline-block;
  position: absolute;
  width: 16px;
  height: 16px;
  left: 0;
  top: 0;
  margin-left: 0px;
  padding-left: 3px;
  padding-top: 1px;
  font-size: 11px;
  color: #555555;
}
.panel-login .checkbox input[type="checkbox"] {
  opacity: 0;
}
.panel-login .checkbox input[type="checkbox"]:focus + label::before {
  outline: thin dotted;
  outline: 5px auto -webkit-focus-ring-color;
  outline-offset: -2px;
}
.panel-login .checkbox input[type="checkbox"]:checked + label::after {
  font-family: 'FontAwesome';
  content: "\f00c";
}
.panel-login>.panel-heading .tabs{
  padding: 0;
}
.panel-login h2{
  font-size: 20px;
  font-weight: 300;
  margin: 30px;
}
.panel-login>.panel-heading {
  color: #848c9d;
  background-color: #e8e9ec;
  border-color: #fff;
  text-align:center;
  border-bottom-left-radius: 5px;
  border-bottom-right-radius: 5px;
  border-top-left-radius: 0px;
  border-top-right-radius: 0px;
  border-bottom: 0px;
  padding: 0px 15px;
}
.panel-login .form-group {
  padding: 0 30px;
}
.panel-login>.panel-heading .login {
  padding: 20px 30px;
  border-bottom-leftt-radius: 5px;
}
.panel-login>.panel-heading .register {
  padding: 20px 30px;
  background: #2d3b55;
  border-bottom-right-radius: 5px;
}
.panel-login>.panel-heading a{
  text-decoration: none;
  color: #666;
  font-weight: 300;
  font-size: 16px;
  -webkit-transition: all 0.1s linear;
  -moz-transition: all 0.1s linear;
  transition: all 0.1s linear;
}
.panel-login>.panel-heading a#register-form-link {
  color: #fff;
  width: 100%;
  text-align: right;
}
.panel-login>.panel-heading a#login-form-link {
  width: 100%;
  text-align: left;
}

.panel-login input[type="text"],.panel-login input[type="email"],.panel-login input[type="password"] {
  height: 45px;
  border: 0;
  font-size: 16px;
  -webkit-transition: all 0.1s linear;
  -moz-transition: all 0.1s linear;
  transition: all 0.1s linear;
  -webkit-box-shadow: none;
  box-shadow: none;
  border-bottom: 1px solid #e7e7e7;
  border-radius: 0px;
  padding: 6px 0px;
}
.panel-login input:hover,
.panel-login input:focus {
  outline:none;
  -webkit-box-shadow: none;
  -moz-box-shadow: none;
  box-shadow: none;
  border-color: #ccc;
}
.btn-login {
  background-color: #E8E9EC;
  outline: none;
  color: #2D3B55;
  font-size: 14px;
  height: auto;
  font-weight: normal;
  padding: 14px 0;
  text-transform: uppercase;
  border: none;
  border-radius: 0px;
  box-shadow: none;
}
.btn-login:hover,
.btn-login:focus {
  color: #fff;
  background-color: #2D3B55;
}
.forgot-password {
  text-decoration: underline;
  color: #888;
}
.forgot-password:hover,
.forgot-password:focus {
  text-decoration: underline;
  color: #666;
}

.btn-register {
  background-color: #E8E9EC;
  outline: none;
  color: #2D3B55;
  font-size: 14px;
  height: auto;
  font-weight: normal;
  padding: 14px 0;
  text-transform: uppercase;
  border: none;
  border-radius: 0px;
  box-shadow: none;
}
.btn-register:hover,
.btn-register:focus {
  color: #fff;
  background-color: #2D3B55;
}
.logout{
background-color: #E8E9EC;
  outline: none;
  color: #2D3B55;
  font-size: 14px;
  width:80px;
  height: auto;
  font-weight: normal;
  padding: 14px 0;
  text-transform: uppercase;
  border: none;
  border-radius: 3px;
  box-shadow: none;
  
}

.logout:hover,
.logout:focus {
  color: #fff;
  background-color: #2D3B55;
}

.nevButton{
background: #5DADE2;
border: 0px;
margin-right:10px;
}

.nevButton:hover{
background: #adebad;
color:black;
}

.nevButton1{
background: #2471A3;
border: 0px;
margin-right:10px;
color:white;
border-bottom: 2px solid red;
border-radius: 5px;
}

.nevButton1:hover{
background: #00cc44;
color: black;
border-bottom: 2px solid red;
border-radius: 5px;
}

#welcome {
  padding:20px;
  background-size: cover;
  color: white;
  height: 100%;
  display: flex;
  position:absolute;
  right:30px;
  align-items: center;
  font-family: 'Roboto', sans-serif;
  text-align: center;
  font-weight:bold;
}

#welcome-caption {
  width: 100%;
}

.WebName{
margin-right:40px;
width:120px;
position: relative;
top:-11px;
left:-10px;
}

/* Profile container */
.profile {
  margin: 2px 0;
}

/* Profile sidebar */
.profile-sidebar {
  padding: 20px 0 10px 0;
  background: #fff;
}

.profile-userpic img {
  float: none;
  margin: 0 auto;
  width: 50%;
  height: 50%;
  -webkit-border-radius: 50% !important;
  -moz-border-radius: 50% !important;
  border-radius: 50% !important;
  -webkit-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
  -moz-box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
  box-shadow: 0px 0px 49px 14px rgba(188,190,194,0.39);
}

.profile-usertitle {
  text-align: center;
  margin-top: 20px;
}

.profile-usertitle-name {
  color: #5a7391;
  font-size: 16px;
  font-weight: 100;
  margin-bottom: 7px;
}

.profile-usertitle-job {
  text-transform: uppercase;
  color: #5b9bd1;
  font-size: 12px;
  font-weight: 600;
  margin-bottom: 15px;
}

.profile-userbuttons {
  text-align: center;
  margin-top: 10px;
}

/* .profile-userbuttons .btn {
  text-transform: uppercase;
  font-size: 11px;
  font-weight: 600;
  padding: 6px 15px;
  margin-right: 5px;
}

.profile-userbuttons .btn:last-child {
  margin-right: 0px;
} */
    
.profile-usermenu {
  margin-top: 30px;
}

.profile-usermenu ul li {
  border-bottom: 1px solid #f0f4f7;
}

.profile-usermenu ul li:last-child {
  border-bottom: none;
}

.profile-usermenu ul li a {
  color: #93a3b5;
  font-size: 14px;
  font-weight: 400;
}

.profile-usermenu ul li a i {
  margin-right: 8px;
  font-size: 14px;
}
.profile-usermenu ul li a:hover {
  background-color: #fafcfd;
  color: #5b9bd1;
}

.profile-usermenu ul li.active {
  border-bottom: none;
}

.profile-usermenu ul li.active a {
  color: #5b9bd1;
  background-color: #f6f9fb;
  border-left: 2px solid #5b9bd1;
  margin-left: -2px;
}

/* Profile Content */
.profile-content {
border-radius:5px;
  padding: 20px;
  min-height: 460px;
}
 button, code, div, img, input, label, li, p, pre, select, span, svg, table, td, textarea, th, ul {
    -webkit-border-radius: 3px;
    -moz-border-radius: 3px;
    border-radius: 3px;
}
.dashboard-stat, .portlet {
    -webkit-border-radius: 4px;
    -moz-border-radius: 4px;
    -ms-border-radius: 4px;
    -o-border-radius: 4px;
}
.portlet {
    margin-top: 0;
    margin-bottom: 25px;
    padding: 0;
    border-radius: 4px;
}
.portlet.bordered {
    border-left: 2px solid #e6e9ec!important;
}
.portlet.light {
    padding: 12px 20px 15px;
    background-color: #fff;
}
.portlet.light.bordered {
    border: 1px solid #e7ecf1!important;
}
.list-separated {
    margin-top: 10px;
    margin-bottom: 15px;
}
.profile-stat {
    padding-bottom: 20px;
    border-bottom: 1px solid #f0f4f7;
}
.profile-stat-title {
    color: #7f90a4;
    font-size: 25px;
    text-align: center;
}
.uppercase {
    text-transform: uppercase!important;
}

.profile-stat-text {
    color: #5b9bd1;
    font-size: 10px;
    font-weight: 600;
    text-align: center;
}
.profile-desc-title {
    color: #7f90a4;
    font-size: 17px;
    font-weight: 600;
}
.profile-desc-text {
    color: #7e8c9e;
    font-size: 14px;
}
.margin-top-20 {
    margin-top: 20px!important;
}
[class*=" fa-"]:not(.fa-stack), [class*=" glyphicon-"], [class*=" icon-"], [class^=fa-]:not(.fa-stack), [class^=glyphicon-], [class^=icon-] {
    display: inline-block;
    line-height: 14px;
    -webkit-font-smoothing: antialiased;
}
.profile-desc-link i {
    width: 22px;
    font-size: 19px;
    color: #abb6c4;
    margin-right: 5px;
}

.icon-bar{
background: white;
}

.navbar-toggle{
position: absolute;
right:-5px;
}
</style>
</head>
<body>
<nav class="navbar navbar-dark navbar-full navbar-fixed-top" style="background-color: #111;">
<div id="welcome">Welcome: ${user.fName} ${user.lName}</div>
<div class="navbar-header">
      <button type="button" id="toggle" class="navbar-toggle" data-toggle="collapse" data-target="#navbarSupportedContent">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a href="goToHome.html" class="navbar-brand"><img class="WebName" src="https://firebasestorage.googleapis.com/v0/b/grizzly-5a659.appspot.com/o/md_5b4927832fad4%20(2).png?alt=media&token=39a5f7d3-cc34-438f-80fe-f477d70865a3" width="10px"/></a>
    </div>
<div class="collapse navbar-collapse" id="navbarSupportedContent">

<ul class="nav navbar-nav">
    <li></li>
    <li><a href="registerUser.html" class="btn btn-danger navbar-btn nevButton">Register New User</a></li>
    <li><a href="addModule.html" class="btn btn-danger navbar-btn nevButton">Add Module</a></li>
    <li><a href="batchAllocation.html" class="btn btn-danger navbar-btn nevButton">Batch Allocation</a></li>
    <li><a href="updateBatch.html" class="btn btn-danger navbar-btn nevButton">update Batch</a></li>
    <li><a href="insertBatch.html" class="btn btn-danger navbar-btn nevButton1">Insert Batch</a></li>
    <li><a href="generateReport.html" class="btn btn-danger navbar-btn nevButton">Generate Report</a></li>
    <li><a href="insertSkill.html" class="btn btn-danger navbar-btn nevButton">Insert Skill</a></li>
</ul>
  </div>
</nav>

<div class="row profile">
<div class="col-md-3">
<div class="profile-sidebar">

<div class="profile-userpic">
<img src="https://firebasestorage.googleapis.com/v0/b/grizzly-5a659.appspot.com/o/avatar7.png?alt=media&token=e821e958-e39c-44d3-89fb-68cc24fc884b" class="img-responsive" alt="">
</div>


<div class="profile-usertitle">
<div class="profile-usertitle-name">
${user.fName} ${user.lName}
</div>
Username:
<div class="profile-usertitle-job">

${user.userName}<br><br>
<a href="logout.html" class="form-control btn logout">Logout </a>
</div>
</div>


</div>
</div>

<div class="col-md-9">
<div class="profile-content">
<div class="w3-container w3-lobster">

<!-- <div class="container">
   <div class="row"> -->
    <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-login">
        <div class="panel-body">
          <div class="row">
            <div class="col-lg-12">
            <h2>Batch Form</h2> 
             <form id="login-form" action="insertBatch.html" method="post" role="form" style="display: block;">
                
                  <div class="form-group">
                    <input type="text" autocomplete="off" name="batchId" id="moduleId" tabindex="1" class="form-control" placeholder="Enter BatchId" value="" required>
                  </div>
                  <div class="form-group">
                    <input type="text" autocomplete="off" name="batchName" id="moduleName" tabindex="1" class="form-control" placeholder="Enter BatchName" value="" required>
                  </div>
                  <div class="form-group">
                    <input type="text" autocomplete="off" name="batchDetails" id="moduleDesc" tabindex="2" class="form-control"  placeholder="Enter BatchDetails" required>
                  </div>
                  <div class="form-group">
                    <div class="row">
                      <div class="col-sm-6 col-sm-offset-3">
                        <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Submit">
                      </div>
                    </div>
                  </div>
              </form>
              <form id="register-form"  method="post" role="form" style="display: none;">
                
              </form>
            </div>
          </div>
        </div>
         <div class="panel-heading">
          <div class="row">
            
          </div>
        </div>
      </div>
    </div>
  <!-- </div>
</div> -->
 </div>
    </div>
  </div>
  <script>
  $("#toggle").click(function () {
		$("#welcome").toggle();
	});
  </script>
</body>
</html>