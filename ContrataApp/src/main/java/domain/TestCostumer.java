package domain;

public class TestCostumer {

    public static void main(String[] args) {

        Costumer costumer = new Costumer();
        UserType type = new UserType();

        costumer.userType = type;

        costumer.setEmail("pp@mail.com");
        System.out.println(costumer.getEmail());

        type.createUserType();
        costumer.createUser();
        costumer.createUser();
        costumer.listUser();



    }
}
