package io.piratex.CadastroNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira mensagem da rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Todos os ninjas";
    }

    // Mostar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarNinjasPorId() {
        return "Ninja por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar ninja por id";
    }


    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorId() {
        return "Ninja deletado";
    }


}
