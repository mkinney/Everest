/*
 * Copyright 2018 Rohit Awate.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rohitawate.restaurant.dashboard;

import com.jfoenix.controls.JFXCheckBox;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.util.Pair;

import java.net.URL;
import java.util.ResourceBundle;

public class HeaderFieldController implements Initializable {
    @FXML
    private TextField keyField, valueField;
    @FXML
    private JFXCheckBox checkBox;

    public Pair<String, String> getHeader() {
        return new Pair<>(keyField.getText(), valueField.getText());
    }

    public boolean isChecked() {
        return checkBox.isSelected();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        checkBox.disableProperty().bind(Bindings.or(keyField.textProperty().isEmpty(), valueField.textProperty().isEmpty()));
    }
}