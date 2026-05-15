import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            // =========================================
            // CREATING FILE OBJECT
            // =========================================

            File file = new File("demo.txt");


            // =========================================
            // CREATING FILE
            // =========================================

            if(file.createNewFile()) {

                System.out.println(
                        "File Created Successfully."
                );

            } else {

                System.out.println(
                        "File Already Exists."
                );
            }


            // =========================================
            // FILE INFORMATION
            // =========================================

            System.out.println(
                    "\nFile Information:"
            );

            // getName()
            System.out.println(
                    "File Name: " +
                            file.getName()
            );

            // getPath()
            System.out.println(
                    "File Path: " +
                            file.getPath()
            );

            // getAbsolutePath()
            System.out.println(
                    "Absolute Path: " +
                            file.getAbsolutePath()
            );

            // exists()
            System.out.println(
                    "File Exists? " +
                            file.exists()
            );

            // canRead()
            System.out.println(
                    "Can Read? " +
                            file.canRead()
            );

            // canWrite()
            System.out.println(
                    "Can Write? " +
                            file.canWrite()
            );

            // length()
            System.out.println(
                    "File Size: " +
                            file.length() + " bytes"
            );


            // =========================================
            // CHECKING FILE TYPE
            // =========================================

            System.out.println(
                    "\nFile Type Information:"
            );

            // isFile()
            System.out.println(
                    "Is File? " +
                            file.isFile()
            );

            // isDirectory()
            System.out.println(
                    "Is Directory? " +
                            file.isDirectory()
            );


            // =========================================
            // RENAMING FILE
            // =========================================

            File renamedFile =
                    new File("newdemo.txt");

            if(file.renameTo(renamedFile)) {

                System.out.println(
                        "\nFile Renamed Successfully."
                );

            } else {

                System.out.println(
                        "\nFile Rename Failed."
                );
            }


            // =========================================
            // CREATING DIRECTORY
            // =========================================

            File folder =
                    new File("JavaFolder");

            if(folder.mkdir()) {

                System.out.println(
                        "Folder Created Successfully."
                );

            } else {

                System.out.println(
                        "Folder Already Exists."
                );
            }


            // =========================================
            // LISTING FILES AND FOLDERS
            // =========================================

            File currentDir =
                    new File(".");

            File files[] =
                    currentDir.listFiles();

            System.out.println(
                    "\nFiles and Folders:"
            );

            for(File f : files) {

                System.out.println(
                        f.getName()
                );
            }


            // =========================================
            // LAST MODIFIED TIME
            // =========================================

            System.out.println(
                    "\nLast Modified:"
            );

            System.out.println(
                    renamedFile.lastModified()
            );


            // =========================================
            // DELETE FILE
            // =========================================

            if(renamedFile.delete()) {

                System.out.println(
                        "\nFile Deleted Successfully."
                );

            } else {

                System.out.println(
                        "\nFile Delete Failed."
                );
            }


            // =========================================
            // DELETE FOLDER
            // =========================================

            if(folder.delete()) {

                System.out.println(
                        "Folder Deleted Successfully."
                );

            } else {

                System.out.println(
                        "Folder Delete Failed."
                );
            }

        } catch(IOException e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll File Class Operations Completed."
        );
    }
}
