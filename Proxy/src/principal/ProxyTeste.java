package principal;

import proxies.ProxyVideo;

public class ProxyTeste {
    public static void main(String[] args) {

        ProxyVideo meuVideo = new ProxyVideo(" hinonacional.mp4 ");

        meuVideo.play();
        System.out.println();

        meuVideo.play();
        System.out.println();

        
    }
}

