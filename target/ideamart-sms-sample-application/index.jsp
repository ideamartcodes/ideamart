<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="com.ideamart.sms.sample.db.dbClass" %>
<html>
<body>
<h2>hello from ideamart!</h2>
<%
    HashMap map = dbClass.getDBInstance();
    if(!map.isEmpty()) {
        out.print("name"+" "+"message");
        out.print("<br>");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            out.print(entry.getKey() + " " + entry.getValue());
            out.print("<br>");
        }
    }
%>
</body>
</html>
