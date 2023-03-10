package proxy;

public class ProxyAudio implements AudioIF{
	//Classe visivel ao usuario externo
	private TipoRealAudio meuAudio; //esconde a implemnatação TipoRealAudio
	private String nomeArquivo;
	
	public ProxyAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		 if(meuAudio == null) {
			 System.out.println("Instância não existia... Criando instancia TipoRealAudio...");
			 meuAudio = new TipoRealAudio(nomeArquivo);
		 } else {
			 System.out.println("Recuperando instância anteriormente criada de TipoRealAudio...");
		 } 
		 meuAudio.play();
	}
}
