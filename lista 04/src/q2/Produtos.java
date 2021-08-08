package q2;

public class Produtos {
	int condigo;
	private String nome;
	int estoque;
	int preço;
	
	
	public void setCodigo(){
		this.codigo = codigo;
	}
	public void setNome(){
		this.nome = nome;
	}
	public void setEstoque(){
		this.estoque = estoque;
	}
	public void setPreço(){
		this.preço = preço;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	public String getNome(){
		return this.nome;
	}
	public int getEstoque(){
		return this.estoque;
	}
	public int getPreço(){
		return this.preço;
	}
	
	public Produtos( int codigo,String nome, int estoque, int preço){
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
		this.preço = preço;
	}
}