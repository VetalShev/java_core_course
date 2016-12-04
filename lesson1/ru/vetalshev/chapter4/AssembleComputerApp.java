package ru.vetalshev.chapter4;

import ru.vetalshev.chapter4.computer.Computer;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Hdd;
import ru.vetalshev.chapter4.computer.components.Processor;
import ru.vetalshev.chapter4.computer.components.Ram;

public class AssembleComputerApp {

    public static void main(String[] args) {

        Computer myPC = new Computer();

        Processor myProcessor = new Processor();
        CdRom myCdRom = new CdRom();
        Hdd myHdd = new Hdd();
        Ram myRam = new Ram();

        myProcessor.setPrice(1560);
        myCdRom.setPrice(25);
        myHdd.setPrice(350);
        myRam.setPrice(200);

        myPC.addProcessor(myProcessor);
        myPC.addHdd(myHdd);
        myPC.addCdRom(myCdRom);
        myPC.addRam(myRam);

        System.out.println("Total computer price:" + myPC.getTotalPrice());

    }

}
