import org.junit.Test;

public class IngressoTest {
    @Test 
    public void calcularPrecoComAdicionais {
        MeiaEntrada ingresso = new MeiaEntrada("Ratatouille", null);
        
        double valor = ingresso.valorIngresso();
    }
}
