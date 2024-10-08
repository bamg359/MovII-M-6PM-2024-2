package domain;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Costumer extends User {

    private String costumerType;

    public Costumer(){
        super();
    }

    public Costumer(int idUser, String userName, String lastName, String email, String phone, String address, String city, String state, String country, UserType userType, String password, String costumerType) {
        super(idUser, userName, lastName, email, phone, address, city, state, country, userType, password);
        this.costumerType = costumerType;
    }


    public String getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(String costumerType) {
        this.costumerType = costumerType;
    }

    //LinkedHashSet users = new LinkedHashSet<ArrayList<Object>>();

    List<List<Object>> users = new ArrayList<>();


    @Override
    public void createUser() {

        ArrayList<Object>  user = new ArrayList<Object>();
        super.createUser();
        System.out.println("Ingrese el tipo de costumer en el sistema");
        costumerType = sc.nextLine();


        user.add(idUser);
        user.add(userName);
        user.add(email);
        user.add(userType.getTypeName());
        user.add(costumerType);

        users.add(user);

    }

    @Override
    public void listUser() {
        super.listUser();

        for( Object user: users){
            System.out.println(user);
        }
    }

    @Override
    public void updateUser() {
        super.updateUser();
    }

    @Override
    public void deleteUser() {
        super.deleteUser();
    }
}
