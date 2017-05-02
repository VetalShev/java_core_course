package ru.vetalshev.chapter4;

import ru.vetalshev.chapter4.computer.components.*;

import ru.vetalshev.chapter4.computer.repository.implementations.*;
import ru.vetalshev.chapter4.computer.services.ValidationService;
import ru.vetalshev.chapter4.computer.services.ValidationServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AssembleComputerApp {

    private static Scanner scan = new Scanner(System.in);

    Computer myPC = new Computer();

    private CdRomRepositoryImpl cdRomRepository = new CdRomRepositoryImpl();
    private HddRepositoryImpl hddRepository = new HddRepositoryImpl();
    private ProcessorRepositoryImpl processorRepository = new ProcessorRepositoryImpl();
    private RamRepositoryImpl ramRepository = new RamRepositoryImpl();

    // не отрабатывает конструктор класса приложения? т.к. экземпляр класса не создается. [RESOLVED]
    // Где проводить тогда инициализацию полей, в main?
    public AssembleComputerApp() {
    }

    public void init() {
        createCdRomList();
        createHddList();
        createProcessorList();
        createRamList();

        validateComponents(processorRepository.getProductList());
        validateComponents(cdRomRepository.getProductList());
        validateComponents(hddRepository.getProductList());
        validateComponents(ramRepository.getProductList());

        assemble();
    }

    private void assemble() {
        CdRom myCdRom = chooseComponent(cdRomRepository);
        Processor myProcessor = chooseComponent(processorRepository);
        Hdd myHdd = chooseComponent(hddRepository);
        Ram myRam = chooseComponent(ramRepository);

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

    private <T extends Product> void validateComponents(List<T> products) {
        ValidationService service = new ValidationServiceImpl();

        for (T product : products) {
            System.out.println("PRODUCT: " + product.getCode() + " IS " + (service.validate(product) ? "VALID" : "INVALID"));
        }

        System.out.println("===========================");
    }

    public static void main(String[] args) {
        AssembleComputerApp app = new AssembleComputerApp();
        app.init();
    }

    private void createCdRomList() {
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

    private void createHddList() {
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

    private void createProcessorList() {
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

    private void createRamList() {
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

    private static <T extends Product> T chooseComponent(ProductRepositoryImpl<T> repository) {
        System.out.println("Choose " + repository.getContentType() + " from:");
        List<T> products = repository.getProductList();

        System.out.println("=======================");
        for (T product : products) {
            System.out.println(product);
        }
        System.out.println("=======================");

        String productQuery = scan.nextLine();
        T myProduct = repository.findByCode(productQuery);

        System.out.println(myProduct);

        return myProduct;
    }

}
