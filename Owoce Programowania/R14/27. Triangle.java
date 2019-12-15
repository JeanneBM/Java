import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Triangle extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 320.0;
      final double SCENE_HEIGHT = 240.0;
      
      // Stałe określające wierzchołki trójkąta.
      final double TOP_X = 160.0;
      final double TOP_Y = 20.0;
      final double BOTTOM_RIGHT_X = 310.0;
      final double BOTTOM_RIGHT_Y = 220.0;
      final double BOTTOM_LEFT_X = 20.0;
      final double BOTTOM_LEFT_Y = 220.0;
      
      // Rysowanie pierwszej linii — od górnego punktu trójkąta
      // do prawego dolnego rogu.
      Line line1 = new Line(TOP_X, TOP_Y, BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);
      
      // Rysowanie drugiej linii — od górnego punktu trójkąta
      // do lewego dolnego rogu.
      Line line2 = new Line(TOP_X, TOP_Y, BOTTOM_LEFT_X, BOTTOM_LEFT_Y);
      
      // Rysowanie trzeciej linii — od lewego dolnego rogu
      // do prawego dolnego rogu trójkąta.
      Line line3 = new Line(BOTTOM_LEFT_X, BOTTOM_LEFT_Y,
                            BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);
      
      // Dodawanie linii do kontenera typu Pane.
      Pane pane = new Pane(line1, line2, line3);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
