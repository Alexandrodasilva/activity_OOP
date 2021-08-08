package q19;

public class Data {
       int  hora;
	   int minuto;
	   int segundo;
	    
	    
	    public void setHora(int hora){
	        this.hora = hora;
	    }
	    public void setMinuto(int minuto){
	        this.minuto = minuto;
	    }
	    public void setsegundo(int segundo){
	        this.segundo = segundo;
	    }
	   
	    public int getHora(){
	        return this.hora;
	    }
	    public int getMinuto(){
	        return this.minuto;
	    }
	    public int getSegundo(){
	        return this.segundo;
	    }
	    
	    public Data(int Hora, int Minuto){
	        this.hora= hora;
	        this.minuto = minuto;
	        
	    }

}
