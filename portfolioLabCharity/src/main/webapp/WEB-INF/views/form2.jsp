<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp" %>

<div data-step="2">
    <h3>Podaj liczbę 60l worków, w które spakowałeś/aś rzeczy:</h3>

    <div class="form-group form-group--inline">
        <label>
            Liczba 60l worków:
            <input type="number" name="bags" step="1" min="1" />
        </label>
    </div>

    <div class="form-group form-group--buttons">
        <a href="form1" type="button" class="btn prev-step">Wstecz</a>
        <a href="form3" type="button" class="btn next-step">Dalej</a>
    </div>
</div>













<%@ include file="footer.jsp" %>