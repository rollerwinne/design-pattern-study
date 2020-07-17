package ituring_shulou.adapter.exercise2;

import java.io.*;
import java.util.*;

public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        super.load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        super.store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
        super.setProperty(key, value);
    }
    public String getValue(String key) {
        return super.getProperty(key, "");
    }
}
