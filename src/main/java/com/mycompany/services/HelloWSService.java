package com.mycompany.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://services.mycompany.com", portName = "HelloWSPort")
public interface HelloWSService {

    @WebMethod
    String sayHello(String request);

}
