package org.example.ControlWork.Controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.example.ControlWork.Model.BuildingBlocks;
import org.example.ControlWork.Model.Car;
import org.example.ControlWork.Model.Doll;
import org.example.ControlWork.Model.Toy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithData {
    public WorkingWithData() {
    }

    public List<Toy> Fill(String db) {
        try {
            List<Toy> toyList = new ArrayList<>();
            FileReader filereader = new FileReader(db);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                switch (nextRecord[1].split(" ")[0].toLowerCase()) {
                    case ("конструктор"):
                        toyList.add(new BuildingBlocks(Integer.parseInt(nextRecord[0]), nextRecord[1], Integer.parseInt(nextRecord[2])));
                        break;
                    case ("кукла"):
                        toyList.add(new Doll(Integer.parseInt(nextRecord[0]), nextRecord[1], Integer.parseInt(nextRecord[2])));
                        break;
                    case ("машинка"):
                        toyList.add(new Car(Integer.parseInt(nextRecord[0]), nextRecord[1], Integer.parseInt(nextRecord[2])));
                        break;
                }
            }
            return toyList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void WriteData(String filePath, String text) {
        try {
            FileWriter outputfile = new FileWriter(filePath, true);
            outputfile.append("\n" + text);
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
