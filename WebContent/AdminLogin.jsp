<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.user.DBUtility"%>
<%@page import="com.user.StoreUtility"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>

<%
if (request.getAttribute("isLoginSuccessful")!=null && (Boolean)request.getAttribute("isLoginSuccessful")) {
%>



	<table width="59%" border="1">
    <%
        ResultSet r;
        int counter=1;
        String query = "select * from users;";
        r = DBUtility.getData(query);
        ResultSetMetaData metaData = r.getMetaData();
        int i;
        while(r.next())
        {
            %>
                <tr>
                 <%

                 for(i = 1; i<=metaData.getColumnCount();i++)
                    { %>
                     <td>
                     <%= r.getString(i)%>
                     </td>
                     
                <% 
                    }
                %>                   
                <td><a href="AdminServlet?id=<%= r.getString(1)%>">Delete</a></td>
                </tr>

            <% 
        }
    %>
</table>


<%
} else {
	%>

<h3> Please go to login page</h3>
	
<%
}
	 %>

</body>
</html>