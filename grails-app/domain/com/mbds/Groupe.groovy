package com.mbds

class Groupe {

    String nom
    String description
    List pois

    static hasMany = [lesImages:Image, pois:Poi]


    static constraints = {
        nom nullable: false, blank:false, unique :true
    }
}
