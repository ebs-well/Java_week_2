enum Brand {HP, ACER, DELL, ASUS, APPLE, MSI}
enum CPU {AMD, INTEL}
enum DriveType {SSD, HHD, NVME}

public class computer {
    private Brand brand;
    public CPU cpu;
    public DriveType driveType;
    private double cpuGHZ;
    private double RAM;
    private double driveSize;

    //Accessor lists
    public Brand getBrand()
    {
        return brand;
    }

    public double getcpuGHZ()
    {
        return cpuGHZ;
    }

    public double getRAM()
    {
        return RAM;
    }

    public double getdriveSize()
    {
        return driveSize;
    }

    //mutator
    public void SetBrand(Brand newBrand)
    {
        brand = newBrand;
    }

    public void SetcpuGHZ(double newcpuGHZ)
    {
        cpuGHZ = newcpuGHZ;
    }

    public void SetRAM(double newRAM)
    {   
        RAM = newRAM;
    }

    public void SetdriveSize(double newdriveSize)
    {
        driveSize = newdriveSize;
    }
}
