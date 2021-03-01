import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik basilio = new Kotik(146, "Базилио", 6, "Мур-Мяу", 5);
        Kotik vaska = new Kotik();
        vaska.setKotik(100, "Васька", 5, "Мяу");

        System.out.println("Обычный день котика " + basilio.getName() + ", который весит " + basilio.getWeight() + " кг.");
        basilio.liveAnotherDay();

        String equalMeow = basilio.getMeow().equals(vaska.getMeow()) ? "Котики мяукают одинаково" : "Котики мяукают по-разному";
        System.out.println(equalMeow);
        System.out.println("Всего создано котиков - " + Kotik.getCatsCount());
    }
}
