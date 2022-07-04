package m8t5;

public class Teacher extends People {
    private String subject;


    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    
    public String giveAlesson() {
        return "The lesson was ended";
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getProfession() {
        return profession;
    }
}
