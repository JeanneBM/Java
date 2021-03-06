import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Aplikacja do przeliczania kilometrów — wersja z wyrażeniem lambda.
 */

public class LambdaKiloConverter extends Application
{
   // Pola.
   private TextField kiloTextField;
   private Label resultLabel;
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu Label do wyświetlania pytania.
      Label promptLabel = new Label("Podaj odległość w kilometrach:");

      // Tworzenie kontrolki typu TextField do podawania danych wejściowych.
      kiloTextField = new TextField();

      // Tworzenie przycisku do uruchamiania przeliczeń.
      Button calcButton = new Button("Przelicz");

      // Tworzenie obiektu obsługi zdarzeń.
      calcButton.setOnAction(event ->
      {         
         // Pobieranie liczby kilometrów.
         Double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Przeliczanie kilometrów na mile.
         Double miles = kilometers * 0.6214;
         
         // Wyświetlanie wyniku.
         resultLabel.setText(String.format("%,.2f w milach", miles));
      });
      
      // Tworzenie pustej kontrolki typu Label do wyświetlania wyniku.
      resultLabel = new Label();

      // Umieszczanie kontrolek promptLabel i kiloTextField w kontenerze typu HBox.
      HBox hbox = new HBox(10, promptLabel, kiloTextField);
      
      // Dodawanie kontrolek HBox, calcButton i resultLabel do kontenera typu VBox.
      VBox vbox = new VBox(10, hbox, calcButton, resultLabel);

      // Wyśrodkowanie zawartości kontenera typu VBox.
      vbox.setAlignment(Pos.CENTER);
      
      // Ustawianie marginesu kontenera typu VBox na 10 pikseli.
      vbox.setPadding(new Insets(10));

      // Tworzenie obiektu typu Scene.
      Scene scene = new Scene(vbox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Przeliczanie kilometrów");

      // Wyświetlanie okna.
      primaryStage.show();   
   }
}
