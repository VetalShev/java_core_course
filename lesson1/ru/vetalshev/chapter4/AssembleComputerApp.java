package ru.vetalshev.chapter4;

import ru.vetalshev.chapter4.computer.components.*;

import ru.vetalshev.chapter4.computer.data.CdRomRepoImpl;

import java.util.List;
import java.util.Scanner;

public class AssembleComputerApp {

    public static void main(String[] args) {

        CdRomRepoImpl cdRomRepo = new CdRomRepoImpl();

        Computer myPC = new Computer();

        System.out.println("Choose CD-rom from:");
        List<CdRom> cdRoms = cdRomRepo.getProductList();

        System.out.println("=======================");
        for (Product cdRom : cdRoms) {
            System.out.println(cdRom);
        }
        System.out.println("=======================");

        Scanner scan = new Scanner(System.in);
        String cdRomQuery = scan.nextLine();

        CdRom myCdRom = cdRomRepo.findByCode(cdRomQuery);




        myPC.addCdRom(myCdRom);



        System.out.println("My PC is:\n" + myPC);
//
        System.out.println("=======================");
        System.out.println("=======================");
        System.out.println("Total computer price:" + myPC.getTotalPrice());
        System.out.println("=======================");
        System.out.println("=======================");

    }

}
