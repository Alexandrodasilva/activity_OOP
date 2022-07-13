
public class Produtos {
	int condigo;
	private String nome;
	int estoque;
	int pre�o;
	
	
	public void setCodigo(){
		this.codigo = codigo;
	}
	public void setNome(){
		this.nome = nome;
	}
	public void setEstoque(){
		this.estoque = estoque;
	}
	public void setPre�o(){
		this.pre�o = pre�o;
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
	public int getPre�o(){
		return this.pre�o;
	}
	
	public Produtos( int codigo,String nome, int estoque, int pre�o){
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
		this.pre�o = pre�o;
	}
}