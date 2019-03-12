package Task6;

public abstract class CoctailMaker {
     public void mix(){
         liquid();
         mainIngridient();
         toping();
         System.out.println("Смешиваю " + liquid() + " c " + mainIngridient() + " и добавляю сверху " + toping());
     }
     public abstract String liquid();

     public abstract String mainIngridient();

     public abstract String toping();
}
