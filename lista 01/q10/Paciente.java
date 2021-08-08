package q10;

public class Paciente {
	    String nome;
		String sexo;
		int peso;
		int idade;
		int altura;
		
		public void setNome(String nome){
			this.nome=nome;
		}
		public void setSexo(String sexo){
			this.sexo=sexo;
		}
		public void setPeso(int peso){
			this.peso=peso;
		}
		public void setIdade(int idade){
			this.idade=idade;
		}
		public void setAltura(int altura){
			this.altura = altura;
		}
		
		public String getNome(){
			return this.nome;
		}
		public String getSexo(){
			return this.sexo;
		}
		public int getPeso(){
			return this.peso;
		}
		public int getIdade(){
			return this.idade;
		}
		public int getAltura(){
			return this.altura;
		}
		
		public int valorConsulta(){
			return ((this.altura*this.peso)+ this.idade);
		}
		
		public Paciente(String nome, String sexo, int peso,
				            int idade, int altura){
			this.nome=nome;
			this.sexo=sexo;
			this.peso=peso;
			this.idade=idade;
			this.altura=altura;
	}
		
		public Paciente(){
			
		}


	
}

