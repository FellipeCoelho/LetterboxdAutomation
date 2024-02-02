package testes;

import appiumCore.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import page.AddFilm;
import page.DetalhesDiario;
import page.Diario;
import page.EditReview;
import page.Login;
import page.Popular;
import page.SideBar;
import page.Splash;
import page.Watched;


public class AddFilme{
	
	Splash splash = new Splash();
	Login login = new Login();
	Popular popular = new Popular();
	SideBar sideBar = new SideBar();
	AddFilm addFilm = new AddFilm();
	Watched watched = new Watched();
	EditReview review = new EditReview();
	Diario diario = new Diario();
	DetalhesDiario detalhes = new DetalhesDiario();
	
	//@After
	//public void afterScenario() {
	//	tearDown();
	//}
	
	@Given("^estou conectado com as credenciais (.*) (.*)$")
	public void estou_conectado_com_as_credenciais_(String username, String senha) {
		splash.navegarParaLogin();
		splash.EscolherOpcaoLogin();
		login.fazerLogin(username, senha);

	}
	
	@When("^adiciono o filme (.*)$")
	public void adiciono_o_filme_(String filme) {
		popular.clicarEmAdicionar();
	    addFilm.imputFilme(filme);
	}

	@When("^seleciono uma data (.*)$")
	public void seleciono_uma_data_(String data) {
		watched.alterarData(data);

	}
	
	@When("dou uma nota")
	public void dou_uma_nota() {
		watched.dar5estrelas();
	}

	@When("dou like")
	public void dou_like() {
		watched.darLike();
	}

	@When("^faco uma review (.*)$")
	public void faco_uma_review_(String comentario) {
		watched.clicarReview();
		review.escreverReview(comentario);
	}

	@When("salvo a review")
	public void salvo_a_review() {
		watched.salvar();
	}

	@Then("^o filme (.*) devera ser exibido no diario$")
	public void o_filme_titanic_devera_ser_exibido_no_diario(String filme) {
		popular.abrirMenu();
		sideBar.clicarDiario();
	    diario.selecionarFilmeNaLista(filme);
	}
	
	@Then("^o filme (.*) e (.*) deverao estar corretos")
	public void o_filme_e_review_deverao_estar_corretas(String filme, String comentario) {
		detalhes.conferirTitulo(filme);
	    detalhes.conferirReview(comentario);
	} 
	
	@Then("^o filme (.*) e (.*) e (.*) deverao estar corretos")
	public void o_filme_e_review_data_deverao_estar_corretas(String filme, String comentario, String data) {
		detalhes.conferirTitulo(filme);
	    detalhes.conferirReview(comentario);
	    detalhes.conferirData(data);
	}  
   
	    
}
