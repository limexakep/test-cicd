package equ.phoenix.simplejpa.service;

import equ.phoenix.simplejpa.mapper.ClientMapper;
import equ.phoenix.simplejpa.model.Client;
import equ.phoenix.simplejpa.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {
  private final ClientRepository repository;

  public void addClient(Client client) {
    repository.save(ClientMapper.clientModelToEntity(client));
  }

  /*
  Реализуйте CRUD-операции для клиента:
    •	Создание нового клиента
    •	Получение клиента по его id
    •	Получение всех клиентов
    •	Обновление клиента
    •	Удаление клиента

    Вы НЕ должны менять что-то в репозитории.
   */
}
