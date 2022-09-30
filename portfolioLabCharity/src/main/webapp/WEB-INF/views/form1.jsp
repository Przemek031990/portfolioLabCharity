<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp" %>


<div data-step="1" class="active">
    <h3>Zaznacz co chcesz oddać:</h3>
    <div class="form-group form-group--checkbox">
        <label>
            <input
                    type="checkbox"
                    name="categories"
                    value="clothes-to-use"
            />
            <span class="checkbox"></span>
            <span class="description"
            >ubrania, które nadają się do ponownego użycia</span
            >
        </label>
    </div>
    <div class="form-group form-group--checkbox">
        <label>
            <input
                    type="checkbox"
                    name="categories"
                    value="clothes-useless"
            />
            <span class="checkbox"></span>
            <span class="description">ubrania, do wyrzucenia</span>
        </label>
    </div>

    <div class="form-group form-group--checkbox">
        <label>
            <input type="checkbox" name="categories" value="toys" />
            <span class="checkbox"></span>
            <span class="description">zabawki</span>
        </label>
    </div>

    <div class="form-group form-group--checkbox">
        <label>
            <input type="checkbox" name="categories" value="books" />
            <span class="checkbox"></span>
            <span class="description">książki</span>
        </label>
    </div>

    <div class="form-group form-group--checkbox">
        <label>
            <input type="checkbox" name="categories" value="other" />
            <span class="checkbox"></span>
            <span class="description">inne</span>
        </label>
    </div>

    <div class="form-group form-group--buttons">
        <a href="form2" type="button" class="btn next-step">Dalej</a>
    </div>
</div>

<%@ include file="footer.jsp" %>