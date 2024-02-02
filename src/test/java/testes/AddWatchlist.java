package testes;

import appiumCore.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import page.Popular;
import page.PopularFilms;
import page.Search;
import page.SideBar;
import page.Watchlist;
import page.BrowseBy;
import page.CatalogoFilmes;
import page.InfoFilm;

public class AddWatchlist extends BaseTest{
	
	Popular popular = new Popular();
	PopularFilms popFilms = new PopularFilms();
	Search search = new Search();
	InfoFilm infoFilm = new InfoFilm();
	BrowseBy browseBy = new BrowseBy();
	CatalogoFilmes catalogo = new CatalogoFilmes();
	SideBar sideBar = new SideBar();
	Watchlist watchlist = new Watchlist();
	
	 String titulo;//pega o titulo aleatoria para usar na verificacao
	 
	@After
	public void afterScenario() {
		tearDown();
	}	 
	
	 @When("vou para o menu")
	 public void vou_para_o_menu_e_procuro_um_filme() {
		 popular.abrirMenu();
		 sideBar.clicarBuscar();
		 
	 }
	 
	@When("escolho um filme popular na semana")
	public void escolho_um_filme_popular_na_semana() {
		popular.clicarEmPopular();
		popFilms.escolherAleatorioPopular();
				
	}
	
	@When("coloco esse filme na watchlist")
	public void coloco_esse_filme_na_watchlist() {
		titulo = infoFilm.retornaFilme();
		infoFilm.clicarEmAdd();
		infoFilm.clicarBotaoWatchlist();
	}
	
	@When("retorno para a aba popular")
	public void retorno_para_a_aba_popular() throws InterruptedException {
		infoFilm.voltarModal();
		infoFilm.clicarVoltar();
		popFilms.clicarVoltar();
	}

	@Then("^o filme (.*) devera ser exibido na watchlist$")
	public void o_filme_devera_ser_exibido_na_watchlist(String filme) {
		popular.abrirMenu();
		sideBar.clicarWatchlist();
		watchlist.confereFime(filme);
	}
	
	@Then("o filme escolhido devera ser exibido na watchlist")
	public void o_filme_escolhido_escolhido_devera_ser_exibido_na_watchlist() {
		popular.abrirMenu();
		sideBar.clicarWatchlist();
		watchlist.confereFime(titulo);
	}
	
	@When("^procuro por (.*)$")
	public void procuro_por(String categoria) {
		search.clicarPorCategoria(categoria);
	}

	@When("^escolho o filtro (.*) (.*)$")
	public void escolho_a_categoria(String filtro, String genero) {
	   	browseBy.selecionarFiltro(filtro);
	   	browseBy.pesquisarTipo(genero);
	}

	@When("^escolho o filme (.*)$")
	public void escolho_o_filme(String filme) {
		catalogo.EscolherFilme(filme);
	}

	@When("adiciono na watchlist")
	public void adiciono_na_watchlist() {
		infoFilm.clicarEmAdd();
		infoFilm.clicarBotaoWatchlist();
		infoFilm.voltarModal();
	}

	@When("retorno")
	public void retorno() {
		infoFilm.clicarVoltar();
		catalogo.clicarVoltar();
		browseBy.clicarVoltar();
		search.clicarVoltar(); 
	}
}
