package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import models.CharCounterMachine;

/**
 * @version jre1.8
 */
public class MainViewController {
    private CharCounterMachine charCounterMachine;
    @FXML
    private TextArea inputTextArea;

    @FXML
    private Label resultsLabel;

    /**
     * Was called when anything is typed into the input text area
     * Counts
     *      Words
     *      All chars
     *          Digits
     *          Upper-case letters
     *          Lower-case letters
     *          Special characters
     * and shows result in the results label
     * that contains detailed information about cheking results
     */
    @FXML
    private void handleInputTextChangedAction() {
        if(charCounterMachine == null)
        {
            /*
             *  If this is the first time any text is entered entered
             *  Initialize charCounterMachine in order to use its methods for
             *  accomplishing main task of this program
             */
            charCounterMachine = new CharCounterMachine();
        }

        /*
         *  Execute operations based on the user input
         *  and dislpay it
         */
        resultsLabel.setText(charCounterMachine.getCharFrequenciesInfo(inputTextArea.getText()));

        /*
         * Clear content of fields in order further to be used
         */
        charCounterMachine.resetCounts();
    }

}
