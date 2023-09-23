package DesignPattern.BuilderDP;

public class Student {

    private int age;
    private String fName;
    private String lName;
    private String gender;
    private double psp;
    private double weight;

    private Student(Builder builder) {
        this.age = builder.getAge();
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.weight = builder.getWeight();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String fName;
        private String lName;
        private String gender;
        private double psp;
        private double weight;

        public Student build(){
            return new Student(this);
        }

        //put some validation:
        private boolean ageValidate() {
            return this.age >= 18;
        }

        private boolean validateName() {
            return fName.length() + lName.length() > 5;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getfName() {
            return fName;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public double getWeight() {
            return weight;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }
    }

}
