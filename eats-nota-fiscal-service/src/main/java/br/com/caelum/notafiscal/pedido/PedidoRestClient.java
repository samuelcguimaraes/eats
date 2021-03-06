package br.com.caelum.notafiscal.pedido;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://localhost:8080", name = "monolito")
public interface PedidoRestClient {

	@GetMapping("/pedidos/{pedidoId}")	
	public PedidoDto detalhaPorId(@PathVariable("pedidoId") Long pedidoId);

}
