module com.mspan.boardgamejavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.mspan.boardgamejavafx to javafx.fxml;
    exports com.mspan.boardgamejavafx;
}