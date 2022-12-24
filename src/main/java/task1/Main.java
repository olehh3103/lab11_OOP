package task1;

public class Main {
    public static void main(String[] args)  {
        User user = User.builder().name("Oleh").age(18).gender(Gender.MALE).occupation("student").occupation("sport").build();
        System.out.println(user);
    }
}
