import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("sprint", "Write database", "ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("sprint", "Write database", "bob", Priority.HIGH, Status.ASSIGNED);
        Task task3 = new Task("front end", "user interface", "carol", Priority.HIGH, Status.ASSIGNED);
        Task task4 = new Task("front end", "fix error", "ann", Priority.HIGH, Status.IN_PROGRESS);
        Task task5 = new Task("back end", "data entry", "bob", Priority.LOW, Status.IN_QUEUE);
        Task task6 = new Task("sprint", "Write something", "carol", Priority.HIGH, Status.ASSIGNED);
        Task task7 = new Task("sprint", "Write something", "", Priority.HIGH, Status.ASSIGNED);

        TaskData tasks = new TaskData();

        tasks.setTask(task1);
        tasks.setTask(task2);
        tasks.setTask(task3);
        tasks.setTask(task4);
        tasks.setTask(task5);
        tasks.setTask(task6);
        tasks.setTask(task7);
        Set<Task> bob = tasks.getTasks("bob");
        Set<Task> ann = tasks.getTasks("ann");

        Set<Task> intersectedTasks = tasks.getDifference(bob, ann);
        System.out.println(intersectedTasks);

    }
}