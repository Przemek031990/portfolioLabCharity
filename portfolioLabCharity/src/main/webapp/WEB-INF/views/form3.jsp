<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp" %>


<div data-step="3">
    <h3>Wybierz organizacje, której chcesz pomóc:</h3>

    <div class="form-group form-group--checkbox">
        <label>
            <input type="radio" name="organization" value="old" />
            <span class="checkbox radio"></span>
            <span class="description">
                  <div class="title">Fundacja “Bez domu”</div>
                  <div class="subtitle">
                    Cel i misja: Pomoc dla osób nie posiadających miejsca
                    zamieszkania
                  </div>
                </span>
        </label>
    </div>

    <div class="form-group form-group--checkbox">
        <label>
            <input type="radio" name="organization" value="old" />
            <span class="checkbox radio"></span>
            <span class="description">
                  <div class="title">Fundacja “Dla dzieci"</div>
                  <div class="subtitle">
                    Cel i misja: Pomoc osobom znajdującym się w trudnej sytuacji
                    życiowej.
                  </div>
                </span>
        </label>
    </div>

    <div class="form-group form-group--buttons">
        <a href="form2" type="button" class="btn prev-step">Wstecz</a>
        <a href="form4" type="button" class="btn next-step">Dalej</a>
    </div>
</div>

<%@ include file="footer.jsp" %>
