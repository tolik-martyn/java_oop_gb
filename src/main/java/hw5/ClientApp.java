package hw5;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ClientApp {
    public static void main(String[] args) {
        String request;
        try (Socket socket = new Socket("localhost", 1234); Scanner scanner = new Scanner(System.in)) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                System.out.println("""
                        Создать новую запись студента, введите -> 1
                        Изменить запись студента, введите -> 2
                        Создать новую запись учителя, введите -> 3
                        Изменить запись учителя, введите -> 4""");
                request = scanner.nextLine();
                dataOutputStream.writeUTF(request);
                if ("end".equals(request))
                    break;
                System.out.println("Ответ от сервера: " + dataInputStream.readUTF());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
