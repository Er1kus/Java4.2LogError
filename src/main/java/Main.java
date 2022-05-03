public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long answer = service.calculate(amount, registered);
    long expected = 30;
    if (answer == expected)
      System.out.println( "Все верно");
  }
}

