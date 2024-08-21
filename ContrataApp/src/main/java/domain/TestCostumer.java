package domain;

public class TestCostumer {

    public static void main(String[] args) {

        Costumer costumer = new Costumer();

        costumer.setEmail("pp@mail.com");
        System.out.println(costumer.getEmail());

        costumer.createUser();
        costumer.createUser();
        costumer.listUser();



    }
}
