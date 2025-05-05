//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Wil", "França", 21, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Vinícius", "Brasil", 23, 1.85f, 57.8f, 14, 2, 1);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[1]);
        UEC01.lutar();



    }
}