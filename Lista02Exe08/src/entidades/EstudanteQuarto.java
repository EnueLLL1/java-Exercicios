package entidades;

public class EstudanteQuarto {

    // Atributos
    private String nome;
    private String email;
    private int numero;
    
    // Construtor
    public EstudanteQuarto(String nome, String email, int numero) {
        this.email = email;
        this.nome = nome;
        this.numero = numero;
    }
    // Metodos
    public int getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String pQuarto() {
        return numero + ": " + nome + ", " + email;
    }
}
