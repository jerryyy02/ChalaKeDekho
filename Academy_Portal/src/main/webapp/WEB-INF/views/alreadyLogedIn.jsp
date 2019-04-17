<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">

<link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" />
<link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg" color="#111" />
<title>User Already Logged In</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto:100'>
<style>
      body {
  height: 100vh;
  background: linear-gradient(15deg, #00a9f1, #cf00f1);
  color: #fff;
  position: relative;
}
body:before {
  content: 'CLICK';
  font-family: 'Roboto';
  font-size: 15px;
  color: white;
  position: absolute;
  z-index: 10;
  right: 30px;
  top: 30px;
}
@media (max-width: 480px) {
  body:before {
    top: auto;
    bottom: 20px;
    right: 20px;
  }
}

h1 {
  font-family: Roboto, sans-serif;
  font-weight: 100;
  font-size: 100px;
  margin: 0;
  padding: 30px;
  text-transform: uppercase;
}
@media (max-width: 700px) {
  h1 {
    padding: 20px;
    font-size: 40px;
  }
}
h1 span {
  display: inline-block;
  transition: -webkit-transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
  transition: transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
  transition: transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1), -webkit-transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
  -webkit-transform: translate(20%, 100%);
          transform: translate(20%, 100%);
  position: relative;
  z-index: 1;
  letter-spacing: -0.03em;
  text-shadow: 3px 4px 0 rgba(0, 0, 0, 0.1);
}
h1 span:before {
  content: '';
  position: absolute;
  z-index: 1;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 100%;
  -webkit-transform: translateY(-40%);
          transform: translateY(-40%);
  transition: -webkit-transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
  transition: transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
  transition: transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1), -webkit-transform 0.6s cubic-bezier(0.65, 0.02, 0.23, 1);
}
h1 span.row {
  overflow: hidden;
  line-height: 0.9;
  display: block;
  -webkit-transform: none;
          transform: none;
}
h1 span.row:before {
  display: none;
}
h1 .animate {
  -webkit-transform: translate(0, 0);
          transform: translate(0, 0);
}
h1 .animate:before {
  -webkit-transform: translateY(100%);
          transform: translateY(100%);
}

.button {
  border-radius: 4px;
  background-color: #9400D3;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 200px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
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
</head>
<body translate="no">

<h1 class="strip">
User<br>
Already<br>
Logged In <br>
Another Session
</h1>

 <a href="logout.html" class="btn btn-secondary  form-rounded" ><button class="button"><span>Logout</span></button></a>

<script src="https://static.codepen.io/assets/common/stopExecutionOnTimeout-de7e2ef6bfefd24b79a3f68b414b87b8db5b08439cac3f1012092b2290c719cd.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
<script id="rendered-js">
      $('.strip').each(function () {
  var $t = $(this),
  rows = $.trim($t.html()).split('<br>');

  $t.html('');

  $.each(rows, function (i, val) {
    $('<span class="row"></span>').appendTo($t);

    var letters = $.trim(val).split('');

    $.each(letters, function (j, v) {
      v = v == ' ' ? '&nbsp;' : v;
      $('<span>' + $.trim(v) + '</span>').appendTo($('.row:last', $t));
    });

  });
});

$('body').click(function () {
  for (i = 0; i < $('.strip span').length; i++) {if (window.CP.shouldStopExecution(0)) break;
    (function (ind) {
      setTimeout(function () {
        $('.strip span:not(".row")').eq(ind).toggleClass('animate');
      }, ind * 15);
    })(i);
  }window.CP.exitedLoop(0);
}).click();
      //# sourceURL=pen.js
    </script>
<script src="https://static.codepen.io/assets/editor/live/css_reload-5619dc0905a68b2e6298901de54f73cefe4e079f65a75406858d92924b4938bf.js"></script>
</body>
</html>
