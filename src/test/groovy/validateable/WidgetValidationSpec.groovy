package validateable

import spock.lang.Specification
import spock.lang.Unroll

class WidgetValidationSpec extends Specification {

    @Unroll('width=#widthValue and height=#heightValue should have returned #expectedReturnValue')
    void 'test validation'() {
        expect:
        new Widget(width: widthValue, height: heightValue).validate() == expectedReturnValue

        where:
        widthValue | heightValue | expectedReturnValue
        0          | 0           | false
        0          | 1           | false
        1          | 0           | false
        1          | 1           | true
        100        | 0           | false
        100        | 1           | true
        100        | 100         | false
    }
}
