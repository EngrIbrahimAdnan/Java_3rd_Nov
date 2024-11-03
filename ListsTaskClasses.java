import java.util.ArrayList;
import java.util.List;

public class ListsTaskClasses {
    private List<String> privateList;

    public ListsTaskClasses() {
        this.privateList = new ArrayList<>();
    }

    public void AddToList(List<String> ListOfMovies) {
        this.privateList.addAll(ListOfMovies);
    }

    public void removeFromList(int ElementToBeRemovedIndex) {
        this.privateList.remove(ElementToBeRemovedIndex);
    }

    public void printALl() {
        System.out.println(this.privateList);
    }

    public static void main(String[] args) {
        ListsTaskClasses movieCollection = new ListsTaskClasses();
        movieCollection.AddToList(List.of("Dark knight", "Power rangers", "Batman Freeze", "Appleseed", "Inception"));
        movieCollection.removeFromList(2);
        movieCollection.printALl();
    }
}