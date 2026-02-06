package main.com.dependencia;

class App {
    public void escrever(String texto){
        SaidaDeDados saida = new SaidaDeDados();
        saida.escrever(texto);
    }
}

class SaidaDeDados {
    public void escrever(String dado){
        System.out.println(dado);
    }
}