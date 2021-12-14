class Cat extends Pet {

    public Cat() {
    }

    public Cat(int age, String name, boolean haveTale) {
        super(age, name, haveTale);
    }

    @Override
    public void voice() {
        System.out.println("May");
    }

    public String friend;

    protected int number;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
