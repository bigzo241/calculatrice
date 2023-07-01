package com.mamadou.calculatrice.controller;

import com.mamadou.calculatrice.metier.MathExpression;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class calculController {
    @FXML
    private Label resultLabel;
    @FXML
    private Label operationLabel;

    private MathExpression mathExpression = new MathExpression();

    @FXML
    protected void operationLabelUpdate(ActionEvent e) {
        Button btn = (Button) e.getSource();
//        System.out.println(btn.getText());
        String ope = operationLabel.getText() + btn.getText();
//        System.out.println(ope);
        operationLabel.setText(ope);
    }

    @FXML
    protected void onEgale() {
        if (mathExpression.syntaxeChecker(operationLabel.getText()))
            resultLabel.setText("Syntaxe correcte");
        else
            resultLabel.setText("Erreur syntaxe");
    }
    @FXML
    protected void clearLastCaractere() {
        String ope = operationLabel.getText();
        if (!ope.isEmpty())
            operationLabel.setText(ope.substring(0, ope.length()-1));
    }
    @FXML
    protected void clearAll() {
        operationLabel.setText("");
    }
}