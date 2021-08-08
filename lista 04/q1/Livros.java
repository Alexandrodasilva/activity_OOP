package q1;

public class Livros {
	 String nome;
	 int exemplares;
	 int codigo;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setExemplares(int exemplares){
		this.exemplares = exemplares;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public  String getNome(){
		return this.nome;
	}
	public int getExemplares(){
		return this.exemplares;
	}
	public int getCodigo(){
		return this.codigo;
	}
	
	public Livros(String nome, int exemplares, int codigo){
		this.nome = nome; 
		this.exemplares = exemplares;
		this.codigo = codigo;
	}

}
