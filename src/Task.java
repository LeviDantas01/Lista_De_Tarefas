import java.time.LocalDate;

public class Task {

    private int id;
    private String descricao;
    private LocalDate dataCriacao;
    private boolean status;

    public Task(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean concluirTarefa() {
        return this.status = true;
    }

    public void detalhes() {
        System.out.printf("id: %d, descrição: %s, data da criação: $s status %b ", this.id, this.descricao,
                this.dataCriacao, this.status);
    }

}
