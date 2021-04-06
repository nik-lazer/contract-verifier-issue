package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'anyOf test'
    request {
        method 'POST'
        url ("hello")
        headers {
            contentType applicationJson()
        }
        body(
                type: anyOf("VAL", "VAL+VAL")
        )
    }
    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                type: fromRequest().body("type")
        )
    }
}