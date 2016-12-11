package ru.vetalshev.chapter4.computer.data;

import ru.vetalshev.chapter4.computer.components.CdRom;
import ru.vetalshev.chapter4.computer.components.Product;

import java.util.ArrayList;
import java.util.List;

public class CdRomRepoImpl extends ProductRepositoryImpl<CdRom> implements CdRomRepository {

    public CdRomRepoImpl() {
        createList();
    }

    private void createList() {
        CdRom cdRom1 = new CdRom("SAMSUNG DVD-RW white SE6536548 BlueRay DoubleLayer");
//        cdRom1.setCode("SAMSUNG DVD-RW white SE6536548 BlueRay DoubleLayer");
        cdRom1.setPrice(155);
        cdRom1.setManufacturer("Samsung");
        cdRom1.setType("DVD-RW");
        addItem(cdRom1);

        CdRom cdRom2 = new CdRom("Acer CD-RW white ME11111111");
//        cdRom2.setCode("Acer CD-RW white ME11111111");
        cdRom2.setPrice(45);
        cdRom2.setManufacturer("Acer");
        cdRom2.setType("CD-RW");
        addItem(cdRom2);

        CdRom cdRom3 = new CdRom("Asus DVD-R black SDK283511 DoubleLayer");
//        cdRom3.setCode("Asus DVD-R black SDK283511 DoubleLayer");
        cdRom3.setPrice(65);
        cdRom3.setManufacturer("Asus");
        cdRom3.setType("DVD-R");
        addItem(cdRom3);
    }

    @Override
    public List<String> getCodeList() {
        return null;
    }

    @Override
    public List<CdRom> getProductList() {
        return null;
    }

    @Override
    public CdRom findByCode(String code) {
        return null;
    }
}
