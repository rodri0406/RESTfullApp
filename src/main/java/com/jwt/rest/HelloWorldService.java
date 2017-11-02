/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.rest;

/**
 *
 * @author rodrigo
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
  
@Path("/hello")
public class HelloWorldService {
  
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
  
        String output = "Welcome   : " + name;
  
        return Response.status(200).entity(output).build();
  
    }
  
}
