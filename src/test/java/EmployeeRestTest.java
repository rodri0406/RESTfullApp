/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rodrigo
 */
public class EmployeeRestTest {
    @BeforeClass
    public static void init(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9080;
    }
    
    @Test
    public void testUserFetchesSuccess() {
        RestAssured.get("/service/test/employee/12")
        .then()
        .body("id", equalTo(12))
        .body("firstName", equalTo("rodrigo"))
        .body("lastName", equalTo("medina"))
        .body("designation", equalTo("CEO"));    }

}
