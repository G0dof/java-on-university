public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    Funcionario() {
        cargo = "Assistente";
    }

    Funcionario(int c, float s, String car) {
        cracha = c;
        salario = s;
        cargo = car;
    }

    public float calculaAumento(float porcentagem) {
        return salario + (salario * (porcentagem / 100));
    }

    public float calculaAumento(int tempo) {
        return salario + (tempo * 150f);
    }

    // Getters e setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
}
