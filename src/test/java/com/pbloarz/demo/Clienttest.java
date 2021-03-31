package com.pbloarz.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.pbloarz.demo.model.Client;
import com.pbloarz.demo.model.Communication;
import com.pbloarz.demo.model.Plan;
import com.pbloarz.demo.repository.ClientDao;
import com.pbloarz.demo.repository.CommunicationDao;
import com.pbloarz.demo.service.ClientService;
import com.pbloarz.demo.service.CommunicationService;
import org.apache.coyote.http11.Http11AprProtocol;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestMethod;


public class Clienttest {

    private ClientDao clientDao = mock(ClientDao.class);
    @Autowired
    private ClientService clientService = new ClientService();
    @Autowired
    private CommunicationDao communicationDao = mock(CommunicationDao.class);
    @Autowired
    private CommunicationService communicationService = new CommunicationService();

    void  setup(){
        Client client = new Client();
        client.setId(1);
        client.setCellphone("321822694");
        client.setCity("lorica");
        client.setEmail("pablo@gmail.com");
        client.setFirstName("pablo");
        client.setLastname("romero");
        client.setRut("3343434jf");

        Plan plan = new Plan();
        plan.setName("inff");
        plan.setCode("eedddi3");
        plan.setId(1);
        plan.setCharacteristies("sfsdfsdfsdfdsfdsf");

        Communication communication = new Communication();

        communication.setId(1);
        communication.setCliente(client);
        communication.setPlan(plan);
        List<Communication> librosMock = new ArrayList<>();
        when(communicationDao.findAll()).thenReturn(librosMock);
    }

    @Test
    void create(){
        setup();

    }
}
