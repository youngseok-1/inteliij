package test0913;

public class Dto {
    /* Application과 DTO로 나누고 setter와 getter로 나눈뒤
    printInformation을 통해 생성하시오.
    - id String
    - pw String
    - phone int
    - Address String
    - gender char

    아이디는 null 비밀번호는 null전화번호는 0 주소는 null 성별은  입니다.
    를 printInformation을 통해 호출한 뒤 5개의 필드를 한번에 변환시켜보자
     */

    private String id;
    private String pw;
    private String phone;
    private String address;
    private char gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Dto(String id, String pw, String phone, String address, char gender) {
        this.id = id;
        this.pw = pw;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public void printInformation() {
        System.out.println("아이디는 " + id + " 비밀번호는 " + pw + " 전화번호는 " + phone + " 주소는 " + address
        + " 성별은 " + gender + "입니다.");
    }
}
