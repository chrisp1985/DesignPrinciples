package com.chrisp1985.gof.chainofresponsibility;

import java.util.List;

public class ChainOfResponsibility {

    public FileEditor getChainOfEditors() {
        FileEditor jsonEditor = new JsonEditor();
        FileEditor msiEditor = new MsiEditor();
        FileEditor textEditor = new TextEditor();

        jsonEditor.setAcceptableTypes(List.of("json"));
        msiEditor.setAcceptableTypes(List.of("msi"));
        textEditor.setAcceptableTypes(List.of("txt", "sh", "doc", "docx", "text", "html", "js"));

        jsonEditor.passOnToNextEditor(msiEditor);
        msiEditor.passOnToNextEditor(textEditor);

        return jsonEditor;
    }
}
