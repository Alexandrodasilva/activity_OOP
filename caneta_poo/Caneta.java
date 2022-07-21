public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    //protected int carga;
    private boolean tampada;

    public Caneta(String m, String c, float p){ //esse é o metodo construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta( float p){
        this.ponta = p;
    }
    
    public void status(){
       System.out.println("Modelo: "+this.modelo);
       System.out.println("cor: "+this.cor); 
       System.out.println("ponta: "+this.ponta);
       //System.out.println("carga: "+this.carga);
       System.out.println("está tampada? "+this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    /* 
    public void rabiscar(){
        if(this.tampada == true){
           System.out.println("ERRO! Não posso rabiscar"); 
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    protected void destampar(){
        this.tampada = false;
    }
    */
}
