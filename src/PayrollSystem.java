public class PayrollSystem {

    public static void main(String[] args) {
        HourlyEmployee he =
                new HourlyEmployee("toto", "1234", 20, 8);

        try {
            HourlyEmployee he2 =
                    new HourlyEmployee("toto", "1234", -1, 8);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}