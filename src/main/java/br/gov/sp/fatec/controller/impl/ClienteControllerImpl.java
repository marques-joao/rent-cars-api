package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.ClienteController;
import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.request.ClienteUpdateRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
import br.gov.sp.fatec.service.ClienteService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClienteControllerImpl implements ClienteController {

    private final ClienteService clienteService;

    @Override
    public ResponseEntity<ClienteResponse> save(ClienteRequest cliente) {
        ClienteResponse clienteResponse = clienteService.save(cliente);

        return ResponseEntity.ok(clienteResponse);
    }

    @Override
    public ResponseEntity<ClienteResponse> findById(Long id) {
        ClienteResponse clienteResponse = clienteService.findById(id);

        return ResponseEntity.ok(clienteResponse);
    }

    @Override
    public ResponseEntity<List<ClienteResponse>> findAll() {
        List<ClienteResponse> clienteResponses = clienteService.findAll();

        return ResponseEntity.ok(clienteResponses);
    }

    @Override
    public ResponseEntity<Void> updateById(Long id, ClienteUpdateRequest request) {
        clienteService.updateById(id, request);

        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteById(Long id) {
        clienteService.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
