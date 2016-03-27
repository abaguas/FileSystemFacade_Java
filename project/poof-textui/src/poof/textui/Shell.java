package poof.textui;

import static ist.po.ui.Dialog.IO;

import java.io.IOException;

import poof.FileManager;
import poof.CoreException;

/**
 * Class that starts the application's textual interface.
 */
public class Shell {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();
        String datafile = System.getProperty("import"); //$NON-NLS-1$

        if (datafile != null) {
            fileManager.dataImport(datafile);
        }
        poof.textui.main.MenuBuilder.menuFor(fileManager);
        IO.closeDown();
    }

}
