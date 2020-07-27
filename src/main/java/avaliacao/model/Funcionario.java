package avaliacao.model;

import javafx.scene.image.Image;

/**
 *
 * @author usuario
 */
public class Funcionario {

    private String nome;
    private Image foto;

    public Funcionario() {
    }

    public Funcionario(String nome, Image foto) {
        this.nome = nome;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return nome;
    }

}
