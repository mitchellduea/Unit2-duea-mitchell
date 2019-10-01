import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXProgram extends Application {

  public void start(Stage stage){
    Text hello = new Text(20, 50, "My Name is Mitchell!!");
    Text question = new Text(20, 70, "What is your name???");
    Rectangle box = new Rectangle(10, 20, 150, 59);
    Rectangle eyeleft = new Rectangle(100,100,100,100);
    Circle sun = new Circle(4 0,20,30);
    box.setStroke(Color.BLUE);
    sun. setStroke(Color.RED);
    sun.setFill(Color.RED);
    box.setFill(null);
    sun.setStroke(Color.RED);
    Group root = new Group(hello, question, box);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTBLUE);

    stage.setTitle("FXProgram");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
