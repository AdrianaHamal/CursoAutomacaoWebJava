package page;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import map.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	
    public RegisterPage validaTitulo(String titulo) {
    	Assert.assertEquals(titulo, registerMap.titulo.getText());
    	return this;
     }
    
    public void setFirstName(String firstName) {
	 registerMap.firstName.sendKeys(firstName);
	 
 }
    
    public void setLastName(String lastName) {
    	registerMap.lastName.sendKeys(lastName);
    	
    }
    
    public void setEndereco(String endereco) {
    	registerMap.endereco.sendKeys(endereco);
    	
    }
    
    public void setEmail(String email) {
    	registerMap.email.sendKeys(email);
    	
    }
    
    public void setTelefone(String telefone) {
    	registerMap.telefone.sendKeys(telefone);
    }
    
    public void clickGenero(String genero) {
    	registerMap.genero.clickElementText(genero);
    	
    }
    
    public void clickHobbie(String hobbie) {
    	registerMap.hobbie.clickElementText(hobbie);
    	
    }
    
    public void setFile(String file) {
    	registerMap.file.sendKeys(file);
    	
    }
    
    public void validaLogo(String logo) {
    	String[] _logo = registerMap.logo.getAttribute("src").split("/");
    	assertEquals(logo, _logo[_logo.length -1]);
    }
    
    public void selecionaSkill(String skill) {
    	registerMap.skills.selectText(skill);
    	
    }
    
    public void selecionaSkills(String skill) {
    	registerMap.skills.click();
    	registerMap.optSkills.clickElementText(skill);
    	registerMap.skills.click();
    }
}
