package sptech.projeto02;

import com.sun.source.tree.ReturnTree;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class Pais {

    public Pais() {
    }

    public Pais(String nome, int medalhasOuro, int medalhasPrata, int medalhasBronze) {
        this.nome = nome;
        this.medalhasOuro = medalhasOuro;
        this.medalhasPrata = medalhasPrata;
        this.medalhasBronze = medalhasBronze;
    }
    private String nome;
    private int medalhasOuro;
    private int medalhasPrata;
    private int medalhasBronze;

    public String getNome() {
        return nome;
    }

    public int getMedalhasOuro() {
        return medalhasOuro;
    }

    public void setMedalhasOuro(int medalhasOuro) {
        this.medalhasOuro = medalhasOuro;
    }

    public int getMedalhasPrata() {
        return medalhasPrata;
    }

    public void setMedalhasPrata(int medalhasPrata) {
        this.medalhasPrata = medalhasPrata;
    }

    public int getMedalhasBronze() {
        return medalhasBronze;
    }

    public void setMedalhasBronze(int medalhasBronze) {
        this.medalhasBronze = medalhasBronze;
    }

    public int getTotalMedalhas() {
        return (this.medalhasBronze + this.medalhasOuro + this.medalhasPrata);
    }
}
