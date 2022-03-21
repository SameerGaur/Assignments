<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<context:component-scan base-package = "springMVCQ7.Controller" />

   <bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
      <property name = "prefix" value = "/WEB-INF/view/" />
      <property name = "suffix" value = ".jsp" />
   </bean>
   
   <bean id="messageSource" class="org.springframework.context.support.ReloadableResourceBundleMessageSource">
    	<property name="basename" value="/WEB-INF/view"/>
    </bean>
    
    <bean id="localeResolver" class="org.springframework.web.servlet.i18n.SessionLocaleResolver">
    <property name="defaultLocale" value="en" />
	</bean>
	
	<bean id="localeChangeInterceptor" class="org.springframework.web.servlet.i18n.LocaleChangeInterceptor">
	    <property name="paramName" value="siteLang" />
	</bean>
	 
	<bean class="org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping">
	    <property name="interceptors">
	        <list>
	            <ref bean="localeChangeInterceptor" />
	        </list>
	    </property>
	</bean>
   
   <mvc:annotation-driven />

</body>
</html>