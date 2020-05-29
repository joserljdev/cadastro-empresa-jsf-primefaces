package br.com.joserljdev.cadastroempresa.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.joserljdev.cadastroempresa.model.Empresa;
import br.com.joserljdev.cadastroempresa.repository.Empresas;
import br.com.joserljdev.cadastroempresa.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}

}