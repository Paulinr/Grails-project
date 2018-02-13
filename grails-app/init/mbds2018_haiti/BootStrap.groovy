package mbds2018_haiti

import com.mbds.Comment
import com.mbds.Groupe
import com.mbds.Image
import com.mbds.Poi
import com.mbds.Role
import com.mbds.User
import com.mbds.UserRole

class BootStrap {

    def init = { servletContext ->

        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: 'admin',
                enabled: true).save(failOnError: true)

        def adminRole= Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)


        def testUser = User.findByUsername("user") ?: new User(
                username: 'user',
                password: 'user',
                enabled: true).save(failOnError: true)

        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)


        def modeUser = User.findByUsername("moderator") ?: new User(
                username: 'moderator',
                password: 'moderator',
                enabled: true).save(failOnError: true)

        def modeRole = Role.findByAuthority('ROLE_MODER') ?: new Role(authority: 'ROLE_MODER').save(failOnError: true)

        def groupe = new Groupe(nom: 'Compagnie').save(failOnError: true)

        def PoiDiGICEL =(new Poi(nom: 'DIGICEL',description: 'Compagnie telephonique',latitude: 22.40, longitude: 15.13)).save()
        groupe.addToPois(PoiDiGICEL).addToLesImages(new Image(nom: 'images2.png')).save()

        def PoiComcel =(new Poi(nom: 'Comcel',description: 'Compagnie telephonique', latitude: 22.40, longitude: 15.13)).save()
        groupe.addToPois(PoiComcel).addToLesImages(new Image(nom: 'images3.png')).save()

        def PoiZte =(new Poi(nom: 'Zte',description: 'Compagnie telephonique', latitude: 22.40, longitude:15.13)).save()
        groupe.addToPois(PoiZte).addToLesImages(new Image(nom: 'images4.png')).save()


        def PoiHaitel =(new Poi(nom: 'HAITEL',description: 'Compagnie telephonique', latitude: 35.5, longitude: 18.35)).save()
        groupe.addToPois(PoiHaitel).addToLesImages(new Image(nom: 'images5.png')).save()


        //def adminRole= new Role( authority: 'ROLE_ADMIN').save()
         //def adminUser = new User(username:'admin', password:'admin').save()

       // def testUser = new User(username:'user',password:'pass').save()
       // def userRole = new Role(authority: 'ROLE_USER').save()

        UserRole.create(adminUser,adminRole,true)
        UserRole.create(testUser,userRole,true)
        UserRole.create(modeUser,modeRole,true)


           //assert User.count()==2
           //assert Role.count()==2

    }
    def destroy = {
    }
}
