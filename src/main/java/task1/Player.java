package task1;

public class Player {
    private String name;
    private int age;
    protected String title = "Player: ";

    static {
        System.out.println("First player creating...");
    }

    {
        System.out.print(title);
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void say() {
        say("Hello! It's " + name + ". I am " + title + ". Glad to see you!");
    }
    public void say(String phrase) {
        System.out.println(name + " says: " + phrase);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
