module com.mamadou.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;

                            
    opens com.mamadou.calculatrice to javafx.fxml;
    exports com.mamadou.calculatrice;
    exports com.mamadou.calculatrice.controller;
    opens com.mamadou.calculatrice.controller to javafx.fxml;
}