<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import = "org.mc.anagrafica.ws.*" %>
<%@ page import = "org.mc.anagrafica.ws.AnagraficaServiceStub.AnagraficaResponse" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String inputString = request.getParameter("codfisc");

AnagraficaClient service = new AnagraficaClient();

AnagraficaResponse myresult = service.findAnagrafica(inputString);
String nome = myresult.getNome();
String cognome = myresult.getCognome();
%>

<p>Result : <%= nome %> <%= cognome %></p>

</body>
</html>