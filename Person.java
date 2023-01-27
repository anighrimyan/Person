package Person;

public class Person {
    private static int m_person_id;
    private String m_first_name;
    private String m_last_name;
    private int m_age;
    public void set_first_name(String first_name) {
        m_first_name = first_name;
    }
    public String get_first_name() {
        return m_first_name;
    }
    public void set_last_name(String last_name) {
        m_last_name = last_name;
    }
    public String get_last_name() {
        return m_last_name;
    }
    public void set_age(int age) {
        if (age >= 18) {
            m_age = age;
        } else {
            System.out.println("The age can not be less then 18.");
        }
    }
    public int get_age() {
        return m_age;
    }
}
