package ru.vetalshev.chapter4;

import ru.vetalshev.chapter4.computer.Computer;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.components.Ram;

import ru.vetalshev.chapter4.computer.DataProvider;

import java.util.List;
import java.util.Scanner;

public class AssembleComputerApp {

    public static void main(String[] args) {

        DataProvider dataProvider = new DataProvider();
        Computer myPC = new Computer();

        Processor myProcessor = new Processor();
        CdRom myCdRom = new CdRom();
        Hdd myHdd = new Hdd();
        Ram myRam = new Ram();

        System.out.println("Choose CD-rom from:");
        List<CdRom> cdRoms = dataProvider.getCdRomList();

        System.out.println("=======================");
        for (CdRom cdRom : cdRoms) {
            System.out.println(cdRom);
        }
        System.out.println("=======================");

        Scanner scan = new Scanner(System.in);
        int cdRomId = scan.nextInt();

        myCdRom = dataProvider.getCdRomById(cdRomId);



        System.out.println("Choose processor from:");
        List<Processor> processors = dataProvider.getProcessorList();

        System.out.println("=======================");
        for (Processor processor : processors) {
            System.out.println(processor);
        }
        System.out.println("=======================");

        int processorId = scan.nextInt();

        myProcessor = dataProvider.getProcessorById(processorId);



        System.out.println("Choose HDD from:");
        List<Hdd> hdds = dataProvider.getHddList();

        System.out.println("=======================");
        for (Hdd hdd : hdds) {
            System.out.println(hdd);
        }
        System.out.println("=======================");

        int hddId = scan.nextInt();

        myHdd = dataProvider.getHddById(hddId);



        System.out.println("Choose RAM from:");
        List<Ram> rams = dataProvider.getRamList();

        System.out.println("=======================");
        for (Ram ram : rams) {
            System.out.println(ram);
        }
        System.out.println("=======================");

        int ramId = scan.nextInt();

        myRam = dataProvider.getRamById(ramId);




        myPC.addProcessor(myProcessor);
        myPC.addHdd(myHdd);
        myPC.addCdRom(myCdRom);
        myPC.addRam(myRam);

        System.out.println("My PC is:\n" + myPC);

        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("Total computer price:" + myPC.getTotalPrice());
        System.out.println("=======================");
        System.out.println("=======================");

    }

}
