class Pet {

    protected void voice() {
    }

    public Pet(int age, String name, boolean haveTale) {
        this.age = age;
        this.name = name;
        this.haveTale = haveTale;
    }

    private int age;

    public String name;

    protected boolean haveTale;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet() {
    }
}
