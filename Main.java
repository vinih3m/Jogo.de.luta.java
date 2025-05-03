//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Wil", "França", 21, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Vinícius", "Brasil", 23, 1.85f, 57.8f, 14, 2, 1);

        l[2] = new Lutador("Vitor", "Argentina", 25, 1.65f, 80.9f, 13, 2, 1);

        l[3] = new Lutador("Walter", "Holanda", 45, 1.68f, 81.6f, 12, 2, 1);

        l[4] = new Lutador("Thomas", "EUA", 18, 1.54f, 119.3f, 15, 2, 1);

        l[5] = new Lutador("Mateo", "Espanha", 22, 1.77f, 105.7f, 14, 0, 1);

        l[4/3].apresentar();

    }
}