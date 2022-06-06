package br.com.facilitandodev.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.facilitandodev.model.Endereco;
import br.com.facilitandodev.resource.FacilitandoAPIResource;
import br.com.facilitandodev.viacep.client.ViaCEPClient;

@Service
public class FacilitandoAPIResourceImpl implements FacilitandoAPIResource {
	
	@Autowired
	private ViaCEPClient viaCEPClient;

	@Override
	public Endereco consultarCep(String cep) {
		return viaCEPClient.buscaEnderecoPor(cep);
	}
	
	

}
