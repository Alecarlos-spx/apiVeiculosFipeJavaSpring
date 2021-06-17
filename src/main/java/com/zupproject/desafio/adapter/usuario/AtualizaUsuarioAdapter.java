package com.zupproject.desafio.adapter.usuario;

import com.zupproject.desafio.dto.usuario.AdicionarUsuarioRequestDTO;
import com.zupproject.desafio.dto.usuario.AdicionarUsuarioResponseDTO;
import com.zupproject.desafio.dto.usuario.AtualizarUsuarioRequestDTO;
import com.zupproject.desafio.dto.usuario.AtualizarUsuarioResponseDTO;
import com.zupproject.desafio.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AtualizaUsuarioAdapter {

    public Usuario converterRequestParaUsuario(AtualizarUsuarioRequestDTO request){
        Usuario usuario = new Usuario();


        usuario.setNome(request.getNome());
        usuario.setCpf(request.getCpf());
        usuario.setEmail(request.getEmail());
        usuario.setDatanascimento(request.getDatanascimento());

        return usuario;
    }

    public AtualizarUsuarioResponseDTO converterUsuarioParaResponse(Usuario request){
        AtualizarUsuarioResponseDTO response = new AtualizarUsuarioResponseDTO();

        response.setId(request.getId());
        response.setNome(request.getNome());
        response.setCpf(request.getCpf());
        response.setEmail(request.getEmail());
        response.setDatanascimento(request.getDatanascimento());

        return response;
    }
}
