package validateable

import grails.validation.Validateable

class Widget implements Validateable {
    int width
    int height

    static constraints = {
        width min: 1
        height range: 1..50
    }
}
