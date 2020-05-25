package teste_lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import teste_lombok.model.Produto;

public class ProdutoTeste {
    Produto prod = new Produto();
    
    @Test
    public void atribuiNomeProduto() {
        prod.setNome("notebook");
        assertEquals("notebook", prod.getNome());
    }

    @Test
    public void testDesconto() {
        prod.setPreco(3750);
        prod.setDesconto(5);
        assertEquals("R$3562,50", prod.desconto());
    }
    
}