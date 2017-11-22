package ru.thematdev.bot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream myfile = new FileInputStream("C:/Users/b.admin/IdeaProjects/TELEGRAMBOT/phs/1.jpg");
        byte[] temp = new byte[0];
        myfile.read(temp);
        System.out.println(temp);
    }
}