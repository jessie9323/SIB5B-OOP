// Employee.java

public class Employee {
    // Attributes
    protected String nik;
    protected String name;
    protected String positionName;
    protected double basicSalary;
    protected double transportAllowance;
    protected double positionAllowance;
    protected double takeHomePay;

    // Constructor
    public Employee(String nik, String name, String positionName, double basicSalary, double transportAllowance, double positionAllowance) {
        this.nik = nik;
        this.name = name;
        this.positionName = positionName;
        this.basicSalary = basicSalary;
        this.transportAllowance = transportAllowance;
        this.positionAllowance = positionAllowance;
        this.takeHomePay = basicSalary + transportAllowance + positionAllowance;
    }

    // Method setEmployee
    public void setEmployee(String nik, String name, double basicSalary, double transportAllowance, double positionAllowance) {
        this.nik = nik;
        this.name = name;
        this.basicSalary = basicSalary;
        this.transportAllowance = transportAllowance;
        this.positionAllowance = positionAllowance;
        System.out.println("Berhasil Menambahkan Karyawan Baru, " + this.name);
    }

    // Method getEmployee
    public void getEmployee() {
        System.out.println(this.name + " - " + this.nik + " menduduki posisi " + this.positionName);
    }

    // Method getSalary
    public void getSalary() {
        System.out.println(this.name + " | " + this.positionName + " mendapatkan total gaji " + this.takeHomePay);
    }
}

// Contract.java

public class Contract extends Employee {
    // Attribute
    private int contractDuration;

    // Constructor
    public Contract(String nik, String name, String positionName, double basicSalary, double transportAllowance, double positionAllowance, int contractDuration) {
        super(nik, name, positionName, basicSalary, transportAllowance, positionAllowance);
        this.contractDuration = contractDuration;
    }

    // Method getContractDuration
    public void getContractDuration() {
        System.out.println("Dikontrak selama " + this.contractDuration + " bulan");
    }
}

// Permanent.java

public class Permanent extends Employee {
    // Attributes
    private String transportation;
    private int takeDayOff;

    // Constructor
    public Permanent(String nik, String name, String positionName, double basicSalary, double transportAllowance, double positionAllowance) {
        super(nik, name, positionName, basicSalary, transportAllowance, positionAllowance);
        this.transportation = "mobil"; // Default transportation
        this.takeDayOff = 12;          // Default take day off
    }

    // Method getBenefit
    public void getBenefit() {
        System.out.println("Benefit : mobil dan cuti");
    }

    // Method setTakeDayOff
    public void setTakeDayOff(int takeDayOff) {
        this.takeDayOff = takeDayOff;
        System.out.println(this.name + " mendapatkan " + takeDayOff + " hari cuti");
    }

    // Method setTransportation
    public void setTransportation(String transportation) {
        this.transportation = transportation;
        System.out.println(this.name + " mendapatkan " + transportation);
    }
}