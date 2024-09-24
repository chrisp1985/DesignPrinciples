package com.chrisp1985.gof.chainofresponsibility;

import java.util.List;

public abstract class FileEditor {

    FileEditor nextEditor;
    List<String> acceptableTypes;

    public void openFile(String file, String message) {
        if(acceptableTypes.contains(file)) {
            write(message);
        }
        if(nextEditor != null) {
            nextEditor.openFile(file, message);
        }
    }

    public void passOnToNextEditor(FileEditor editor) {
        nextEditor = editor;
    }

    public void setAcceptableTypes(List<String> types) {
        this.acceptableTypes = types;
    }

    abstract protected void write(String message);
}
