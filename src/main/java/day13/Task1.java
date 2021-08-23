package day13;

import day13.classes.Message;
import day13.classes.MessageDatabase;
import day13.classes.User;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Ivan");
        User user2 = new User("Roman");
        User user3 = new User("Roy");

        user1.sendMessage(user2, "Hello users2");
        user1.sendMessage(user2, "???");
        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "!!");
        user2.sendMessage(user1, ":)");
        user3.sendMessage(user1, "Hi "+ user1 +" 1");
        user3.sendMessage(user1, "Hi users1 2");
        user3.sendMessage(user1, "Hi users1 3");
        user1.sendMessage(user3, "Hi user3 1");
        user1.sendMessage(user3, "Hi user3 2");
        user1.sendMessage(user3, "Hi user3 3");
        user3.sendMessage(user1, "QWFwqg");

        MessageDatabase.showDialog(user1, user3);
        System.out.println();
        System.out.println(MessageDatabase.getMessages());

        System.out.println(user1.isSubscribed(user3));
        user1.subscribe(user3);
        System.out.println(user1.isSubscribed(user3));
        System.out.println(user1.isFriend(user3));
        user3.subscribe(user1);
        System.out.println(user1.isFriend(user3));

    }
}
