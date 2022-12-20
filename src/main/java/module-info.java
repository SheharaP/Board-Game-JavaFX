module com.mspan.boardgamejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mspan.guigame to javafx.fxml;
    exports com.mspan.guigame;
}