

public class Aluno {
    private String nome;
    private double p1;
    private double p2;
    private double media;

    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setP1(double p1){
        this.p1 = p1;
    }
    public double getP1(){
        return p1;
    }
    
    public void setP2(double p2){
        this.p2 = p2;
    }
    public double getP2(){
        return p2;
    }

    public void imprimeAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota P1: " + this.p1);
        System.out.println("Nota P2: " + this.p2);
        System.out.printf("%s%.2f%n---------------%n", "Media: ", calculoMedia());
    }
    public double calculoMedia(){
        return this.media = (p1 + 2 * p2) / 3;
    }

}
