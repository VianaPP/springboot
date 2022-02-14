package sptech.projeto02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio2 {

    private Integer vit = 0;
    private Integer emp = 0;
    private Integer partidas = 0;
//    private Double total = this.total / (this.emp + this.vit) * 3.0;;

    @GetMapping("/vitoriaa")
    public String vitoria() {
        this.vit += 3;
        this.partidas += 1;
        return "Vitória registrada";
    }

    @GetMapping("/empatee")
    public String empate() {
        this.emp += 1;
        this.partidas += 1;
        return "Empate registrada";
    }

    @GetMapping("/derrotaa")
    public String derrota() {
        this.partidas += 1;
        return "Derrota registrada";
    }

    @GetMapping("/pont")
    public String pontuacao() {
        return String.format("Ola você tem %d pontos e %d partidas - Aproveitamento: %.2f",
                this.partidas);
    }

}
