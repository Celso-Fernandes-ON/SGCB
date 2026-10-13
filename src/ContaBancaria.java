public class ContaBancaria {
    private Long id;
    private String titular;
    private double saldo;
    private boolean ativa = false;

    public ContaBancaria(Long id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String depositar(double valor){
        if (!valorValido(valor) || !isAtiva()){
            return "erro na conta ou no valor";
        }
        return "ola";
    }
    public double sacar(double valor){
        double saldo = getSaldo();
        if (possuiSaldoSuficiente(saldo)){
            double sacado = saldo - valor;
            return sacado;

        }
        return "erro";
    }
    public String ativar(){
        setAtiva(true);
        return "Está ativada";
    }
    public String desativar(){
        setAtiva(true);
        return "Está desaativada";
    }
    private boolean valorValido(double valor){
        return valor > 0;
    }
    private boolean possuiSaldoSuficiente(double valor){
        return getSaldo() >= valor;
    }
}
