package project;

import project.ReadFile;

import java.io.IOException;
import java.util.ArrayList;

public class testing {

    public static void main(String[] args) throws IOException {
        ArrayList<User> test = new ArrayList<>();
        UserMap map = new UserMap();
        FriendshipMap frimap = new FriendshipMap();
        test = ReadFile.readUsers("C:\\Users\\Karl Toomas Vana\\Documents\\Data structures real deal\\Social network\\src\\project\\people.txt");
        map.addUsers(test);
        System.out.println(map.toString());
        WriteFile.write("test.txt", map, frimap);
    }
}
