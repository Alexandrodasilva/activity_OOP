public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    public Banco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("conta: "+this.getNumConta());
        System.out.println("tipo: "+this.getTipo());
        System.out.println("dono: "+this.getDono());
        System.out.println("saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    } 
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(Boolean st){
        this.status = st;
    }
    public void AbrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        //para colocar um if e else, é só digitar ifelse e enter
        if(t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    public void FecharConta(){
       if(this.getSaldo() > 0){
            System.out.println("conta não pode ser fechada porque ainda tem dinheiro");
       }else if(this.getSaldo() < 0){
            System.out.println("conta não pode ser fecheda pois tem débito");
       }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
       } 
    }
    public void Depositar(int v){
        if(this.getStatus()){
            //saldo = saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta "+this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    public void Sacar(int v){
        if(this.getStatus() ){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de"+this.getDono());
            }else{
                System.out.println("saldo insufiente para saque");
            }
        }else{
            System.out.println("Impossível Sacar");
        }
    }
    public void PagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }
}
