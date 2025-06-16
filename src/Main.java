public class Main{
    public static void main(String[]args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", 22, "M");
        p[1] = new Pessoa("Amanda", 23, "F");

        l[0] = new Livro("Harry Potter", "J.K Rolling", 500, p[0]);
        l[1] = new Livro("Sei lá", "Sei lá", 100, p[1]);

        l[0].folhear(100);
        l[0].avancarPagina();

        System.out.println(l[0].detalhes());
    }
}