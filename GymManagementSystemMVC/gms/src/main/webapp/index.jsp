<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="application/json; charset=ISO-8859-1">
	</head>
	
	<body>
		<form action="admin/add" method="post"  >
			Name: <input type="text" name="name"><br/>
			Age: <input type="text" name="age" /><br/>
			Gender: <input type="text" name="gender" /><br/>
			Address: <input type="text" name="address" /><br/>
        	<button name="add_admin" type="submit" value="add_admin">Submit</button>
    	</form>
    	<br/><br/><br/>
    
    	<form action="admins">
        	<button name="admins" type="submit" value="admins">Get all admins</button>
    	</form>
</body>
</html>
