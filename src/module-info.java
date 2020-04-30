module testfx {
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;
    requires java.logging;

    opens sample to javafx.fxml;
    exports sample;
}
