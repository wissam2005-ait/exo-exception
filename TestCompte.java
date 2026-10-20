public class TestCompte {
    public static void main(String[] args) {
        try {
            exo c1 = new exo("A123", 1000);
            exo c2 = new exo("B456", 200);

            c1.credit(200);
            System.out.println("Solde c1 après crédit : " + c1.getBalance());

            c1.debit(300);
            System.out.println("Solde c1 après débit : " + c1.getBalance());

            c1.transferTo(c2, 150);
            System.out.println("Solde c1 après virement : " + c1.getBalance());
            System.out.println("Solde c2 après réception : " + c2.getBalance());

            exo c3 = new exo("", 500);
        } catch (CompteException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            exo c4 = new exo("C789", 200);
            exo c5 = new exo("D012", 300);
            c4.transferTo(c5, 500);
        } catch (CompteException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            exo c6 = new exo("E345", 100);
            c6.credit(-50);
        } catch (CompteException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
