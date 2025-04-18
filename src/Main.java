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

import static java.lang.System.exit;

public class Main {
    private static final Gson GSON  = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("src/data/trucks.json");

    public static void main(String[] args) {

            Truck[] trucks = FileUtil.readTruckFile();
            Driver[] drivers = FileUtil.readDriverFile();

            if (trucks.length == 0 || drivers.length == 0) {
                System.out.println("Нет данных. Дальнейшая работа невозможна");
                exit(404);
            }
            Truck truck = trucks[1];

            truck.startDriving();
            truck.changeDriver(drivers);
            truck.startDriving();
            truck.changeDriver(drivers);
            truck.startRepair();
            truck.changeDriver(drivers);
            truck.startDriving();















        }
    }



