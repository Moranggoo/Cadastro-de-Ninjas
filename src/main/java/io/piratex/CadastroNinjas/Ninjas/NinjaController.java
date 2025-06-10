package io.piratex.CadastroNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
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
    @GetMapping("/listar")
    public String listarTodosOsNinjas() {
        return "Todos os ninjas";
    }

    // Mostar ninja por ID (READ)
    @GetMapping("/listarID")
    public String listarNinjasPorId() {
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
