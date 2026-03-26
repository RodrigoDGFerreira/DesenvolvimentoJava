public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataInicio;
    private String rg;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome !=null && nome.length()>=3) {
            this.nome = nome;
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(this.departamento !=this.departamento){
            this.departamento = departamento;
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>this.salario){
            this.salario = salario;
        }
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void demitir() {
        this.ativo = false;
    }
    public void contratar() {
        this.ativo = true;
    }

    public void bonificar(int hora){
        if(hora>0 && hora<=10){
            this.salario *= 0.2;
        } else if (hora>=11 && hora<=30) {
            this.salario *= 0.3;
        }else if (hora>=31) {
            this.salario *= 0.5;
        }

    }


}
