public class Fila {
    No inicio;
    
    public boolean listaVazia(){ // Verificar se a Lista está vazia
        return inicio == null;
    }
    
    public void inserirPaciente(Paciente paciente) {
        if (paciente.corDoCartao.equals("Verde")){
            pacienteVerde(paciente);
        } else {
            pacienteAmarelo(paciente);
        }
    }
    
    public void pacienteVerde(Paciente paciente) { // Sempre vai adicionar o paciente no fim da fila
        No novoPaciente = new No(paciente);
        No auxiliar = inicio;
        
        if (vazia()){
            novoPaciente.proximo = inicio;
            inicio = novoPaciente;
        } else {
            while (auxiliar.proximo != null) {
                auxiliar = auxiliar.proximo;
            }
            auxiliar.proximo = novo;   
        }
    }
    
    public void pacienteAmarelo(Paciente paciente){
        if (vazia()){ // Se a fila estiver vazia, o Amarelo entra como sendo o primeiro
            pacienteVerde();
        } else {
            if (inicio.paciente.corDoCartao.equals("Amarelo")) { // Tem amarelo na Fila
                pacienteVerde();
            }
            
            else { // Tem Verde e Amarelo
                
            }
        }
    }
    
    public void imprimirDados() {
        if (!listaVazia()) {
            No auxiliar = inicio;
            while (auxiliar != null) {
                System.out.print(auxiliar);
                auxiliar = auxiliar.proximo;
            }
        } else {
            System.out.println("Fila Vazia");
        }
    }
}