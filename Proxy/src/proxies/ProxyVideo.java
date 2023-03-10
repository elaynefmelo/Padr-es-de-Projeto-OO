package proxies;

public class ProxyVideo implements VideoOriginal {

    private TipoRealVideo meuVideo;
    private String nomeVideo;

    public ProxyVideo(String nomeVideo){
        this.nomeVideo = nomeVideo;

    }

    
    public void play() {
        if(meuVideo == null){

            System.out.println("Instância inexistente...Criando instância de TipoRealVideo....");
            meuVideo = new TipoRealVideo(nomeVideo);

        }else{
            System.out.println("Recuperando instância já criada de TipoRealVideo....");
        }
        
        meuVideo.play();
    }
    
}

