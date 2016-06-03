<%@ page import="java.sql.*" %>

<% Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); %>

<HTML>
    <HEAD>
        <TITLE>The tableName Database Table </TITLE>
    </HEAD>
	<!-- esto deberia mostrar la tabla de pacientes-->
    <BODY>
        <H1>The tableName Database Table </H1>

        <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:odbc:data", "grupo3", "grupo3");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from Pacientes") ; 
        %>

        <TABLE BORDER="1">
            <TR>
				<th> id</th>
                <TH>Nombre</TH>
                <TH>Apellid</TH>
                <TH>dni</TH>
                <TH>tipodoc</TH>
                <TH>direcc</TH>
				<TH>tel</TH>
				<TH>mail</TH>
				<TH>fecnac</TH>
				<TH>sexo</TH>
				<TH>civil</TH>
				<TH>cargo</TH>
				<TH>plan</TH>
				<TH>baja</TH>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
				<TD> <%= resultset.getString(6) %></TD>
				<TD> <%= resultset.getString(7) %></TD>
				<TD> <%= resultset.getString(8) %></TD>
				<TD> <%= resultset.getString(9) %></TD>
				<TD> <%= resultset.getString(10) %></TD>
				<TD> <%= resultset.getString(11) %></TD>
				<TD> <%= resultset.getString(12) %></TD>
				<TD> <%= resultset.getString(13) %></TD>
				<TD> <%= resultset.getString(14) %></TD>
            </TR>
            <% } %>
        </TABLE>
    </BODY>
</HTML>