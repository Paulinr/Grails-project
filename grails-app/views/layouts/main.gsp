<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

<nav class="header">
    <div class="container-fluid">
        <div class="navbar-header">

            <asset:image src="LogoRts.png" class="grails-logo"/>
        </div>
        <div class="menu-right">
             <span class="text-titre"> Result Technology Systems</span>
            <h4 class="text-info"> La solution en matière de Technologie</h4>
        </div>
    </div>
</nav>
            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
                <ul class="nav navbar-nav navbar-right">
                    <g:pageProperty name="page.nav" />


                </ul>
            </div>
        </div>
    </div>

    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

<footer>
    <div >

        <h1 class="texteGp"> Groupe du projet:  </h1>

        <ul class="list_groupe">
            <li> Cayo Stanley</li>
            <li> Fleurime Zacharie</li>
            <li> Paulin Ralph Raymond</li>

        </ul>
    </div>
<div class="Copy_right_rts">
    <p>&copy; MBDS 2017-2018<br />
      Projet Grails<br />
        Tous droits r&eacute;serv&eacute;s</p>
</div>
</footer>

</body>
</html>
