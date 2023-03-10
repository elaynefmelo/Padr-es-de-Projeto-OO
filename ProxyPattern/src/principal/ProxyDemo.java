package principal;

import proxy.AudioIF;
import proxy.ProxyAudio;

public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioIF meuAudio = new ProxyAudio("meuArquivo.mp3"); //Não instancia a classe RealAudio e sim a classe ProxyAudio
		
		meuAudio.play();
		System.out.println();
		
		meuAudio.play();
		System.out.println();
	}

}
