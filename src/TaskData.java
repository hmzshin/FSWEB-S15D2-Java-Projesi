import java.util.HashSet;
import java.util.Set;

public class TaskData {
    Set<Task> annsTasks;
    Set<Task> bobsTasks;
    Set<Task> carolsTasks;
    Set<Task> tasksToAssign;

    public TaskData() {
        this.annsTasks = new HashSet<>();
        this.bobsTasks = new HashSet<>();
        this.carolsTasks = new HashSet<>();
        this.tasksToAssign = new HashSet<>();
    }

    public void setTask(Task task) {
        String person = task.getAssignee();
        switch (person) {
            case "ann":
                tasksToAssign.remove(task);
                annsTasks.add(task);
                break;
            case "bob":
                tasksToAssign.remove(task);
                bobsTasks.add(task);
                break;
            case "carol":
                tasksToAssign.remove(task);
                carolsTasks.add(task);
                break;
            default:
                tasksToAssign.add(task);
                break;
        }
    }

    public Set<Task> getTasks(String person) {
        switch (person) {
            case "ann":
                return this.annsTasks;
            case "carol":
                return this.carolsTasks;
            case "bob":
                return this.bobsTasks;
            case "all":
                Set<Task> allTasks = new HashSet<>(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                System.out.println("tasks to assign: ");
                return this.tasksToAssign;
        }
    }

    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectedTasks = new HashSet<>();
        for (Task item : set1) {
            if (set2.contains(item)) {
                intersectedTasks.add(item);
            }
        }
        return intersectedTasks;
    }

    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectedTasks = new HashSet<>();
        for (Task item : set1) {
            if (!set2.contains(item)) {
                intersectedTasks.add(item);
            }
        }
        return intersectedTasks;
    }

    @Override
    public String toString() {
        return "TaskData: {" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                '}';
    }
}
