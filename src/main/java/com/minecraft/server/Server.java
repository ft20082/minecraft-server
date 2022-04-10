package com.minecraft.server;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("all")
public class Server {

    public static class THREAD1 {

        public static void thread1() {
            Thread thread1 = new Thread();

            thread1.setName("thread1");

            thread1.start();

            System.out.println(thread1.getName());
        }
    }

    public static void main(String[] args) {

        Frame minecraft_1_19_1 = new Frame("Minecraft 1.19.1");

        minecraft_1_19_1.setSize(900,700);

        Button ClOSE = new Button("CLOSE");

        minecraft_1_19_1.add(ClOSE);

        ClOSE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minecraft_1_19_1.disable();
                System.out.println("DISABLE");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                minecraft_1_19_1.enable();
                System.out.println("ENABLE");
            }
        });

        minecraft_1_19_1.setVisible(true);
    }

}
