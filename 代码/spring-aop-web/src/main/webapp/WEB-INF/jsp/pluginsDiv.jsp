<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach items="${pluginList }" var="info">
  <input type='checkbox' value="${info.name }" onclick="changeStatus('${info.name}')" id="${info.name}" <c:if test="${info.actived }">checked</c:if> 
  />${info.desc }
</c:forEach>
