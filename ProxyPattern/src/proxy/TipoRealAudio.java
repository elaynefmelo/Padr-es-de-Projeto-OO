package proxy;

public class TipoRealAudio implements AudioIF {
	
	private String nomeArquivo;
	
	public TipoRealAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		carregandoArquivo(nomeArquivo);
	}

	private void carregandoArquivo(String nomeArquivo2) {
		// TODO Auto-generated method stub
		System.out.println("Carregando o arquivo "+nomeArquivo+" do disco.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Tocando o arquivo "+nomeArquivo+" do disco.");
	}

	
}
