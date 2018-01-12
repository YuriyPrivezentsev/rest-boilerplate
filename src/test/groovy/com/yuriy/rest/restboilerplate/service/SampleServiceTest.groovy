package com.yuriy.rest.restboilerplate.service

import com.yuriy.rest.restboilerplate.model.SampleResponse
import spock.lang.Unroll

class SampleServiceTest extends spock.lang.Specification {
    def service = new SampleService()

    @Unroll
    'should produce Hellow #name message for #nameString'() {
        expect:
        service.compileGreeting(nameString) == new SampleResponse("Hello $name")

        where:
        name    | nameString
        'Yuriy' | 'Yuriy'
        'World' | null
        'World' | ''
    }
}
