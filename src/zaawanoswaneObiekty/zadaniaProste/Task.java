package zaawanoswaneObiekty.zadaniaProste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    String name;
    String user;
    int time;

    public Task(String name, String user, int time) {
        this.name = name;
        this.user = user;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        Map<String, List<Task>> map = new HashMap<>();
        map.put("In progress", new ArrayList<>());
        map.put("To do", new ArrayList<>());
        map.put("Done", new ArrayList<>());
        map.get("In progress").add(new Task("Deploy to Azure","Bob",6));
        map.get("In progress").add(new Task("Handle user input","John",5));
        map.get("To do").add(new Task("Connect DB","John",3));
        map.get("To do").add(new Task("Add users","Jessica",2));
        map.get("To do").add(new Task("Configure logging","Jonh",1));
        map.get("Done").add(new Task("Prepare dataset","Bob",5));
        int johnsTask=0;
        int tasksSum=0;
        int taskCount=0;
        for (String key:
                map.keySet()
             ) {
            List<Task> list= map.get(key);
            System.out.println(key+"("+list.size()+"):");
            for (Task task:list) {
                System.out.println("* " +
                        task.name +
                        "(" +
                        task.user +
                        ", " +
                        task.time +
                        ")");
                if (task.user.equals("John")) johnsTask++;
                taskCount++;
                tasksSum+= task.time;
            }


        }
        System.out.println("John was assinged to " + johnsTask+" in this Sprint");
        System.out.println("Mean approximate time per task is " + String.format("%.02f",tasksSum/(double)taskCount));

    }
}
