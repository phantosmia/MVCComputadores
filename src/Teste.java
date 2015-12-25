import java.text.SimpleDateFormat;
import java.util.Date;

import com.db4o.ObjectSet;

import controller.BuscaCDetalhada;
import controller.BuscaCSimples;
import controller.BuscaFDetalhada;
import controller.BuscaFunc;
import controller.BuscaFuncionario;
import model.EspecificacaoComp;
import model.Estoque;
import model.FormaDePagamento;
import model.Funcionario;
import model.HistoricoCompra;
import model.ItemDaCompra;
import model.MatchesComp2;
import model.MatchesFunc1;
import model.Processador;
import model.RecursosHumanos;
import model.RegistroDeCompras;
import model.SO;

import view.ViewGUI;
//
public class Teste {
	static RecursosHumanos recursosHumanos;
	static Estoque estoque;
	static RegistroDeCompras registroDeCompras;
	public static void main(String[] args) {
		recursosHumanos = recursosHumanos.getInstance();
		estoque = estoque.getInstance();
		registroDeCompras = registroDeCompras.getInstance();
		inicializarDados(estoque,recursosHumanos,registroDeCompras);
		ViewGUI t = new ViewGUI();
		t.setVisible(true);
		BuscaFuncionario bf = new BuscaFuncionario(t,estoque);
	    t.setBuscaComputador(bf);
	 	estoque.registerObserver(t);
		estoque.searchComp(new EspecificacaoComp(Processador.Intel,"SASA",20,SO.Windows,500));
		BuscaCDetalhada cd = new BuscaCDetalhada(t,registroDeCompras);
		BuscaFDetalhada fd = new BuscaFDetalhada(t,recursosHumanos);
		t.setBuscaCompra(cd);
		t.setBuscaFunc(fd);
		registroDeCompras.registerObserver(t);
		recursosHumanos.registerObserver(t);
		

	recursosHumanos.searchFunc(new Funcionario(1,"Paloma",1800,1,"455.663.378-80",new MatchesFunc1()));
	//	registroDeCompras.searchPurchase(new HistoricoCompra(new ItemDaCompra(1,1,5), 1, 1, new Date("1995/04/12"), FormaDePagamento.Cartao,new MatchesComp2()));
	}
	private static void inicializarDados(Estoque estoque, RecursosHumanos r,
			RegistroDeCompras re){
		estoque.addComput(1, new EspecificacaoComp(Processador.Intel,"SASA",20,SO.Windows,500), 1500, 3);
		r.addFunc(0, "Lucas", 1700, 1, "455.663.378-80");
		r.addFunc(1, "Paloma", 1800, 1, "455.633.378-80");
		re.addComp(new ItemDaCompra(1,1,5), 1, 1, new Date("1995/04/12"), FormaDePagamento.Cartao);
	}
}
