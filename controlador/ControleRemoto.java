public class ControleRemoto implements Controlador {
    private int volume;
    private Boolean ligado;
    private boolean tocando;
    //construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    //metodos getters e setters 
    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public int getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
    //metodos abstratos
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public  void desligar(){
        this.setLigado(false);
    }

    @Override
    public  void abrirMenu(){
        System.out.println("esta ligado? "+this.getLigado());
        System.out.println("esta tocando? "+this.getTocando());
        System.out.println("volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("|");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo(){
        if(this.getLigado() > 0 && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo(){
        if(this.getLigado() == 0 && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play(){
        if(!(this.getLigado()) && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
