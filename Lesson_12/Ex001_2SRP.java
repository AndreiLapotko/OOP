package Lesson_12;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_2SRP {
    public static void main(String[] args) {

        PlannerSRP planner = new PlannerSRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        FileManager fm = new FileManager();
        fm.saveAllText(planner, "c:\\безысходность\\srp.txt");

    }
}

class PlannerSRP {
    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join("\n", entries);
    }
}

class DataManager {
    void save(PlannerSRP planner, String path) {

    }
}

class FileManager extends DataManager {
    public boolean check(String filename){
        return true;
    }
    public void saveAllText(PlannerSRP planner, String path) {
        /// ошибки связанные с...
        if (check(path)) ;///
    }
    public void save(PlannerSRP planner, String path) {
        this.saveAllText(planner, path);
    }

    public void loadFromFile(PlannerSRP planner, String path) {
        /// ошибки связанные с...
        if (check(path))
            ;///
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
        if (check(url))
            ;///
    }
}
class DbManager extends DataManager {
    public boolean check(String filename){
        return true;
    }
    private void saveDb(PlannerSRP planner, String url, String username, String password) {
        if (check(url));
        save(planner, new ConnectProvider(url, username, password).getPath());
    }
}
class ConnectProvider {
    String url;
    String username;
    String password;
    public ConnectProvider(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    public String getPath() {
        return "...";
    }
}