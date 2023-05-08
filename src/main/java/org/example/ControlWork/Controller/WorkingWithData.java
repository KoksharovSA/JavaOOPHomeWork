package org.example.ControlWork.Controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.apache.commons.lang3.math.NumberUtils;
import org.example.ControlWork.Model.BuildingBlocks;
import org.example.ControlWork.Model.Car;
import org.example.ControlWork.Model.Doll;
import org.example.ControlWork.Model.Toy;

import java.io.*;
import java.util.*;

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
            outputfile.append(text + "\n");
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer NextId() {
        try {
            List<Integer> listId = new ArrayList<>();
            FileReader filereader = new FileReader(Settings.dirDb);
            BufferedReader br = new BufferedReader(filereader);
            String line = br.readLine();
            while (line != null) {
                listId.add(Integer.parseInt(line.split(",")[0]));
                line = br.readLine();
            }
            return Collections.max(listId) + 1;
        } catch (Exception e) {
//            e.printStackTrace();
            return 1;
        }
    }

    public void AddToy(String[] toy) {
        String result = NextId() + ",\"" + toy[0] + " " + toy[1] + "\"," + toy[2];
        WriteData(Settings.dirDb, result);
    }

    public boolean RemoveToy(int id) {
        try {
            boolean isGood = false;
            FileReader filereader = new FileReader(Settings.dirDb);
            BufferedReader br = new BufferedReader(filereader);
            String line = br.readLine();

            FileWriter outputfile = new FileWriter(Settings.dirDb);
            outputfile.write("");
            outputfile.close();
            outputfile = new FileWriter(Settings.dirDb, true);
            while (line != null) {
                if (Integer.parseInt(line.split(",")[0]) != id) {
                    outputfile.append(line + "\n");
                    isGood = true;
                }
                line = br.readLine();
            }
            filereader.close();
            outputfile.close();
            return isGood;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
