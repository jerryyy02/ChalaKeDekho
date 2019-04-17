<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final Report</title>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <meta name="robots" content="noindex, nofollow">
  <meta name="googlebot" content="noindex, nofollow">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" href="https://firebasestorage.googleapis.com/v0/b/grizzly-5a659.appspot.com/o/favicon.ico?alt=media&token=664f21e8-04d6-4aca-94ea-25915c4f8a07" type="image/gif" sizes="16x16">
  


  <script
    type="text/javascript"
    src="/js/lib/mootools-core-1.4.4.js"
    
  ></script>
    <link rel="stylesheet" type="text/css" href="/css/normalize.css">

    <link rel="stylesheet" type="text/css" href="/css/result-light.css">


  <style id="compiled-css" type="text/css">
      body {
  background-color :#f5f5f5;
  width: 600px;
  margin: 0 auto;
  padding: 0;
}
h4 {
  color: #cd0000;
  font-size: 42px;
  letter-spacing: -2px;
  text-align: left;
}
.list {
  color: #555;
  font-size: 22px;
  padding: 0 !important;
  width: 610px;
  font-family: courier, monospace;
  border: 1px solid #dedede;
}
.list li {
  list-style: none;
  border-bottom: 1px dotted #ccc;
  text-indent: 25px;
  height: auto;
  padding: 10px;
  text-transform: capitalize;
}
.list li:hover {
  background-color: #f0f0f0;
  -webkit-transition: all 0.2s;
  -moz-transition:    all 0.2s;
  -ms-transition:     all 0.2s;
  -o-transition:      all 0.2s;
}
.lines {
  border-left: 1px solid #ffaa9f;
  border-right: 1px solid #ffaa9f;
  width: 2px;
  float: left;
  height: 600px;
  margin-left: 40px;
}
  </style>


  <!-- TODO: Missing CoffeeScript 2 -->

  <script type="text/javascript">


    window.addEvent('load', function() {
      


    });

</script>

</head>
<body>
    

<div class="lines"></div>

<ul class="list">
<li><h4>Report</h4></li>
  <li><b>Faculty Id is</b> : <font color="blue">${facultyCredit.facultyId}</font></li>
  <li><b>Batch Id is</b> : <font color="blue">${facultyCredit.batchId}</font></li>
  <li><b>Points for Weekly Report are</b> : <font color="blue">${facultyCredit.weeklyReport}/10</font></li>
  <li><b>Points for BHS Report are</b> : <font color="blue">${facultyCredit.bhsReport}/5</font></li>
  <li><b>Points for Mock Test are</b> : <font color="blue">${facultyCredit.mockTest}/10</font></li>
  <li><b>Points for Innovation Project are</b> : <font color="blue">${facultyCredit.innovationProject}/5</font></li>
  <li><font color="red"><b>Total Points for the Faculty is</b></font> : <font color="blue">${facultyCredit.total}/30</font></li>
  <li><br></li>
  <li><br></li>
</ul>


  
  <script>
    // tell the embed parent frame the height of the content
    if (window.parent && window.parent.parent){
      window.parent.parent.postMessage(["resultsFrame", {
        height: document.body.getBoundingClientRect().height,
        slug: "KVjFQ"
      }], "*")
    }

    // always overwrite window.name, in case users try to set it manually
    window.name = "result"
  </script>
</body>
</html>