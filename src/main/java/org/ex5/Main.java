package org.ex5;

import org.utils.*;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path = FileUtils.getAbsoluteFilePath(FileUtils.getProjectPath()) + "\\src\\main\\resources\\test.ser";
        Message message = new Message("test serializable");
        SerializeFile(message, path);
        Message messageDes = DeserializeFile(path);
        System.out.println(message.equals(messageDes));
    }

    public static void SerializeFile(Message message, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Message DeserializeFile(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (Message) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}