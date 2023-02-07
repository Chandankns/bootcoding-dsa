package Practice;

    public class Person {
        private String name;
        private int age;
        private long phoneNo;

        public Person(String name, int age, long phoneNo) {
            this.name = name;
            this.age = age;
            this.phoneNo = phoneNo;
        }



        public String toString() {
            return "Person{" + "Name = " + name +" "+
                    "Age = " + age +" "+
                    "PhoneNo = " + phoneNo;
        };
    }
    class Demo1{
        public static void main(String[] args) {
            Person person =new Person("Chandan",22,9878654);
            System.out.println(person);
        }
    }


