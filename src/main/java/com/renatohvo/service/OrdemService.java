package com.renatohvo.service;

import com.renatohvo.model.Ordem;
import com.renatohvo.model.Usuario;
import com.renatohvo.repository.OrdemRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.SecurityContext;

import java.time.LocalDateTime;
import java.util.Optional;

@ApplicationScoped
public class OrdemService {

    @Inject
    OrdemRepository ordemRepository;

    public void inserir(SecurityContext securityContext, Ordem ordem) {
        Optional<Usuario> usuarioOptional = Usuario.findByIdOptional(ordem.getUserId());
        Usuario usuario = usuarioOptional.orElseThrow();
        if(!usuario.getUsername().equals(securityContext.getUserPrincipal().getName())) {
            throw new RuntimeException("Usuário logado é diferente do userId");
        }
        ordem.setData(LocalDateTime.now());
        ordem.setStatus("ENVIADA");
        ordemRepository.persist(ordem);
    }

}
