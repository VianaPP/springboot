package aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
public class CidadesController {

    @GetMapping
    public String getCidades(){
        return "Lista de todas cidades do Brasil";
    }

    @GetMapping("{nome}")
    public String getCidadesPorNome(@PathVariable String nome){
        return "Retorna a cidade: " + nome;
    }

    @GetMapping("cadastrar")
    public String getCidadesCadastrar(@PathVariable String nome){
        return "Cadastro da cidade: " + nome;
    }

    @GetMapping("remover/{id}")
    public String getCidadesRemover(@PathVariable Integer id){
        return "Remover cidade: " + id;
    }



}
