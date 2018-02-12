package mbds2018_haiti

import com.mbds.Role
import com.mbds.User
import com.mbds.UserRole

class BootStrap {

    def init = { servletContext ->
         def adminRole= new Role( authority: 'ROLE_ADMIN').save()
         def adminUser = new User(username:'admin', password:'admin').save()

        def testUser = new User(username:'user',password:'pass').save()
        def userRole = new Role(authority: 'ROLE_USER').save()

        UserRole.create(adminUser,adminRole,true)
        UserRole.create(testUser,userRole,true)

           assert User.count() ==2
           assert Role.count()==2

    }
    def destroy = {
    }
}
