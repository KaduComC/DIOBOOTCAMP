package dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso: Nome = " + getTitulo() 
            + ",\nDescricao = " + getDescricao() 
            + ",\nCarga Horaria = " + cargaHoraria + "]";
    }

    @Override
    public int calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
