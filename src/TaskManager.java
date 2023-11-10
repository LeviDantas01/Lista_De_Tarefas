import java.util.List;

public class TaskManager {

    private TaskList taskList;

    public TaskManager() {
        this.taskList = new TaskList();
    }

    public void addTarefa(String descricao) {
        int taskId = taskList.listarLista().size() + 1;
        Task task = new Task(taskId, descricao);
        taskList.addTarefa(task);
    }

    public void concluirTarefa(int taskId) {
        List<Task> tasks = taskList.listarLista();
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setStatus(true);
                System.out.println("Tarefa concluida");
                return;
            }
        }
        System.out.println("Tarefa não encontrada");
    }

    public void exibirLista() {
        List<Task> tasks = taskList.listarLista();
        if (tasks.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (Task task : tasks) {
                task.detalhes();
            }
        }
    }

}
