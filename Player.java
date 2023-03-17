package src;

public class Player{
    private String id; /*precisa de id para buscar o resultado do jogo (task3) */
    private String nome;
    private Integer kills;
    


    public Player(String id, String nome, Integer kills){
        this.nome = nome;
        this.kills = kills;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "nome: " + this.nome + ", kiils: " + this.kills;
    }
}