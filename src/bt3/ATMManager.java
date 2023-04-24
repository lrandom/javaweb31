package bt3;

public class ATMManager {
    User[] users = new User[10];

    public ATMManager() {
        //fake database
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            user.setUsername("user" + i);
            user.setPassword("123456" + i);
            user.setAmount(1000000.f + i);
            users[i] = user;
        }
    }

    public User getUserByUserNameAndPassword(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public boolean withdraw(User user, float amount) {
        if (amount > user.getAmount()) {
            return false;
        }
        user.setAmount(user.getAmount() - amount);
        return true;
    }
}
