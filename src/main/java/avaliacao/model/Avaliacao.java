package avaliacao.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Patrick-Ribeiro
 */
public class Avaliacao {

    private Date data;
    private Funcionario funcionario;
    private Avaliacao avaliacao;
    private String observacao;

    public Avaliacao() {
    }

    public Avaliacao(Date data, Funcionario funcionario, Avaliacao avaliacao) {
        this.data = data;
        this.funcionario = funcionario;
        this.avaliacao = avaliacao;
    }

    public Date getData() {
        return data;
    }

    public String getDataFormatada() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return simpleDateFormat.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
