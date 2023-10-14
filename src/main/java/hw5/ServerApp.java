package hw5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerApp {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();

        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидает соединения...");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            DataOutputStream data0utputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest1 = dataInputStream.readUTF();
                if ("end".equals(clientRequest1))
                    break;

                else if ("1".equals(clientRequest1)) {
                    data0utputStream.writeUTF("Напишите имя студента");
                    String clientRequest2 = dataInputStream.readUTF();
                    data0utputStream.writeUTF("Напишите телефон студента");
                    String clientRequest3 = dataInputStream.readUTF();
                    data0utputStream.writeUTF("Напишите возраст студента");
                    String clientRequest4 = dataInputStream.readUTF();
                    Students student = new Students(clientRequest2, Integer.parseInt(clientRequest3),
                            Integer.parseInt(clientRequest4));
                    students.add(student);
                }

                else if ("2".equals(clientRequest1)) {
                    data0utputStream.writeUTF("""
                            Изменить имя студента, введите -> 1
                            Изменить телефон студента, введите -> 2
                            Изменить возраст студента, введите -> 3
                            Изменить статус студента, введите -> 4
                            Изменить успеваемость студента, введите -> 5""");
                }

                else if ("3".equals(clientRequest1)) {
                    data0utputStream.writeUTF("Ответ от сервера: Напишите имя учителя");
                }

                else if ("4".equals(clientRequest1)) {
                    data0utputStream.writeUTF("""
                            Изменить имя учителя, введите -> 1
                            Изменить телефон учителя, введите -> 2
                            Изменить возраст учителя, введите -> 3
                            Изменить специализацию учителя, введите -> 4
                            Изменить стаж учителя, введите -> 5
                            Изменить статус учителя, введите -> 6""");
                }

                else {
                    System.out.println("");
                    data0utputStream.writeUTF("Ответ от сервера: Указана неверная команда");
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
