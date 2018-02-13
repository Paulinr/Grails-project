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
                    <h1>Welcome </h1>

                    <p>
                        Result Technology Systems, est une société électro-informatique,  composés d'ingénieurs en électronique et informatique,
                        motivés par la passion  de leur métier, désireux de mettre leur savoir faire au service de toute entité  ayant un quelconque
                        besoin dans les domaines précités.
                    </p>
                </section>
            </div>
        </div>
    </div>

</body>
</html>
