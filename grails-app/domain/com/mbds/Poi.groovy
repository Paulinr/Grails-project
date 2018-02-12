package com.mbds

class Poi {
    String nom
    String description
    Double latitude
    Double longitude


    static hasMany = [images:Image, comments:Comment]


    static constraints = {

        nom nullable:false, blank:false
        description nullable : false, blank:false
    }
}
