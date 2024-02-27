import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("sprint", "Write database", "ann", Priority.LOW,
                Status.ASSIGNED);
        Task task2 = new Task("sprint", "Write database", "bob", Priority.HIGH,
                Status.ASSIGNED);
        Task task3 = new Task("front end", "user interface", "carol", Priority.HIGH,
                Status.ASSIGNED);
        Task task4 = new Task("front end", "fix error", "ann", Priority.HIGH,
                Status.IN_PROGRESS);
        Task task5 = new Task("back end", "data entry", "bob", Priority.LOW,
                Status.IN_QUEUE);
        Task task6 = new Task("sprint", "Write something", "carol", Priority.HIGH,
                Status.ASSIGNED);
        Task task7 = new Task("sprint", "Write something", "", Priority.HIGH,
                Status.ASSIGNED);

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

        String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost."
                + "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice,"
                + " and in November he began working on the manuscript in earnest. To add the finishing touches he researched"
                + " natural history in connection with the animals presented in the book and then had the book examined"
                + " by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations"
                + " to the original copy, on publication he was advised to find a professional illustrator so the pictures"
                + " were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret"
                + " Carroll's visions through his own artistic eye, telling him that the story had been well liked by the "
                + "children.\n" + "\n" + " Carroll began planning a print edition of the Alice story in 1863."
                + " He wrote on 9 May 1863 that MacDonald's family had suggested he publish Alice. "
                + "A diary entry for 2 July says that he received a specimen page of the print edition around that date."
                + " On 26 November 1864, Carroll gave Alice the manuscript of Alice's Adventures Under Ground, with illustrations"
                + " by Carroll, dedicating it as A Christmas Gift to a Dear Child in Memory of a Summer's Day. "
                + "The published version of Alice's Adventures in Wonderland is about twice the length of"
                + " Alice's Adventures Under Ground and includes episodes, such as the Mad Tea-Party,"
                + " that did not appear in the manuscript. The only known manuscript copy of Under Ground"
                + " is held in the British Library. Macmillan published a facsimile of the manuscript in 1886.";

        text = text.replaceAll("[.,!?]", "");

        System.out.println("*************************************************************");

        String[] words = text.split("\\s+");
        System.out.println(words.length);

        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));

        int uniqueWordCount = uniqueWords.size();

        System.out.println(uniqueWords);
        System.out.println(uniqueWordCount);
    }
}