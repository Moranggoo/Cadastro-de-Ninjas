package io.piratex.CadastroNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/boasvindasmissoes")
    public String boasVindasMissoes() {
        return "Boas vindas, esse é a primeira rota de missoes";
    }
}
