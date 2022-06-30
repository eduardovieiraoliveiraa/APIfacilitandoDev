package br.com.facilitandodev.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.facilitandodev.model.Endereco;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/")
public interface FacilitandoAPIResource {
	
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna o endereço do CEP informado"),
		    @ApiResponse(code = 204, message = "Endereço não encontrado"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@GetMapping("consultar-cep/{cep}")
	Endereco consultarCep(@PathVariable("cep") String cep);

}
