<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<context:component-scan base-package = "springMVCQ8.Controller" />

   <bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
      <property name = "prefix" value = "/WEB-INF/view/" />
      <property name = "suffix" value = ".jsp" />
   </bean>
   
   <mvc:annotation-driven />
</body>
</html>