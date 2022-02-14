package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {
    Pais teste = new Pais();

//    List<Pais> listaPaises = List.of(
//            new Pais("Brasil", 2, 4, 6),
//            new Pais("Portugal", 4, 1, 2),
//            new Pais("China", 6, 7, 9)
//    );

    List<Pais> listaPaises = new ArrayList<>();

    @GetMapping("/listar")
    public List<Pais> getTodosPaises() {
        return listaPaises;
    }

    @GetMapping("/cadastrar/{nome}")
    public String cadastrarPais(@PathVariable String nome) {
        listaPaises.add(new Pais(nome, 0,0,0));
        return String.format("Pais %s cadastrado com sucesso", nome);
    }

    @GetMapping("/buscar/{id}")
    public Pais paisePorIndice(@PathVariable Integer id){
       return listaPaises.get(id);
    }
    
    @GetMapping
    public Pais getPais(){
        teste.setMedalhasBronze(2);
        teste.setMedalhasOuro(2);
        return teste;
    }

}
