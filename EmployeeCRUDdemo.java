import java.util.*;

class Employee{
    private int id;
	private String name;
	private String department;

    void createemployeeobj(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    int getid(){
        return this.id;
    }
    String getname(){
        return this.name;
    }
    String getdepartment(){
        return this.department;
    }
    void setid(int id){
        this.id=id;
    }
    void setname(String name){
        this.name=name;
    }
    void setdepartment(String department){
        this.department=department;
    }

}
class EmployeeCRUDdemo{
    ArrayList<Employee> emplist = new ArrayList<Employee>();
    
    void addemployee(Employee obj){
        emplist.add(obj);
    }
    void displayemployee(){
        for(Employee obj : emplist){
            System.out.println("id : "+obj.getid()+", name : "+obj.getname()+", department : "+obj.getdepartment());
        }
    }
    void updateemployee(int id){
        for(Employee obj : emplist){
            if(obj.getid()==id){
                Scanner s=new Scanner(System.in);
                System.out.println("Enter 1 to update name: \n Enter 2 to update Department: \n Enter 3 to update both:");
                int choice=s.nextInt();
                if(choice==1){
                    System.out.println("Enter new name: ");
                    String name=s.next();
                    obj.setname(name);
                }else if(choice==2)
                {
                    System.out.println("Enter new department: ");
                    String department=s.next();
                    obj.setdepartment(department);
                }
                else{
                    System.out.println("Enter new name: ");
                    String name=s.next();
                    System.out.println("Enter new department: ");
                    String department=s.next();
                    obj.setname(name);
                    obj.setdepartment(department);

                }

            }
        }
        System.out.println("Updated List:");
        displayemployee();

    }
    void deleteemployee(int id)
    {
        for(Employee obj : emplist){
            if(obj.getid()==id){
                emplist.remove(obj);
                System.out.println("Employee with id "+id+" is deleted ");
                break;

            }
        }
        displayemployee();
    }
    
    public static void main(String[] args) {

        EmployeeCRUDdemo obj = new EmployeeCRUDdemo();
        Scanner s =  new Scanner(System.in);
        System.out.println("Welcome to Employee Database!!!");
        int choice;
        do{
        System.out.println("Press 1 to Add Employee \n 2 to Update Employe\n 3 to Delete Employee\n 4 to Display Details\n 5 to exit");
        choice=s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter new ID");
                int id=s.nextInt();
                System.out.println("Enter new name: ");
                String name=s.next();
                System.out.println("Enter new department: ");
                String department=s.next();
                Employee emp = new Employee();
                emp.createemployeeobj(id,name,department);
                obj.addemployee(emp);
                break;
            case 2:
                System.out.println("Enter ID to update");
                int id1=s.nextInt();
                obj.updateemployee(id1);
                break;
            case 3:
                System.out.println("Enter ID to delete");
                int id2=s.nextInt();
                obj.deleteemployee(id2);
                break;
            case 4:
                obj.displayemployee();
                break;
            case 5:
                System.out.println("Thank you for using Employee Database!!!");
                break;

        }
        }
        while(choice!=5);
        
    }
}
