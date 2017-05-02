package ru.vetalshev.thread.example1;

import java.io.*;

public class Resource {

    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        // открываем уже существующий файл на запись, либо созадем новый
        fileWriter = new FileWriter(file, true);
    }


    //TODO: получается мы синхронизировали только запись файл. Но цикл сам (файл SyncThread) не синхронизирован и, соответсвенно, итерации могут чередоваться у потоков
    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            Thread.sleep(500);
            fileWriter.append("->" + i + " ");
            System.out.println("->" + i + " ");
        } catch (IOException e) {
            System.err.print("File error: " + e);
        } catch (InterruptedException e) {
            System.err.print("Thread error: " + e);
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.err.print("File closing error: " + e);
        }
    }
}
