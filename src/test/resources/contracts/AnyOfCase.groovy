package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'anyOf test'
    request {
        method 'POST'
        url ("hello")
        body(
                type: anyOf("VAL", "VAL+VAL")
        )
    }
    response {
        status OK()
    }
}