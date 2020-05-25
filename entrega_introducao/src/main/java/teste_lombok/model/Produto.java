package teste_lombok.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Produto {

    String nome;
    double preco;
    double desconto;

    public String desconto() {
        double valor = this.preco * (1 - this.desconto / 100);
        return String.format("R$%.2f", valor);
    }

    
}