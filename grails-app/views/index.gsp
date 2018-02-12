<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <div id="content" role="main">
        <div class="row">
            <div class="col-lg-2">
                <div id="controllers" role="navigation" style="padding: 5px;">
                    %{--<h2>Available Controllers:</h2>--}%
                    %{--<ul class="nav nav-pills nav-stacked" style="width: 100px;">
                        <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                            <li class="controller">
                                <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                            </li>
                        </g:each>
                    </ul>--}%
                    <div class="dropdown">
                        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Available Controllers:
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                                <li class="controller">
                                    <g:link controller="${c.logicalPropertyName}">${c.name}</g:link>
                                </li>
                            </g:each>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-10">
                <section class="row colset-2-its">
                    <h1>Welcome to Grails</h1>

                    <p>
                        Congratulations, you have successfully started your first Grails application! At the moment
                        this is the default page, feel free to modify it to either redirect to a controller or display
                        whatever content you may choose. Below is a list of controllers that are currently deployed in
                        this application, click on each to execute its default action:
                    </p>
                </section>
            </div>
        </div>
    </div>

</body>
</html>
