
public class questaoOito {
	public static void main(String args[]){ 
		casa minhacasa = new casa();
		minhacasa.setArea_da_casa(500);
		minhacasa.setDono("Arthur de Alpha Centauri");
		minhacasa.setNumero_da_casa(666);
		minhacasa.setQuant_de_banheiros(1);
		minhacasa.setQuant_de_janelas(5);
		minhacasa.setQuant_de_portas(6);
		minhacasa.setQuant_de_quartos(1);
		
		endereco end = new endereco();
		end.setBairro("Pequena Belém");
		end.setEstado("Antartica do Leste");
		end.setPais("Estados Imperias da Nova Antartica");
		end.setPlaneta("Terra");
		end.setRua("frio do oceano profundo, 42");
		minhacasa.setEndereco(end);
		
		sala sal = new sala();
		sal.setNumero_de_sofas(2);
		sal.setArea_da_sala(100);
		sal.setTem_lareira(true);
		minhacasa.setSala(sal);
		
		cozinha cozi = new cozinha();
		cozi.setTem_fogao(true);
		cozi.setTem_geladeira(true);
		cozi.setTem_pia(true);
		cozi.setQuant_de_pias(2);
		cozi.setArea_da_cozi(100);
		minhacasa.setCozinha(cozi);
		
		garagem garage = new garagem();
		garage.setQuant_de_carros(5);
		garage.setArea_da_garagem(100);
		minhacasa.setGaragem(garage);
		
		quarto quart = new quarto();
		quart.setArea_do_quarto(50);
		quart.setA_prova_de_som(true);
		minhacasa.setQuarto(quart);
		
		banheiro ban = new banheiro();
		ban.setArea_do_banheiro(50);
		ban.setPega_wifi(true);
		ban.setTem_chuveiro(true);
		ban.setTem_pia(true);
		ban.setTem_vaso(true);
		minhacasa.setBanheiro(ban);
		
		endereco cas= minhacasa.getEndereco();
		System.out.println("informações da Casa: ");
		System.out.printf("dono atual: %s%nendereço: %n rua: %s%n bairro: %s%n estado: %s%n país: %s%n planeta: %s%nnº de janelas: %d%nnº de portas: %d%nnº de  banheiros: %d%nnº de quartos: %d%n", minhacasa.getDono(), cas.getRua(), 
				cas.getBairro(), cas.getEstado(), cas.getPais(), cas.getPlaneta() ,minhacasa.getQuant_de_janelas(), minhacasa.getQuant_de_portas(), minhacasa.getQuant_de_banheiros(), minhacasa.getQuant_de_quartos());
		System.out.println("casa informações - sala:");
		sala sa = minhacasa.getSala();
		System.out.printf("%narea da sala: %d%nnumero de sofas: %d%n%n", sa.getArea_da_sala(), sa.getNumero_de_sofas());
		quarto quar = minhacasa.getQuarto();
		System.out.println("casa informações - quarto:");
		String resp;
		if(quar.isA_prova_de_som() == true) {
			resp = "sim";
		}
		else {
			resp = "nao";
		}
		String respo;
		String respon;
		String respond;
		System.out.printf("area do quarto: %d%nquarto a prova de som: %s%n%n", quar.getArea_do_quarto(), resp);
		cozinha co = minhacasa.getCozinha();
		System.out.println("casa informações - cozinha:");
		if(co.isTem_fogao() == true) {
			resp = "sim";
		}
		else {
			resp = "nao";
		}
		if(co.isTem_geladeira() == true) {
			respon = "sim";
		}
		else {
			respon = "nao";
		}
		if(co.isTem_pia() == true) {
			respond = "sim";
		}
		else {
			respond = "nao";
		}
		System.out.printf("area da cozinha: %d%ntem fogao: %s%ntem geladeira: %s%ntem pia: %s%n%n", co.getArea_da_cozi(), resp, respon, respond);
		banheiro ba = minhacasa.getBanheiro();
		System.out.println("casa informações - banheiro:");
		if(ba.isPega_wifi() == true) {
			resp = "sim";
		}
		else {
			resp = "nao";
		}
		if(ba.isTem_chuveiro() == true) {
			respo = "sim";
		}
		else {
			respo = "nao";
		}
		if(ba.isTem_pia() == true) {
			respon = "sim";
		}
		else {
			respon = "nao";
		}
		if( ba.isTem_vaso() == true) {
			respond = "sim";
		}
		else {
			respond = "nao";
		}
		System.out.printf("area do banheiro: %d%ntem wifi: %s%ntemchuveiro: %s%ntem pia: %s%ntem vaso: %s%n%n", ba.getArea_do_banheiro(), resp, respo, respon, respond);
		garagem ga = minhacasa.getGaragem();
		System.out.println("casa informações - garagem:");
		System.out.printf("area da garagem: %d%nnumero de carros: %d", ga.getArea_da_garagem(), ga.getQuant_de_carros());
	}
}
class casa{
	private String dono;
	private int numero_da_casa;
	private int quant_de_janelas;
	private int quant_de_portas;
	private int quant_de_banheiros;
	private int quant_de_quartos;
	private int area_da_casa;
	private endereco endereco;
	private sala sala;
	private quarto quarto;
	private cozinha cozinha;
	private banheiro banheiro;
	private garagem garagem;
	
	
	
	public endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}
	public sala getSala() {
		return sala;
	}
	public void setSala(sala sala) {
		this.sala = sala;
	}
	public quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(quarto quarto) {
		this.quarto = quarto;
	}
	public cozinha getCozinha() {
		return cozinha;
	}
	public void setCozinha(cozinha cozinha) {
		this.cozinha = cozinha;
	}
	public banheiro getBanheiro() {
		return banheiro;
	}
	public void setBanheiro(banheiro banheiro) {
		this.banheiro = banheiro;
	}
	public garagem getGaragem() {
		return garagem;
	}
	public void setGaragem(garagem garagem) {
		this.garagem = garagem;
	}
	
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public int getNumero_da_casa() {
		return numero_da_casa;
	}
	public void setNumero_da_casa(int numero_da_casa) {
		this.numero_da_casa = numero_da_casa;
	}
	public int getQuant_de_janelas() {
		return quant_de_janelas;
	}
	public void setQuant_de_janelas(int quant_de_janelas) {
		this.quant_de_janelas = quant_de_janelas;
	}
	public int getQuant_de_portas() {
		return quant_de_portas;
	}
	public void setQuant_de_portas(int quant_de_portas) {
		this.quant_de_portas = quant_de_portas;
	}
	public int getQuant_de_banheiros() {
		return quant_de_banheiros;
	}
	public void setQuant_de_banheiros(int quant_de_banheiros) {
		this.quant_de_banheiros = quant_de_banheiros;
	}
	public int getQuant_de_quartos() {
		return quant_de_quartos;
	}
	public void setQuant_de_quartos(int quant_de_quartos) {
		this.quant_de_quartos = quant_de_quartos;
	}
	public int getArea_da_casa() {
		return area_da_casa;
	}
	public void setArea_da_casa(int area_da_casa) {
		this.area_da_casa = area_da_casa;
	}
	
}
class endereco{
	private String rua;
	private String bairro;
	private String estado;
	private String pais;
	private String planeta;
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPlaneta() {
		return planeta;
	}
	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	
}
class sala{
	private int numero_de_sofas;
	private int area_da_sala;
	private boolean tem_lareira;
	public int getNumero_de_sofas() {
		return numero_de_sofas;
	}
	public void setNumero_de_sofas(int numero_de_sofas) {
		this.numero_de_sofas = numero_de_sofas;
	}
	public int getArea_da_sala() {
		return area_da_sala;
	}
	public void setArea_da_sala(int area_da_sala) {
		this.area_da_sala = area_da_sala;
	}
	public boolean isTem_lareira() {
		return tem_lareira;
	}
	public void setTem_lareira(boolean tem_lareira) {
		this.tem_lareira = tem_lareira;
	}
	
}
class cozinha{
	private int quant_de_pias;
	private int area_da_cozi;
	private boolean tem_fogao;
	private boolean tem_geladeira;
	private boolean tem_pia;
	public int getQuant_de_pias() {
		return quant_de_pias;
	}
	public void setQuant_de_pias(int quant_de_pias) {
		this.quant_de_pias = quant_de_pias;
	}
	public int getArea_da_cozi() {
		return area_da_cozi;
	}
	public void setArea_da_cozi(int area_da_cozi) {
		this.area_da_cozi = area_da_cozi;
	}
	public boolean isTem_fogao() {
		return tem_fogao;
	}
	public void setTem_fogao(boolean tem_fogao) {
		this.tem_fogao = tem_fogao;
	}
	public boolean isTem_geladeira() {
		return tem_geladeira;
	}
	public void setTem_geladeira(boolean tem_geladeira) {
		this.tem_geladeira = tem_geladeira;
	}
	public boolean isTem_pia() {
		return tem_pia;
	}
	public void setTem_pia(boolean tem_pia) {
		this.tem_pia = tem_pia;
	}
	
}
class garagem{
	private int quant_de_carros;
	private int area_da_garagem;
	public int getQuant_de_carros() {
		return quant_de_carros;
	}
	public void setQuant_de_carros(int quant_de_carros) {
		this.quant_de_carros = quant_de_carros;
	}
	public int getArea_da_garagem() {
		return area_da_garagem;
	}
	public void setArea_da_garagem(int area_da_garagem) {
		this.area_da_garagem = area_da_garagem;
	}
	
}
class quarto{
	private int area_do_quarto;
	private boolean a_prova_de_som;
	public int getArea_do_quarto() {
		return area_do_quarto;
	}
	public void setArea_do_quarto(int area_do_quarto) {
		this.area_do_quarto = area_do_quarto;
	}
	public boolean isA_prova_de_som() {
		return a_prova_de_som;
	}
	public void setA_prova_de_som(boolean a_prova_de_som) {
		this.a_prova_de_som = a_prova_de_som;
	}
	
}
class banheiro{
	private int area_do_banheiro;
	private boolean tem_vaso;
	private boolean tem_chuveiro;
	private boolean tem_pia;
	private boolean pega_wifi;
	public int getArea_do_banheiro() {
		return area_do_banheiro;
	}
	public void setArea_do_banheiro(int area_do_banheiro) {
		this.area_do_banheiro = area_do_banheiro;
	}
	public boolean isTem_vaso() {
		return tem_vaso;
	}
	public void setTem_vaso(boolean tem_vaso) {
		this.tem_vaso = tem_vaso;
	}
	public boolean isTem_chuveiro() {
		return tem_chuveiro;
	}
	public void setTem_chuveiro(boolean tem_chuveiro) {
		this.tem_chuveiro = tem_chuveiro;
	}
	public boolean isTem_pia() {
		return tem_pia;
	}
	public void setTem_pia(boolean tem_pia) {
		this.tem_pia = tem_pia;
	}
	public boolean isPega_wifi() {
		return pega_wifi;
	}
	public void setPega_wifi(boolean pega_wifi) {
		this.pega_wifi = pega_wifi;
	}
	
}
