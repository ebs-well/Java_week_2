public class main {
    public static void main (String[] args)
    {
        Brand erikBrand = Brand.MSI;
        System.out.println(erikBrand);
        CPU erikCPU = CPU.INTEL;
        System.out.println(erikCPU);
        System.out.println("");
        
        computer erikComputer = new computer();
        erikComputer.SetBrand(Brand.MSI);
        erikComputer.cpu = CPU.INTEL;
        erikComputer.driveType = DriveType.NVME;
        erikComputer.SetcpuGHZ(4.7);
        erikComputer.SetRAM(16);
        erikComputer.SetdriveSize(512);

        System.out.print("Erik's home computer is a " + erikComputer.getBrand()+ " desktop with a " + erikComputer.getcpuGHZ() + " GHz " + erikComputer.cpu + " CPU, " 
        + erikComputer.getRAM() + " GB of RAM and " + erikComputer.getdriveSize() + " GB " + erikComputer.driveType + ".");
    }
}
