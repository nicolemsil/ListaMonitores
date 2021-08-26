package br.unicamp.listamonitores;

public class Monitor {
    private String nome, horario;
    private int imagem;

    //construtor
    public Monitor (String nome, String horario, int imagem)
    {
        this.nome = nome;
        this.horario = horario;
        this.imagem = imagem;
    }

    //getter e setter
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //horario
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    //imagem
    public int getImagem() {
        return imagem;
    }
    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "nome='" + nome + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}

