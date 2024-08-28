package domain;

import java.util.Scanner;

public class UserType {

    Scanner sc = new Scanner(System.in);

    private int idType;
    private String typeName;

    // Constructor

    public UserType(){

    }

    public UserType(int idType, String typeName) {
        this.idType = idType;
        this.typeName = typeName;
    }

    // Getter and Setter

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    // Metodos

    public void createUserType(){

        System.out.println("INgrese el id");
        idType = sc.nextInt();

        sc.nextLine();

        System.out.println("INgrese el nombre del tipo de cliente");
        typeName = sc.nextLine();

    }

    public void listUserType(){

    }



}
