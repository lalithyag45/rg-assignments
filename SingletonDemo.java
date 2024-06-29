class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
    void printmessage(){
        System.out.println("Hurrayy Iam visible!!!");
    }
}

class SingletonDemo{
    public static void main(String[] args) {
        // Singleton s1 = new Singleton();
        Singleton s1 = Singleton.getInstance();
        s1.printmessage();

    }
}