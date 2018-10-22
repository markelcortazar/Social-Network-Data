package project;

import java.io.*;

public class WriteFile {
    public static void write (String filename, UserMap userMap,FriendshipMap friendshipMap) throws IOException {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"))) {
            writer.write(userMap.toString());
            writer.write("\n");
            writer.write(friendshipMap.toString());
            writer.close();
        }
    }
}
