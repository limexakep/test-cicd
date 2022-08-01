package equ.phoenix.simplejpa.controller;

import equ.phoenix.simplejpa.dto.ClientDto;
import equ.phoenix.simplejpa.mapper.ClientMapper;
import equ.phoenix.simplejpa.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/")
    public void createClient(@RequestBody ClientDto clientDto) {
        clientService.addClient(ClientMapper.clientDtoToModel(clientDto));
    }
}
