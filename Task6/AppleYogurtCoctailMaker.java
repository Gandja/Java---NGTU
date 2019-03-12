package Task6;

public class  AppleYogurtCoctailMaker extends CoctailMaker {
    @Override
    public String liquid() {
        return "йогурт";
    }

    @Override
    public String mainIngridient() {
        return "яблоко";
    }

    @Override
    public String toping() {
        return "сливки";
    }
}
