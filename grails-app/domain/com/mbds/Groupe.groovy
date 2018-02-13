package com.mbds

class Groupe {

    String nom


    static hasMany = [lesImages:Image, pois:Poi]


    static constraints = {
        nom nullable: false, blank:false, unique :true
    }
}
