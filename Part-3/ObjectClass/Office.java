class Emp {
    String ename;
    int eid;
    double sal;
    String loc;

    Emp(String ename, int eid, double sal, String loc) {
        this.ename = ename;
        this.eid = eid;
        this.sal = sal;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Ename : " + ename + "\nEid : " + eid + "\nSal : " + sal + "\nLoc : " + loc;
    }
}

class Office {
    public static void main(String[] args) {
        Emp e1 = new Emp("Smith", 101, 90000, "Chennai");
        System.out.println(e1.toString());
    }
}