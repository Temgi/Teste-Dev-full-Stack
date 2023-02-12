package br.com.primova.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.primova.domain.model.Services;
import br.com.primova.domain.model.Veiculo;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	
	
	@GetMapping
	public String listar() {
		return "Teste API";
	}
	
	@GetMapping("/consulta")
	public Services consultaVeiculo() {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder stringBuilder = new StringBuilder();
		String urlFinal = stringBuilder.append("https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036,5195544").toString();
		
		ResponseEntity<Veiculo> entity = restTemplate.getForEntity(urlFinal, Veiculo.class);
		
		System.out.println(entity.getBody().getServices());
		
		return entity.getBody().getServices();
	}
}
