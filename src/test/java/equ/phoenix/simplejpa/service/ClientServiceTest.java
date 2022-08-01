package equ.phoenix.simplejpa.service;

import equ.phoenix.simplejpa.entity.ClientEntity;
import equ.phoenix.simplejpa.model.Client;
import equ.phoenix.simplejpa.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class ClientServiceTest {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ClientService clientService;

    private static final String NAME = "Vasiliy";
    private static final String LASTNAME = "Vasilyev";
    private static final String EMAIL = "vasiliy@mail.ru";
    private static final String PASSWORD = "vasiliy123";

    @Test
    void addClient() {
        clientService.addClient(new Client(null, NAME, LASTNAME, EMAIL, PASSWORD));

        ClientEntity testClientEntity = clientRepository.getClientEntityByEmail(EMAIL);

        assertNotNull(testClientEntity);

        assertEquals(NAME, testClientEntity.getName());
        assertEquals(LASTNAME, testClientEntity.getLastName());
        assertEquals(EMAIL, testClientEntity.getEmail());
        assertEquals(PASSWORD, testClientEntity.getPassword());

        clientRepository.delete(testClientEntity);
    }

    @Test
    void intClient() {
        ClientRepository clientRepo = Mockito.mock(ClientRepository.class);
        Mockito.when(clientRepo.findById(1L)).thenReturn(
                Optional.of(new ClientEntity(
                        null,
                        null, null, null, null)
                )
        );

    }
}