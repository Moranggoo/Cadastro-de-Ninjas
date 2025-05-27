package io.piratex.CadastroNinjas.Missoes;

import io.piratex.CadastroNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String rankMissao;

    //@OneToMany Uma missao pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;


}
