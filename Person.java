class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
