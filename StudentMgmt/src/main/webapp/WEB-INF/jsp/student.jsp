<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Dashboard</title>
</head>
<body>
<form:form action="student.do" method="POST" commandName="student">
	<table>
		<tr>
			<td>Student Roll No :</td>
			<td><form:input path="sId" /></td>
		</tr>
		
		<tr>
			<td>First Name :</td>
			<td><form:input path="firstname" /></td>
		</tr>
		
		<tr>
			<td>Last Name :</td>
			<td><form:input path="lastname" /></td>
		</tr>
		
		<tr>
			<td>Course Name :</td>
			<td><form:input path="coursename" /></td>
		</tr>
		
		<tr>
			<td>University :</td>
			<td><form:input path="university" /></td>
		</tr>
		
		<tr>
			<td>
				<input type="submit" name="action" value="add" />
				<input type="submit" name="action" value="update" />
				<input type="submit" name="action" value="delete" />
				<input type="submit" name="action" value="search" />
				<input type="submit" name="action" value="searchByStdCourse" />
				<input type="submit" name="action" value="searchByStdCourseUni" />
			</td>
			
		</tr>
	</table>

</form:form>
<br>
<table border="1">
	<th>Student ID </th>
	<th>First Name </th>
	<th>Last Name </th>
	<th>Course Name </th>
	<th>University </th>
	<c:forEach items="${studentList}" var="student">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.firstname}</td>
			<td>${student.lastname}</td>
			<td>${student.coursename}</td>
			<td>${student.university}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>