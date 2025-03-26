package model;

public class Fio {                          // Aresta
    public Poste primeiro_vertice;
    public Poste segundo_vertice;
    public String aresta;
    public double comprimento_fio;

    public Fio(Poste A, Poste B, double comprimento) {
        this.primeiro_vertice = A;
        this.segundo_vertice = B;
        this.aresta = primeiro_vertice.vertice + segundo_vertice.vertice;
        this.comprimento_fio = comprimento;
        primeiro_vertice.adicionar_adj(segundo_vertice);
        segundo_vertice.adicionar_adj(primeiro_vertice);
    }

}