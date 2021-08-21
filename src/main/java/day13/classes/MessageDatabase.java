package day13.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();


    public static List<Message> getMessages() {
        return messages;
    }

    public static void setMessages(List<Message> messages) {
        MessageDatabase.messages = messages;
    }

    public static void addNewMessage (User u1, User u2, String text) {

        messages.add(new Message(u1, u2, text));

    }


    public static void showDialog(User u1, User u2) {

        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2 ||
            message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ": " +message.getText());
            }
        }

    }


}
