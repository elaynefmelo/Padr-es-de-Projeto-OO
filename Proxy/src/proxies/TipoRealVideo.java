package proxies;

public class TipoRealVideo implements VideoOriginal {

    private String nomeVideo;

    public TipoRealVideo(String nomeVideo) {
        this.nomeVideo = nomeVideo;
        carregandoVideo(nomeVideo);
    }

   
    public void play() {
        System.out.println("Exibindo o arquivo de nome"+nomeVideo);
        
    }

    public void carregandoVideo(String nomeVideo){
        System.out.println("Carregando arquivo "+nomeVideo+" do disco");
    }

    
    
}

