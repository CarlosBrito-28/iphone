public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private String modelo;
    private String numeroSerie;

    public Iphone(String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void ligar(){
        System.out.println("Ligando....");
    }

    public void desligar(){
        System.out.println("Desligando....");
    }


    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atenderChamada() {

    }

    @Override
    public void iniciarCorreioVoz(String numero, String mensagem) {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void tocarMusica(String musica) {

    }

    @Override
    public void pausarMusica() {

    }

    @Override
    public void selecionarMusica() {

    }
}
