<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<h2 class="title">Oddaj dar</h2>
<%--<form action="" method="post">--%>
<%--    <li>--%>
<%--        <form:checkbox items="${categories}" path="categories"/>--%>
<%--    <label for="categories">Zaznacz co chcesz oddać:</label>--%>
<%--    <input type="checkbox" id="categories"/>--%>
<%--    </li>--%>
<%--        <form:form modelAttribute="donation" method="post">--%>
<%--            <form:checkboxes path="categories" items="${categories}"/>--%>
<%--        </form:form>--%>
    <label for="quantity">Podaj liczbę 60l worków, w które spakowałeś/aś rzeczy:</label>
    Liczba 60l worków: <input type="number" id="quantity">
    <label for="institution">Wybierz organizacje, której chcesz pomóc: </label>
    <input type="checkbox" id="institution">
    <label for="pickupAddress">Podaj adres oraz termin odbioru rzeczy przez kuriera: </label>
    <label for="pickupAddress">Adres odbioru</label>
    <input type="text" id="pickupAddress">
    Ulica <input type="text">
    Miasto <input type="text">
    Kod pocztowy <input type="number">
    Numer telefonu <input type="number">
    <label for="dateOfReceipt">Termin odbioru</label>
    Data <input type="date" id="dateOfReceipt">
    Godzina <input type="time">
    Uwagi dla kuriera <textarea name="uwagi dla kuriera"></textarea>
    <button type="submit">Potwierdzam</button>
</form>
<%@ include file="footer.jsp" %>