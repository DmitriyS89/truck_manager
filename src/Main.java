import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Driver;
import models.Truck;
import state.OnBase;
import utils.FileUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final Gson GSON  = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("src/data/trucks.json");

    public static void main(String[] args) {

            Truck[] trucks = FileUtil.readTruckFile();
            Driver[] drivers = FileUtil.readDriverFile();

            Truck truck = trucks[0];

            truck.setStageObj(new OnBase());

            truck.startDriving();
            truck.startDriving();
            truck.changeDriver(drivers);
            truck.startRepair();
            truck.startDriving();
            truck.changeDriver(drivers);














        }
    }



