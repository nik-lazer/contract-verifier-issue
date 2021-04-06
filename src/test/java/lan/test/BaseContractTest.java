package lan.test;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class BaseContractTest {
    @Autowired
    private MockMvc mockMvc;
    @BeforeEach
    public void setupMockMvc() {
        RestAssuredMockMvc.mockMvc(mockMvc);
    }
}
