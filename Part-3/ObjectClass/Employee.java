class Employee {
    String ename;
    int eid;

    Employee(String ename, int eid) {
        this.ename = ename;
        this.eid = eid;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return (this.ename.equals(e.ename) && this.eid == e.eid);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Miller", 101);
        Employee e2 = new Employee("Scott", 102);
        Employee e3 = new Employee("Miller", 101);
        Employee e4 = new Employee("Miller", 102); // Checking with == operator
        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        // Checking with equals
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
    }
}