module com.mspan.boardgamejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mspan.guigame to javafx.fxml;
    exports com.mspan.guigame;
    exports com.mspan.guigame.BoardEntities;
    opens com.mspan.guigame.BoardEntities to javafx.fxml;
    exports com.mspan.guigame.Controllers;
    opens com.mspan.guigame.Controllers to javafx.fxml;
    exports com.mspan.guigame.BoardSetting;
    opens com.mspan.guigame.BoardSetting to javafx.fxml;
}