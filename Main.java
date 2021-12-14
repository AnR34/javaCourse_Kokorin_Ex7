class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(1, "Pet", true);
        Cat cat = new Cat();
        Dog dog = new Dog();
        pet.voice();
        cat.voice();
        dog.voice();
        Pet petCat = new Cat();
        petCat.voice();
        Pet petDog = new Dog();
        petDog.voice();
    }
}
