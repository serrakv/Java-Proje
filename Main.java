package View;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        int width = 700, height = 400;
        GridPane grid = new GridPane();
        GridPane miniGrid = new GridPane();
        Scene scene = new Scene(grid, width, height);

        Label[] labels = new Label[]{

                new Label("Öğrenci Adı:"),
                new Label("Öğrenci Soyadı:"),
                new Label("Öğrenci ID:"),
                new Label("Öğrenci Sınıf Seviyesi:"),
                new Label("Kurs Miktarı:"),
                new Label("Ödeme Tutarı:")
        };

                TextField[] textFields = {
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField()
        };

        Button[] buttons = {
                new Button("Ekle"),
                new Button("Sil"),
                new Button("Güncelle"),
                new Button("Listele"),
                new Button("Temizle"),
                new Button("Hesapla")
        };

        grid.setVgap(5);
        grid.setHgap(5);
        miniGrid.setHgap(5);

        for (int i = 0; i < textFields.length; i++) {
            textFields[i].setMinWidth(width - 100);
            grid.addRow(i, labels[i], textFields[i]);
        }


        for (int i = 0; i < buttons.length; i++) {
            miniGrid.add(buttons[i], i, 0);
        }

        grid.add(miniGrid, 1, 6);

        ObservableList<Map<String, String>> items = FXCollections.observableArrayList();

        TableView table = new TableView();

        TableColumn<Map, String> adiCol = new TableColumn<>("Adı");
        adiCol.setCellValueFactory(new MapValueFactory<>("adi"));

        TableColumn<Map, String> soyadiCol = new TableColumn<>("Soyadı");
        soyadiCol.setCellValueFactory(new MapValueFactory<>("soyadi"));

        TableColumn<Map, String> ogrenciIDCol = new TableColumn<>("Öğrenci ID");
        ogrenciIDCol .setCellValueFactory(new MapValueFactory<>("ogrenciID"));

        TableColumn<Map, String> ogrenciSinCol = new TableColumn<>("Öğrenci Sınıf Seviyesi");
        ogrenciSinCol .setCellValueFactory(new MapValueFactory<>("ogrenciSin"));

        TableColumn<Map, String> kursMCol = new TableColumn<>("Kurs Miktarı");
        kursMCol.setCellValueFactory(new MapValueFactory<>("kursM"));

        TableColumn<Map, String> odemeMCol = new TableColumn<>("Ödeme Tutarı");
        odemeMCol.setCellValueFactory(new MapValueFactory<>("odemeT"));

        table.getColumns().addAll(adiCol, soyadiCol, ogrenciIDCol, ogrenciSinCol, kursMCol, odemeMCol);

        Map<String, String>  serra = new HashMap<>();
        serra.put("adi", "Serra");
        serra.put("soyadi", "Kavukçu");
        serra.put("ogrenciID", "217TMI1014L");
        serra.put("ogrenciSin" , "4");
        serra.put("kursM", "3");
        serra.put("odemeT", "1800");

        items.addAll(serra);
        table.getItems().addAll(items);

        grid.add(table, 1, 7);

        primaryStage.setTitle("Öğrenci Yönetim Sistemi");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
