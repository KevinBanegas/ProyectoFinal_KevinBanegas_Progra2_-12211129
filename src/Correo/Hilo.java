package Correo;

import java.io.File;
import javax.swing.JEditorPane;

public class Hilo extends Thread {

    private javax.swing.JEditorPane editorP;
    private TodosFolders folders;

    public Hilo(JEditorPane editorP, TodosFolders folders) {
        this.editorP = editorP;
        this.folders = folders;
    }

    public Hilo() {
    }

    public JEditorPane getEditorP() {
        return editorP;
    }

    public void setEditorP(JEditorPane editorP) {
        this.editorP = editorP;
    }

    public TodosFolders getFolders() {
        return folders;
    }

    public void setFolders(TodosFolders folders) {
        this.folders = folders;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
            File file = new File("correo.html");
            if(file.exists()){
                editorP.setPage(new File("correo.html").toURI().toURL());
            }else{
                editorP.setText(folders.getVacio());
            }
        } catch (Exception e) {

        }
    }

}
