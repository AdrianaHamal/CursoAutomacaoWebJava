package cursoAutomacao;




import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.Driver;
import page.RegisterPage;

public class executaCurso {
RegisterPage registerPage = new RegisterPage();


 public void test1 () {
		System.out.println("teste1");
	}
	
	public void validoSoma () {
	int _soma = soma(10 , 5);
	Assert.assertEquals(15, _soma);
	
	}
	
	@Test
	public void preencheFormulario() {
		registerPage.validaTitulo("Register");
		registerPage.setFirstName("Adriana");
		registerPage.setLastName("Hamal");
		registerPage.setEndereco("Avenida Bernardino de Campos");
		registerPage.setEmail("ferreira85@hotmail.com");
		registerPage.setTelefone("1145822116");
		registerPage.clickGenero("FeMale");
		registerPage.clickHobbie("Movies");
		registerPage.clickHobbie("Hockey");
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\teste de automacao.jpg"; 
		registerPage.setFile(caminhoArquivo);
		registerPage.validaLogo("original.png");
		//registerPage.selecionaSkill("Java");
		registerPage.selecionaSkills("Java");
		
		List<String> languages = new ArrayList<String>();
		languages.add("Portuguese");
		languages.add("English");
		registerPage.selecionaLanguages(languages);
		registerPage.selecionaCountry("Brazil");
		registerPage.selecionaCountryDois("Australia");
		registerPage.selecionaYear("1985");
		registerPage.selecionaMonth("March");
		registerPage.selecionaDay("22");
		registerPage.setPassword("Teste123");
		registerPage.setConfirmPassword("Teste123");
		//registerPage.clickSubmit();
		Driver.aguardaTempo(3000);
		
	
	}	
	 

		 	
	@Before
	public void abreNavegador () {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
	}
	
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
		
	}
	
public int soma(int a, int b) {
	int soma = a + b;
	return soma;
	
}

	

}
