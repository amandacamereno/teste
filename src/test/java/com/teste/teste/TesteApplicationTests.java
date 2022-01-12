package com.teste.teste;

import com.teste.teste.model.DadosProprietario;
import com.teste.teste.model.Endereco;
import com.teste.teste.services.DadosProprietarioService;
import com.teste.teste.services.EnderecoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnderecoIntegrationTests {

	@Autowired
	EnderecoService enderecoService;

	@Autowired
	DadosProprietarioService dadosProprietarioService;

	@Test
	public void testarEnderecoProprietarioComSucesso() {
		Endereco endereco = new Endereco();
		endereco.setRua("Flor");
		endereco.setPais("Brasil");
		endereco.setCidade("Sao Paulo");
		endereco.setEstado("Sao Paulo");
		endereco.setBairro("Cidade Jardins");
		endereco.setCep("123456987");
		endereco.setNumero("123");
		endereco.setComplemento("apto 12");

		enderecoService.salvar(endereco);

		Assertions.assertThat(endereco.getRua()).isNotEmpty();

	}



	@Test()
	public void testarDadosDoPropietarioComSucesso() {
		DadosProprietario dadosProprietario = new DadosProprietario();
		dadosProprietario.setNome("Sandra");
		dadosProprietario.setSobrenome("Carvalho");
		dadosProprietario.setDataNascimento("03/05/1979");
		dadosProprietario.setCpf("0213143343");
		dadosProprietario.setSexo("Feminino");
		dadosProprietario.setRg("1234567");
		dadosProprietario.setTelefone("91234567");

		dadosProprietarioService.salvar(dadosProprietario);

		Assertions.assertThat(dadosProprietario.getCpf()).isNotEmpty();
	}

	@Test
	public void naoDeveCadastrarDadosDoProprietarioComMesmoCpf(){

		DadosProprietario dadosProprietario = new DadosProprietario();
		dadosProprietario.setCpf("32165487698");

		org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> dadosProprietarioService.salvar(dadosProprietario));
	}

}
