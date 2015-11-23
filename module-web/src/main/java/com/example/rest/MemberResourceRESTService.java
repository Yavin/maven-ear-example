package com.example.rest;

import com.example.service.ExampleService;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/members")
@RequestScoped
public class MemberResourceRESTService {

   @EJB
   ExampleService exampleService;

   @GET
   public String listAllMembers() {
      return "ejb call: " + exampleService.whoAmI();
   }
}
