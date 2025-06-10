package io.piratex.CadastroNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/boasvindasmissoes")
    public String boasVindasMissoes() {
        return "Boas vindas, esse é a primeira rota de missoes";
    }

    // POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    // GET -- Mandar uma requisicao para listar as missoes
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Todas as missoes";
    }

    // PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/alterarID")
    public String alterarMissaoPorId() {
        return "Missao id atulizada";
    }

    // DELETE -- Mandar uma requisicao para deletar uma missao
    @DeleteMapping("/deletarID")
    public String deletarPorId() {
        return "Ninja deletado";
    }
}
