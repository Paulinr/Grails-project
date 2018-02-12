<%@ page import="com.mbds.Image" %>



<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'nom', 'error')} required">
	<label for="name">
		<g:message code="image.nom.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${imageInstance?.nom}"/>

</div>

