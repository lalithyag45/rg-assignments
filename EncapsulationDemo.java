class StudentDetails{
    private String name="Default";
    private int id=0;
    StudentDetails(){
        this.name="Lalithya";
        this.id=1;
    }
    StudentDetails(String name, int id){
        this.name=name;
        this.id=id;
    }
    String getname(){
        return name;
    }

    int getid(){
        return id;
    }

    void displaydetails(String name, int id){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }

}

class EncapsulationDemo{
    public static void main(String[] args){
        StudentDetails obj1 = new StudentDetails();
        obj1.displaydetails(obj1.getname(), obj1.getid());

        StudentDetails obj2 = new StudentDetails("ravi",2);
        obj2.displaydetails(obj2.getname(), obj2.getid());
        

    }
}