public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTarefa("Lavar os pratos");
        
        taskManager.exibirLista();

        taskManager.concluirTarefa(1);

        taskManager.exibirLista();
    }
}
