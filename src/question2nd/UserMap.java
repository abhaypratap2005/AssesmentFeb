package question2nd;

import java.util.HashMap;

public class UserMap extends HashMap<String, String> {

    @Override
    public String put(String user, String pass) {

        if (containsKey(user)) {
            throw new UserExistsException("User already exists here, review it and fix it");
        }

        return super.put(user, pass);
    }
}
