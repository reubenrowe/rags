package rnsr.rag.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TraceHandler {

    private BufferedWriter out;
    private String fileName = "ParserTrace.txt";

    public void openFile() {
        try {
            Files.deleteIfExists(Path.of(fileName));
            out = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }    }

    public void printTraceToFile(String trace) {
        try {
            out.write(trace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
