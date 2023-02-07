package Practice;

public class Person1 {
    private String name;
    private int age;
    private long phoneNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public String toString() {
        return "Person{" + "Name = " + name +" "+
                "Age = " + age +" "+
                "PhoneNo = " + phoneNo;
    };
}

    class Demo2 {
        public static void main(String[] args) {
            Person person = new Person("Chandan", 23, 97756543);
            System.out.println(person);
        }
    }




