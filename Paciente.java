public class Paciente {
    String nome, corDoCartao;
    int id;
    
    Paciente (String nome, String corDoCartao, int id) {
        this.nome = nome;
        this.corDoCartao = corDoCartao;
        this.id = id;
    }
    
    @Override // Reescrita de Métodos
    public String toString() {
        return "[Nome: "+nome+", Cartão: "+corDoCartao+", Id: "+id+"]";
    }
} 