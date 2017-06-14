package com.irvil.nntextclassifier;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

class LogWindow {
  private FlowPane root;
  private TextArea textAreaLog;

  void show() {
    textAreaLog = new TextArea();
    textAreaLog.setWrapText(true);
    textAreaLog.setEditable(false);
    textAreaLog.setPrefColumnCount(50);
    textAreaLog.setPrefRowCount(30);

    root = new FlowPane();
    root.setAlignment(Pos.BASELINE_CENTER);
    root.getChildren().add(textAreaLog);

    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
  }

  void addText(String text) {
    textAreaLog.appendText(text + "\n");
  }
}
