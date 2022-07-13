public class Pessoa{
  String nome;
  int data;

  public void setNome(){
    this.nome = nome;
  }
  public void setData(){
    this.data = data;
  }
  public String getNome(){
    return this.nome;
  }
  public int getData(){
    return this.data;
  }

  Pessoa(String nome , int data){
    this.nome = nome;
    this.data = data;
  }
  Pessoa(){

  }
}