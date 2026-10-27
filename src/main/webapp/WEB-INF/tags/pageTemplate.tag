<%@tag description="base page template" pageEncoding="UTF-8"%>
<%@attribute name="pageTitle"%>

<!DOCTYPE html>
<html>
<head>
    <title>${pageTitle}</title>
</head>
<body>
<h1>${pageTitle}</h1>
<jsp:doBody/>
</body>
</html>