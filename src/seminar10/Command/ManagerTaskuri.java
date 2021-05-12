package seminar10.Command;

import java.util.ArrayList;

public class ManagerTaskuri {
    ArrayList<TaskAsincron> taskuri = new ArrayList<>();

    public void adaugaTask(TaskAsincron task){
        taskuri.add(task);
    }

    public void executaTask(){
        if (taskuri.size() > 0){
            TaskAsincron task = taskuri.get(0);
            task.executaTask();
            taskuri.remove(0);
        }
    }
}
