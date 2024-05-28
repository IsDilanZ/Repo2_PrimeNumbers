module com.example.repo2_primenumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo2_primenumbers to javafx.fxml;
    exports com.example.repo2_primenumbers;
}