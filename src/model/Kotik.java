package model;

public class Kotik {
    private static int catsCount = 0;

    public static int getCatsCount() {
        return catsCount;
    }

    private int satiety;
    private String meow;
    private int prettiness;
    private String name;
    private int weight;

    public Kotik() {
        catsCount++;
    }

    public Kotik(int prettiness, String name, int weight, String meow, int satiety) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
        catsCount++;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        satiety = 5;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public String getMeow() {
        return meow;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            boolean actionResult = true;
            int random = (int)Math.floor(Math.random()*5) + 1;
            switch (random) {
                case 1: actionResult = play(); break;
                case 2: actionResult = sleep(); break;
                case 3: actionResult = sing(); break;
                case 4: actionResult = walk(); break;
                case 5: actionResult = chaseMouse(); break;
                default: break;
            }
            if (!actionResult) {
                System.out.print("Ничего не делал. Хочу кушать! ");
                switch (random) {
                    case 1,2: eat(5); break;
                    case 3,4: eat(7, "рыбу"); break;
                    default: eat();
                }
            }
        }
    }

    private boolean play() {
        if (isHungry()) return false;
        System.out.println("Поиграл с игрушками");
        satiety -= 2;
        return true;
    }

    private boolean sleep() {
        if (isHungry()) return false;
        System.out.println("Поспал на подушке");
        satiety--;
        return true;
    }

    private boolean sing() {
        if (isHungry()) return false;
        System.out.println("Поорал серенады");
        satiety--;
        return true;
    }

    private boolean walk() {
        if (isHungry()) return false;
        System.out.println("Сходил погулять во двор");
        satiety -= 3;
        return true;
    }

    private boolean chaseMouse() {
        if (isHungry()) return false;
        System.out.println("Побегал за мышкой");
        satiety -= 2;
        return true;
    }

    private boolean isHungry() {
        return satiety <= 0;
    }

    private void eat(int foodValue) {
        satiety += foodValue;
        System.out.println("Немного перекусил");
    }

    private void eat(int foodValue, String food) {
        satiety += foodValue;
        System.out.println(" Поел " + food);
    }

    private void eat() {
        eat(6, "мясо");
    }
}
