import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Program ImageDemo.
 */

public class ImageDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie obiektu typu Image.
      Image image = new Image("file:HotAirBalloon.jpg");

      // Tworzenie obiektu typu ImageView.
      ImageView imageView = new ImageView(image);
      
      // Umieszczanie obiektu typu ImageView w kontenerze typu HBox.
      HBox hbox = new HBox(imageView);

      // Tworzenie obiektu typu Scene z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);
      
      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);

      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Balon");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
