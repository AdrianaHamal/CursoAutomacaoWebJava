package steps;


import java.util.List;
import java.util.Map;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import page.RegisterPage;

public class RegisterSteps {
	RegisterPage registerPage = new RegisterPage();				
	
	@Dado("que estou na pagina register {string}")
	public void queEstouNaPaginaRegister(String titulo) {
	  registerPage.validaTitulo(titulo);
	}

	@Quando("preencho o campo firstName com {string}")
	public void preenchoOCampoFirstNameCom(String firstName) {
	  registerPage.setFirstName(firstName);
	}

	@Quando("preencho o campo lastName com {string}")
	public void preencho_o_campo_lastName_com(String lastName) {
	    registerPage.setLastName(lastName);
	}

	@Quando("preencho o campo adress com {string}")
	public void preencho_o_campo_adress_com(String adress) {
	   registerPage.setEndereco(adress);
	}

	@Quando("preencho o campo email com {string}")
	public void preencho_o_campo_email_com(String email) {
	   registerPage.setEmail(email);
	}

	@Quando("preencho o campo telefone com {string}")
	public void preencho_o_campo_telefone_com(String phone) {
	    registerPage.setTelefone(phone);
	}

	@Quando("clico em {string} do campo gender")
	public void clico_em_do_campo_gender(String gender) {
	 registerPage.clickGenero(gender);
	}

	@Quando("seleciono os hobbies")
	public void selecionoOsHobbies(io.cucumber.datatable.DataTable hobbies) {
	  	List<Map<String, String>> mapHobbies = hobbies.asMaps(String.class, String.class);
		
		for (Map<String, String> map : mapHobbies) {
			registerPage.clickHobbie(map.get("hobbie"));
	} 

}
			 
		@Quando("seleciono as linguagens")
	public void selecionoAsLinguagens(io.cucumber.datatable.DataTable idiomas) {
	    List<String> languages = idiomas.asList();
	    registerPage.selecionaLanguages(languages);
	    	
	}

		@Quando("envio o arquivo {string}")
	public void envio_o_arquivo(String arquivo) {
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\" +arquivo; 
		registerPage.setFile(caminhoArquivo);	
		
		}
	
		@Quando("seleciono a skill {string}")
		public void selecionoASkill(String skill) {
		    registerPage.selecionaSkill(skill);
		}

		@Quando("seleciono o primeiro country com {string} e o segundo nome com {string}")
		public void selecionoOPrimeiroCountryComEOSegundoNomeCom(String country, String countryDois) {
		   registerPage.selecionaCountry(country);
		   registerPage.selecionaCountryDois(countryDois);
		}

		@Quando("seleciono o ano {string} o mes {string} e o dia {string}")
		public void selecionoOAnoOMesEODia(String ano, String mes, String dia) {
		    registerPage.selecionaYear(ano);
		    registerPage.selecionaMonth(mes);
		    registerPage.selecionaDay(dia);
		}

		@Quando("preencho o campo password com {string} e o comfirma com password {string}")
		public void preenchoOCampoPasswordComEOComfirmaComPassword(String password, String confirmaPassword) {
		  registerPage.setPassword(password);
		  registerPage.setConfirmPassword(confirmaPassword);
		}

		@Quando("clico em cadastrar")
		public void clicoEmCadastrar() {
		registerPage.clickSubmit(); 
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
		
}
