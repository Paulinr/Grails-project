

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.mbds.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.mbds.UserRole'
grails.plugin.springsecurity.authority.className = 'com.mbds.Role'
grails.plugin.springsecurity.requestMap.className = 'com.mbds.UserRole'
grails.plugin.springsecurity.securityConfigType = 'Annotation'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['ROLE_ADMIN','ROLE_USER']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['ROLE_ADMIN','ROLE_USER']],
	[pattern: '/index.gsp',      access: ['ROLE_ADMIN','ROLE_USER']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],

	[pattern: '/poi/**',        access: ['permitAll']],
	[pattern: '/groupe/**',      access: ['permitAll']],
	[pattern: '/image/**',      access: ['permitAll']],
	[pattern: '/comment/**',      access: ['permitAll']],

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

