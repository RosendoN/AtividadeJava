//TesteClientes

public class TesteClientes {

    public static void main(String[] args) {

        PessoaFisica pessoa1 = new PessoaFisica(1, "Bruna", "999.888.777-00");
        PessoaFisica pessoa2 = new PessoaFisica(2, "Carla", "777.888.999-00");

        pessoa1.Visualizar();
        pessoa2.Visualizar();

        PessoaJuridica pj1 = new PessoaJuridica( 1, "McDonalds", "999.888.777/001-00");
        PessoaJuridica pj2 = new PessoaJuridica(2,"Bobs", "999.888.777/001-00");

        pj1.Visualizar();
        pj2.Visualizar();
    }
}

//Cliente
public class Cliente {

    public int id;

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void Visualizar() {
        System.out.println("ID do cliente: " + getId());
    }

}


//PessoaFisica

public class PessoaFisica  extends Cliente{

    public String nome;
    public String cpf;

    public PessoaFisica(int id, String nome, String cpf) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void Visualizar() {
        super.Visualizar();
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}


//PessoaJuridica

public class PessoaJuridica extends Cliente {

        public String razaoSocial;
        public String cnpj;

    public PessoaJuridica(int id, String razaoSocial, String cnpj) {
        super(id);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void Visualizar() {
        super.Visualizar();
        System.out.println("Razao social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
    }
}
