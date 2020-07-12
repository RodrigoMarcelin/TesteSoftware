package App;

public class Rent {
    private Double valor_nominal;
    private Integer dia;

    public Rent () {

    }
    public Rent(double valor_nominal, Integer dia) {
        this.valor_nominal = valor_nominal;
        this.dia = dia;
    }

    public Double getValor_nominal() {
        return valor_nominal;
    }

    public void setValor_nominal(Double valor_nominal) {
        this.valor_nominal = valor_nominal;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
}