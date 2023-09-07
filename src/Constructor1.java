public class Constructor1 {
    int emp_id;

    String emp_name;
    int emp1;
    public Constructor1(String emp_name,int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        System.out.println("name of the employee: " + emp_name);
        System.out.println("id of the customer " + emp_id);
    }

    public Constructor1(String emp_name,int emp_id, int emp1){
        this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.emp1=emp1;
        //System.out.println("id " + emp1 );


    }
    public static void main(String[]args){
        Constructor1 t1 = new Constructor1("vaishnavi",89);
        Constructor1 t2 =new Constructor1("sana",102,89);

    }
 }
