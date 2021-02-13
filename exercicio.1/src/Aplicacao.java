public class Aplicacao {
    public static void main(String[] args) {
        Filme filme1= new Filme("Lagoa azul", "aventura,drama",
                120,"Michael");
        Filme filme2= new Filme("Dragon Ball", "desenho,animação",
                80,"xangi-li");
        filme1.reproduzir();
        filme2.reproduzir();
    }
}
