import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canal){
        canais.add(canal);
    }

    public void processar(Video video){
        Mensagem msg = new Mensagem(video.getArquivo()+" - "+video.getFormatoVideo(), TipoMensagem.LOG);
        for(CanalNotificacao c:canais){
            c.notificar(msg);
        }
    }
}
