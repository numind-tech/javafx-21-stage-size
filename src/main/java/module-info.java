module tech.numind.stagesize {
    requires javafx.controls;
    requires javafx.fxml;


    opens tech.numind.stagesize to javafx.fxml;
    exports tech.numind.stagesize;
}