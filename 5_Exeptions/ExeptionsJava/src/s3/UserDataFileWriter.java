package s3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class UserDataFileWriter {
    private Map<String, FileWriter> writers;

    public UserDataFileWriter() {
        writers = new HashMap<>();
    }

    public void writeUserData(UserData userData) throws IOException {
        String fileName = userData.getLastName() + ".txt";
        FileWriter writer = writers.get(fileName);
        if (writer == null) {
            writer = new FileWriter(fileName);
            writers.put(fileName, writer);
        }
        writer.write(userData.toString() + System.lineSeparator());
    }

    public void closeWriters() throws IOException {
        for (FileWriter writer : writers.values()) {
            writer.close();
        }
    }
}
