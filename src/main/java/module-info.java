module ma.saifdine.hd.appg_consult_patients {
    requires javafx.fxml;
    requires java.sql;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.controls;

    opens ma.saifdine.hd.appg_consult_patients to javafx.fxml;
    exports ma.saifdine.hd.appg_consult_patients;
    exports ma.saifdine.hd.appg_consult_patients.models;
    exports ma.saifdine.hd.appg_consult_patients.controllers to javafx.fxml;
    opens ma.saifdine.hd.appg_consult_patients.controllers to javafx.fxml;
}