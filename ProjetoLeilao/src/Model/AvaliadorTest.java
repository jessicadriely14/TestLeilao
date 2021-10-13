package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvaliadorTest {
	private Usuario jiah;
	private Usuario eunseok;
	private Usuario anna;
	private Leilao leilao;
	private Avaliador avaliador;
	
	@BeforeEach
	public void instanciarObjetos() {
	jiah = new Usuario("Jiah");
	eunseok = new Usuario("EunSeok");
	anna = new Usuario("Anna");
	leilao = new Leilao("Samsung Galaxy Buds+");
	avaliador = new Avaliador();
	
	}

	@Test
	 public void testarMaiorLanceSemOrdem() {
		
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 400.0;
		assertEquals(valorEsperado, avaliador.getMaiorLance(), 0.001);
	}
	
	@Test
	 public void testarMaiorLanceComOrdem() {
		
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 400.0;
		assertEquals(valorEsperado, avaliador.getMaiorLance(), 0.001);
	}
	
	@Test
	 public void testarMenorLanceSemOrdem() {
			
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 250.0;
		assertEquals(valorEsperado, avaliador.getMenorLance(), 0.001);
	}
	
	@Test
	 public void testarMenorLanceComOrdem() {
		
		
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 250.0;
		assertEquals(valorEsperado, avaliador.getMenorLance(), 0.001);
	}
	
	
	@Test
	 public void testarMaiorLanceComOrdemDecrescente() {
		
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 400.0;
		assertEquals(valorEsperado, avaliador.getMaiorLance(), 0.001);
	}
	
	@Test
	 public void testarMenorLanceComOrdemDecrescent() {
		
		//Cria��o de Lances
		leilao.propoe(new Lance(jiah, 300));
		leilao.propoe(new Lance(eunseok, 400));
		leilao.propoe(new Lance(anna, 250));
		
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 250.0;
		assertEquals(valorEsperado, avaliador.getMenorLance(), 0.001);
	}

	@Test
	 public void testarMaiorLanceComUmLance() {
	
		//Cria��o de Lances
		leilao.propoe(new Lance(eunseok, 400));
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 400.0;
		assertEquals(valorEsperado, avaliador.getMaiorLance(), 0.001);
	}
	
	@Test
	 public void testarMenorLanceComUmLance() {
		
		
		//Cria��o de Lances
		leilao.propoe(new Lance(eunseok, 400));
	
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= 400.0;
		assertEquals(valorEsperado, avaliador.getMenorLance(), 0.001);
	}
	
	@Test
	 public void testarMaiorLanceSemLance() {
		
		
		//Cria��o de Lances


		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(valorEsperado, avaliador.getMaiorLance(), 0.001);
	}
	
	@Test
	 public void testarMenorLanceSeLance() {

		//Cria��o de Lances

	
		
		// Executar
		avaliador.avalia(leilao);
		
		//comparar
		double valorEsperado= Double.POSITIVE_INFINITY;
		assertEquals(valorEsperado, avaliador.getMenorLance(), 0.001);
	}
}
