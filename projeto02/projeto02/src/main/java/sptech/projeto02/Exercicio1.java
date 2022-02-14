package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio1 {

    private Integer vit = 0;
    private Integer emp = 0;
    private Integer partidas = 0;

    @GetMapping("/vitoria")
    public String vitoria(){
        this.vit += 3;
        this.partidas += 1;
        return "Vitória registrada";
    }
    @GetMapping("/empate")
    public String empate(){
        this.emp += 1;
        this.partidas += 1;
        return "Empate registrada";
    }
    @GetMapping("/derrota")
    public String derrota(){
        this.partidas += 1;
        return "Derrota registrada";
    }
    @GetMapping("/pontuacao")
    public String pontuacao(){
        return String.format("Ola você tem %d pontos e %d partidas", (this.emp + this.vit), this.partidas);
    }

}
