
    @Override
    public void voice() {
        System.out.println("Gaf");
    }

    public Dog(String game, String ownerName) {
        this.game = game;
        this.ownerName = ownerName;
    }

    public Dog(int numberOfTeeth, String game, String ownerName) {
        this.numberOfTeeth = numberOfTeeth;
        this.game = game;
        this.ownerName = ownerName;
    }

    protected int numberOfTeeth;

    public String game;

    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Dog() {
    }
