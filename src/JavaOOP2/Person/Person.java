package JavaOOP2.Person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;


    public Person (String name,int age,String gender,String address,String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public Person (String name1,int age1,String gender1){
        name = name1;
        age = age1;
        gender = gender1;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }

    }

    //public static void main(String[] args) {
        //Person nhanluc = new Person();
    //}
    //=> KHÔNG THỂ KHỞI TẠO CHÍNH NÓ BÊN TRONG CHÍNH CLASS PERSON ĐƯỢC
    // vì như vậy sẽ tạo vòng lặp vô hạn (gọi constructor)















