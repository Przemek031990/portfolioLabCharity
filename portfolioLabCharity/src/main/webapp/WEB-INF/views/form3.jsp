<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp" %>
<%--<section class="form--steps">--%>
<%--    <div class="form--steps-instructions">--%>
<%--        <div class="form--steps-container">--%>
<%--            <h3>Ważne!</h3>--%>
<%--            <p data-step="1" class="active">--%>
<%--                Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy--%>
<%--                wiedzieć komu najlepiej je przekazać.--%>
<%--            </p>--%>
<%--            <p data-step="2">--%>
<%--                Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy--%>
<%--                wiedzieć komu najlepiej je przekazać.--%>
<%--            </p>--%>
<%--            <p data-step="3">--%>
<%--                Wybierz jedną, do--%>
<%--                której trafi Twoja przesyłka.--%>
<%--            </p>--%>
<%--            <p data-step="4">Podaj adres oraz termin odbioru rzeczy.</p>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--    <div class="form--steps-container">--%>
<%--        <div class="form--steps-counter">Krok <span>1</span>/4</div>--%>

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
