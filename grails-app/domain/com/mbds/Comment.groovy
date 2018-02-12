package com.mbds

class Comment {
    String text
    User author

    static belongsTo = Poi

    static constraints = {
    }
}
