

public class Aluno {
    private String nome;
    private double p1;
    private double p2;
    private double media;

    
    
    public Aluno(String nome, double p1, double p2){
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void imprimeAluno(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Nota p1: "+ this.p1);
        System.out.println("Nota p2: "+ this.p2);
        this.media = (p1+2*p2)/3;
        System.out.printf("%s%.2f%n", "Media: ", this.media);
    }

}
