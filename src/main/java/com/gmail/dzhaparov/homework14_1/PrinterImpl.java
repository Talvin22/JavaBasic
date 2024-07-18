package com.gmail.dzhaparov.homework14_1;

public class PrinterImpl implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if ((message.text == null || message.text.isEmpty()) && (message.sender == null || message.sender.isEmpty())) {

            Printer emptyMessageHandler = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyMessageHandler.print(message);
        } else if (message.sender == null || message.sender.isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.text);
        } else {
            System.out.println("Користувач " + message.sender + " відправив повідомлення: " + message.text);
        }
    }

    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        Message[] messages = {
                new Message("Привіт всім!", "Іван"),
                new Message("Привіт!", ""),
                new Message("", "")
        };

        for (Message message : messages) {
            printer.print(message);
        }

    }
}
