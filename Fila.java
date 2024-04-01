public class Fila {
    No inicio;
    
    // Verificar se a Lista está vazia
    public boolean listaVazia() {
        return inicio == null;
    }
    
    public void inserirPaciente(Paciente paciente) {
        if (paciente.corDoCartao.equals("Verde")){
            pacienteVerde(paciente);
        } else {
          pacienteAmarelo(paciente);
        }
    }
 
//---------------------------------------------------------------------------------------------------//  
    
    // Sempre vai adicionar o paciente no fim da fila
    public void pacienteVerde(Paciente paciente) { 
        No novoPaciente = new No(paciente);
        No auxiliar = inicio;
        
        if (listaVazia()){ 
            novoPaciente.proximo = inicio;
            inicio = novoPaciente;
        } else {
            while (auxiliar.proximo != null) {
                auxiliar = auxiliar.proximo;
            }
            auxiliar.proximo = novoPaciente;   
        }
    }
  
  //---------------------------------------------------------------------------------------------------//  
    
    public void pacienteAmarelo(Paciente paciente){
        No novoPaciente = new No(paciente);
        No auxiliar = inicio;
     
        // Se a fila estiver vazia, o Amarelo entra como sendo o primeiro
        if (listaVazia()) { 
            novoPaciente.proximo = inicio;
            inicio = novoPaciente;
        } 
        
        // Se a fila NÃO estiver vazia haverá o seguintes cenários
        else {  
            
            // Não existem Amarelos na Fila, então devo procurar o primeiro Verde
            if (inicio.paciente.corDoCartao.equals("Verde")) {
                novoPaciente.proximo = inicio;
                inicio = novoPaciente;
                while (auxiliar.proximo != null) {
                    auxiliar = auxiliar.proximo;
                } novoPaciente = inicio;
            }
            
            // Já existe (pelo menos) um Amarelo na Fila, devo procurar o último Amarelo
            else {
                // Se tem um amarelo, então "inicio = amarelo // auxiliar = inicio"
                // Logo devemos procurar o último amarelo
                while(auxiliar.proximo != null && auxiliar.proximo.paciente.corDoCartao.equals("Amarelo")){
                    auxiliar = auxiliar.proximo;
                } 
                novoPaciente.proximo = auxiliar.proximo;
                auxiliar.proximo = novoPaciente;
            }
        }
    }

    public No retirarPaciente () {
        No aux = inicio;
        if (listaVazia()) {
            System.out.println("Fila vazia!");
        } else {
            inicio = inicio.proximo;
        }
        return aux;
    }

  //---------------------------------------------------------------------------------------------------//  
    
    public void imprimirDados() {
        if (!listaVazia()) {
            No auxiliar = inicio;
            while (auxiliar != null) {
                System.out.print(auxiliar.paciente);
                auxiliar = auxiliar.proximo;
                System.out.println(" ");
            }
        } else {
            System.out.println("Fila Vazia");
        }
    }
}
