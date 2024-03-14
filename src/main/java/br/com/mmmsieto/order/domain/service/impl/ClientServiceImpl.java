package br.com.mmmsieto.order.domain.service.impl;

import br.com.mmmsieto.order.app.v1.controller.dtos.ClientAddressEntity;
import br.com.mmmsieto.order.app.v1.controller.dtos.ClientEntity;
import br.com.mmmsieto.order.domain.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public List<ClientEntity> list() {
        return null;
    }

    @Override
    public List<ClientAddressEntity> listClient() {
        return null;
    }

    @Override
    public List<ClientAddressEntity> listWithCompletableFuture() {
        return null;
    }

    @Override
    public CompletableFuture<ClientAddressEntity> getCompletableFuture(ClientEntity clientEntity) {
        return ClientService.super.getCompletableFuture(clientEntity);
    }

    @Override
    public ClientAddressEntity getClientAddress(ClientEntity clientEntity) {
        return null;
    }
}
