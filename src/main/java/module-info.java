module tech.numind.stagesize {
    requires javafx.controls;

    opens tech.numind.stagesize to javafx.controls;
    exports tech.numind.stagesize;
}