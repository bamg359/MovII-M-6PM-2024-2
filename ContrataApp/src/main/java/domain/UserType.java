package domain;

public class UserType {

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

    }

    public void listUserType(){

    }



}
