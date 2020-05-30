package map;

import Enums.ByValue;
import core.Element;

public class RegisterMap {
	public Element titulo = new Element ("h2", ByValue.css);
	//public Element firstName = new Element ("//input[@ng-model='FirstName']", ByValue.xpath);
	public Element firstName = new Element("input", ByValue.css, 0);
	public Element lastName = new Element ("//input[@placeholder='Last Name']", ByValue.xpath);
	public Element endereco = new Element ("textarea", ByValue.css);
	public Element email = new Element ("//input[@ng-model='EmailAdress']", ByValue.xpath);
	public Element telefone = new Element ("//input[@ng-model='Phone']", ByValue.xpath);
	public Element genero = new Element ("//input[@ng-model='radiovalue']", ByValue.xpath);
	public Element hobbie = new Element ("//input[@type='checkbox']", ByValue.xpath);
	public Element file = new Element("imagesrc", ByValue.id);
	public Element logo = new Element("a > img", ByValue.css);
	public Element skills = new Element("Skills", ByValue.id);
	public Element optSkills = new Element("#skills > option", ByValue.css);
	
}
