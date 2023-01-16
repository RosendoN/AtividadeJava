//Teste

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Paulo", "Silva", 50, "Advogado", 980999);
        Cliente cliente2 = new Cliente("Paula", "Silvana", 30, "Advogada", 980888);

        cliente1.Visualizar();
        cliente2.Visualizar();
        System.out.println("\n");

        Funcionario funcionario1 = new Funcionario("João", "Batista", 25, "Atendente", 983659);
        Funcionario funcionario2 = new Funcionario("Maria", "Joaquina", 20, "Caixa", 956749);

        funcionario1.Visualizar();
        funcionario2.Visualizar();
        System.out.println("\n");

        Produto produto1 = new Produto("Apple", "iPhone", "Celular", 16.0, "Preto");
        Produto produto2 = new Produto("Apple", "MacBook", "NoteBook", 16.0, "Cinza");

        produto1.Visualizar();
        produto2.Visualizar();

    }
}


//Exercicio1

public class Cliente {

    public String nome;
    public String sobrenome;
    public int idade;
    public String profissao;
    public int cpf;

    public Cliente(String nome, String sobrenome, int idade, String profissao, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.profissao = profissao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void nome(String nome) {
        System.out.println(nome);
    }
    public void sobrenome(String sobrenomenome) {
        System.out.println(sobrenomenome);
    }
    public void idade(int idade) {
        System.out.println(idade);
    }
    public void profissao(String profissao) {
        System.out.println(profissao);
    }
    public void cpf(int cpf) {
        System.out.println(cpf);
    }

    public void Visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("CPF: " + getCpf());
    }
}


//Exercicio2

public class Funcionario {

    public String nome;
    public String sobrenome;
    public int idade;
    public String cargo;
    public int cpf;

    public Funcionario(String nome, String sobrenome, int idade, String cargo, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cargo = cargo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void Visualizar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cargo: " + getCargo());
        System.out.println("CPF: " + getCpf());
    }
}

//Exercicio3

public class Produto {

    private String marca;
    private String nome;
    private String categoria;
    private double versao;
    private String cor;

    public Produto(String marca, String nome, String categoria, double versao, String cor) {
        this.marca = marca;
        this.nome = nome;
        this.categoria = categoria;
        this.versao = versao;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getVersao() {
        return versao;
    }

    public void setVersao(double versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void Visualizar(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Versão: " + getVersao());
        System.out.println("Cor: " + getCor());
    }
}

