package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria: Titulo = " + getTitulo() 
            + ",\nDescricao = " + getDescricao() 
            + ",\nData = " + data + "]";
    }

    @Override
    public int calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20;
    }

}
