public class Candidatos{
    private String _nome, _numero;
    private int _votos;

    public Candidatos (String numero, String nome){
        this._nome = nome;
        this._numero = numero;
        this._votos = 0 ;
    }

    public String getNumero (){
        return this._numero;
    }

    public String getNome (){
        return this._nome;
    }
    
    public int getVotos (){
        return this._votos;
    }

    public void incrementarVotos(){
        this._votos += 1;
    }


}