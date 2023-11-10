import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTarefa(Task task) {
        taskList.add(task);
    }

    public void removerTarefa(Task task) {
        taskList.remove(task);
    }

    public List<Task> listarLista() {
        return taskList;
    }

}
