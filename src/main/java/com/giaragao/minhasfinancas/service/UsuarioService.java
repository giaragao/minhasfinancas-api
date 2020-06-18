package com.giaragao.minhasfinancas.service;

import com.giaragao.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);
	Usuario salvarUsusario (Usuario usuario);
	void validarEmail(String email);
	
}
