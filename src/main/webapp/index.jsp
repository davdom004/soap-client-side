<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="prog4.beadando.ws.MovieDataResponse" %>
<html>
<head><title>SOAP Client Web</title></head>
<body>
<h1>Client-Side Beadandó</h1>

<%
    String error = (String) request.getAttribute("error");
    MovieDataResponse movie = (MovieDataResponse) request.getAttribute("movie");

    if (error != null) {
%>
    <p style="color: red;">Error: <%= error %></p>
<%
} else if (movie != null) {
%>
<p><strong>Movie ID:</strong> <%= movie.getId() %></p>
<p><strong>IMDB Rating:</strong> <%= movie.getImdbRating() %></p>
<%
} else {
%>
<p>No data received.</p>
<%
    }
%>

</body>
</html>
