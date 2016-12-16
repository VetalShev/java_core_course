package ru.vetalshev.chapter4;

import ru.vetalshev.chapter4.computer.components.*;

import ru.vetalshev.chapter4.computer.repository.implementations.*;
import ru.vetalshev.chapter4.computer.repository.interfaces.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class AssembleComputerApp {

    private static Scanner scan = new Scanner(System.in);

    // не отрабатывает конструктор класса приложения? т.к. экземпляр класса не создается.
    // Где проводить тогда инициализацию полей, в main?
    public AssembleComputerApp() {
        scan = new Scanner(System.in);
    }

    public static void main(String[] args) {

        CdRomRepositoryImpl cdRomRepository = new CdRomRepositoryImpl();
        HddRepositoryImpl hddRepository = new HddRepositoryImpl();
        ProcessorRepositoryImpl processorRepository = new ProcessorRepositoryImpl();
        RamRepositoryImpl ramRepository = new RamRepositoryImpl();

        createCdRomList(cdRomRepository);
        createHddList(hddRepository);
        createProcessorList(processorRepository);
        createRamList(ramRepository);

        Computer myPC = new Computer();

//        CdRom myCdRom = (CdRom) chooseComponent(cdRomRepository);
//        Processor myProcessor = (Processor) chooseComponent(processorRepository);
//        Hdd myHdd = (Hdd) chooseComponent(hddRepository);
//        Ram myRam = (Ram) chooseComponent(ramRepository);

        System.out.println("Choose CD-rom from:");
        List<CdRom> cdRoms = cdRomRepository.getProductList();

        System.out.println("=======================");
        for (Product cdRom : cdRoms) {
            System.out.println(cdRom);
        }
        System.out.println("=======================");

        String cdRomQuery = scan.nextLine();
        CdRom myCdRom = cdRomRepository.findByCode(cdRomQuery);


        System.out.println("Choose Processor from:");
        List<Processor> processors = processorRepository.getProductList();

        System.out.println("=======================");
        for (Product processor : processors) {
            System.out.println(processor);
        }
        System.out.println("=======================");

        String processorQuery = scan.nextLine();
        Processor myProcessor = processorRepository.findByCode(processorQuery);


        System.out.println("Choose Hdd from:");
        List<Hdd> hdds = hddRepository.getProductList();

        System.out.println("=======================");
        for (Product hdd : hdds) {
            System.out.println(hdd);
        }
        System.out.println("=======================");

        String hddQuery = scan.nextLine();
        Hdd myHdd = hddRepository.findByCode(hddQuery);


        System.out.println("Choose Ram from:");
        List<Ram> rams = ramRepository.getProductList();

        System.out.println("=======================");
        for (Product ram : rams) {
            System.out.println(ram);
        }
        System.out.println("=======================");

        String ramQuery = scan.nextLine();
        Ram myRam = ramRepository.findByCode(ramQuery);


        myPC.addCdRom(myCdRom);
        myPC.addProcessor(myProcessor);
        myPC.addHdd(myHdd);
        myPC.addRam(myRam);


        System.out.println("My PC is:\n" + myPC);
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("Total computer price:" + myPC.getTotalPrice());
        System.out.println("=======================");
        System.out.println("=======================");

    }

    private static void createCdRomList(CdRomRepositoryImpl cdRomRepository) {
        CdRom cdRom1 = new CdRom();
        cdRom1.setCode("SAMSUNG DVD-RW white SE6536548 BlueRay DoubleLayer");
        cdRom1.setPrice(155);
        cdRom1.setManufacturer("Samsung");
        cdRom1.setType("DVD-RW");
        cdRomRepository.addItem(cdRom1);

        CdRom cdRom2 = new CdRom();
        cdRom2.setCode("Acer CD-RW white ME11111111");
        cdRom2.setPrice(45);
        cdRom2.setManufacturer("Acer");
        cdRom2.setType("CD-RW");
        cdRomRepository.addItem(cdRom2);

        CdRom cdRom3 = new CdRom();
        cdRom3.setCode("Asus DVD-R black SDK283511 DoubleLayer");
        cdRom3.setPrice(65);
        cdRom3.setManufacturer("Asus");
        cdRom3.setType("DVD-R");
        cdRomRepository.addItem(cdRom3);
    }

    private static void createHddList(HddRepositoryImpl hddRepository) {
        Hdd hdd1 = new Hdd();
        hdd1.setCode("Hitachi 500GB SATA 7200rpm 2.5\"");
        hdd1.setManufacturer("Hitachi");
        hdd1.setPrice(130);
        hdd1.setVolume(500);
        hdd1.setFormFactor("2.5\"");
        hddRepository.addItem(hdd1);

        Hdd hdd2 = new Hdd();
        hdd2.setCode("Seagate Baracuda 500GB SATA 7200rpm 2.5\"");
        hdd2.setManufacturer("Seagate");
        hdd2.setPrice(170);
        hdd2.setVolume(500);
        hdd2.setFormFactor("2.5\"");
        hddRepository.addItem(hdd2);

        Hdd hdd3 = new Hdd();
        hdd3.setCode("SAMSUNG 500GB SATA 7200rpm 3.5\"");
        hdd3.setManufacturer("SAMSUNG");
        hdd3.setPrice(115);
        hdd3.setVolume(500);
        hdd3.setFormFactor("3.5\"");
        hddRepository.addItem(hdd3);

        Hdd hdd4 = new Hdd();
        hdd4.setCode("SAMSUNG 1000Gb SATA II 7200rpm 1.8");
        hdd4.setManufacturer("SAMSUNG");
        hdd4.setPrice(360);
        hdd4.setVolume(1024);
        hdd4.setFormFactor("1.8\"");
        hddRepository.addItem(hdd4);

        Hdd hdd5 = new Hdd();
        hdd5.setCode("Seagate Baracuda 2048GB SATA 7200rpm 2.5\"");
        hdd5.setManufacturer("Seagate");
        hdd5.setPrice(240);
        hdd5.setVolume(1024);
        hdd5.setFormFactor("2.5\"");
        hddRepository.addItem(hdd5);
    }

    private static void createProcessorList(ProcessorRepositoryImpl processorRepository) {
        Processor processor1 = new Processor();
        processor1.setCode("intel i7 6700k 4.0GHz 8cores 8Mb cache L3");
        processor1.setManufacturer("intel");
        processor1.setPrice(1170);
        processor1.setCoresNumber(8);
        processor1.setCache("8Mb");
        processorRepository.addItem(processor1);

        Processor processor2 = new Processor();
        processor2.setCode("intel i7 4790k 4.4GHz 8cores 6Mb cache L3");
        processor2.setManufacturer("intel");
        processor2.setPrice(920);
        processor2.setCoresNumber(8);
        processor2.setCache("8Mb");
        processorRepository.addItem(processor2);

        Processor processor3 = new Processor();
        processor3.setCode("AMD fx 8350 3.9GHz 8cores 12Mb cache L3");
        processor3.setManufacturer("AMD");
        processor3.setPrice(880);
        processor3.setCoresNumber(8);
        processor3.setCache("12Mb");
        processorRepository.addItem(processor3);

        Processor processor4 = new Processor();
        processor4.setCode("intel i5 6600k 3.9GHz 6cores 8Mb cache L3");
        processor4.setManufacturer("intel");
        processor4.setPrice(690);
        processor4.setCoresNumber(6);
        processor4.setCache("8Mb");
        processorRepository.addItem(processor4);

        Processor processor5 = new Processor();
        processor5.setCode("intel i5 4690k 3.5GHz 4cores 6Mb cache L3");
        processor5.setManufacturer("intel");
        processor5.setPrice(460);
        processor5.setCoresNumber(4);
        processor5.setCache("6Mb");
        processorRepository.addItem(processor5);
    }

    private static void createRamList(RamRepositoryImpl ramRepository) {
        Ram ram1 = new Ram();
        ram1.setCode("Hitachi DDR3L 8192Mb SO-DIMM 1.5V");
        ram1.setManufacturer("Hitachi");
        ram1.setPrice(135);
        ramRepository.addItem(ram1);

        Ram ram2 = new Ram();
        ram2.setCode("Hitachi DDR3L 8192Mb SO-DIMM 1.5V");
        ram2.setManufacturer("Samsung");
        ram2.setPrice(95);
        ramRepository.addItem(ram2);

        Ram ram3 = new Ram();
        ram3.setCode("Hitachi DDR4L 8192Mb SO-DIMM 1.5V");
        ram3.setManufacturer("Hynix");
        ram3.setPrice(180);
        ramRepository.addItem(ram3);
    }

    private static Product chooseComponent(ProductRepositoryImpl<Product> repository) {

        System.out.println("Choose Ram from:");
        List<Product> products = repository.getProductList();

        System.out.println("=======================");
        for (Product ram : products) {
            System.out.println(ram);
        }
        System.out.println("=======================");

        String productQuery = scan.nextLine();
        Product myProduct = repository.findByCode(productQuery);

        return myProduct;
    }

}
