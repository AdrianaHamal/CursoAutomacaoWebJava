#language : pt
@tag
Funcionalidade: Formulario Register
 

  @tag1
  Cenario: Cadastro de Registro
    Dado que estou na pagina register "Register"
    Quando preencho o campo firstName com "Adriana"
    E preencho o campo lastName com "Hamal"
    E preencho o campo adress com "Avenida Bernardino de Campo"
    E preencho o campo email com "ferreira85@hotmail.com"
    E preencho o campo telefone com "1145822116"
    E clico em "FeMale" do campo gender
    E seleciono os hobbies
    |hobbie|
    |Movies|
    |Hockey|
    E seleciono as linguagens
    |Portuguese|
    |English| 
    E envio o arquivo "teste de automacao.jpg"
    E seleciono a skill "Java"  
    E seleciono o primeiro country com "Brazil" e o segundo nome com "Australia"    
    E seleciono o ano "1985" o mes "March" e o dia "22"
    E preencho o campo password com "Teste123" e o comfirma com password "Teste123"
    E clico em cadastrar
