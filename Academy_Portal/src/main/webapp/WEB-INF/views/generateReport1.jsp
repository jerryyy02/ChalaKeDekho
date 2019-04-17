<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This Is Report Management Page............
<br>
<form action="viewReport.html" >
  <div class="container">
    <label for="uname"><b>select Batch Id</b></label>
    <select name="batchId">
                          <option value="batch">Batch
                          </option>
                           <c:forEach  var="batch"  items= "${batch}">
                          <option >${batch.batchId}
                          </option>
                          </c:forEach>
                        </select>
	<br>
	<br>
    <button type="submit">View Report</button>
   <br>
	<input type="reset">
	<br>
	
  </div>

  <div class="container" style="background-color:#f1f1f1">
    
  </div>

  </form>
</body>
</html>