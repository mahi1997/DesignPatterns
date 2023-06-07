package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Properties properties = System.getProperties();
        String prod_dir=System.getProperty("user.dir")+"/src/main/resources/prod";
        try {
            Files.createDirectories(Paths.get(prod_dir));
            Map<String,String> rules = new HashMap<>();
            rules.put("rule1","rule1-> abc");
            rules.put("rule2","rule2-> def");
            for(String file : rules.keySet()){
                System.out.println("writing to config file :"+ prod_dir+"/"+file);
                File yourFile = new File(prod_dir+"/"+file);
                yourFile.createNewFile(); // if file already exists will do nothing
                FileOutputStream outputStream = new FileOutputStream(yourFile);
                outputStream.write(rules.get(file).getBytes(StandardCharsets.UTF_8));
                outputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}