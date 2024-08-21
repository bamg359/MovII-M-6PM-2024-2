package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class User implements UtilUser {


    Scanner sc = new Scanner(System.in);

    protected int idUser;
    protected String userName;
    private String lastName;
    protected String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    UserType userType;
    private String password;


    // Generar constructor

    public User(){


    }

    public User(int idUser, String userName, String lastName, String email, String phone, String address, String city, String state, String country, UserType userType, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.userType = userType;
        this.password = password;
    }

    // Getter and Setter

    public int getIdUser(){
        return this.idUser;
    }

    public void setIdUser(int idUser){
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //Metodos


    @Override
    public void createUser() {



        System.out.println("Ingrese el id del usuario");
        idUser = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese el nombre de usuario");
        userName = sc.nextLine();


        System.out.println("Ingrese el correo");
        email = sc.nextLine();


        System.out.println("TipoUsuario");
        userType.getTypeName();




    }

    @Override
    public void listUser() {



    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
