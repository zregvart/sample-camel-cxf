package com.mycompany.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWSService {

    @WebMethod
    String sayHello(String request);

}
