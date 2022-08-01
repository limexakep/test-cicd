package equ.phoenix.simplejpa.mapper;

import equ.phoenix.simplejpa.dto.ClientDto;
import equ.phoenix.simplejpa.entity.ClientEntity;
import equ.phoenix.simplejpa.model.Client;

public class ClientMapper {
    public static Client clientDtoToModel(ClientDto clientDto) {
        return new Client(
                null,
                clientDto.getName(),
                clientDto.getLastName(),
                clientDto.getEmail(),
                clientDto.getPassword()
        );
    }

    public static ClientEntity clientModelToEntity(Client client) {
        return new ClientEntity(
                client.getName(),
                client.getLastName(),
                client.getEmail(),
                client.getPassword()
        );
    }
}
