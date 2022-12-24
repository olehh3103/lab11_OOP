package task2;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;
    private static int counter = 1;

    public Client(String name, int age, Gender sex, String mail){
        id = counter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }
}
