/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.rest;

import com.jwt.rest.beans.Employee;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rodrigo
 */
@Path("/employee")
public class EmployeResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Employee getEmployee(@PathParam("id") final Long id){
        final Employee emp = new Employee();
        emp.setId(id);
        emp.setFirstName("rodrigo");
        emp.setLastName("medina");
        emp.setDesignation("CEO");
        return emp;
    }
}
