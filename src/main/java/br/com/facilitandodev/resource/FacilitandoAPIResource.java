package br.com.facilitandodev.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.facilitandodev.model.Endereco;

@RestController
@RequestMapping("/api/v1/")
public interface FacilitandoAPIResource {
	
	@GetMapping("consultar-cep/{cep}")
	Endereco consultarCep(@PathVariable("cep") String cep);

}
