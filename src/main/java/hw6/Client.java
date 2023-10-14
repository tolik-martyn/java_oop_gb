package hw6;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Client {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String request;

        try (Socket socket = new Socket("localhost", 1234);) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {

                System.out.println("""

                        Выберите действие:
                        Создать новую запись студента или учителя, введите -> 1
                        Изменить запись студента или учителя, введите -> 2
                        Выйти из программы -> 0""");

                request = scanner.nextLine();

                if ("0".equals(request)) {
                    dataOutputStream.writeUTF(request);
                    break;
                } else if ("1".equals(request)) {
                    String request1 = requestPersonalDataToCreate().toString();
                    dataOutputStream.writeUTF(request1);
                } else if ("2".equals(request)) {
                    String request2 = requestPersonalDataToChange().toString();
                    dataOutputStream.writeUTF(request2);
                } else {
                    dataOutputStream.writeUTF("*");
                }

                System.out.println("Ответ от сервера: " + dataInputStream.readUTF());

            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static ArrayList<String> requestPersonalDataToCreate() {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("1");

        System.out.println("""

                Создать новую запись студента, введите -> 1
                Создать новую запись учителя, введите -> 2""");
        String request = scanner.nextLine();

        if ("1".equals(request)) {
            list2 = requestStudentDataToCreate();
        } else if ("2".equals(request)) {
            list2 = requestTeacherDataToCreate();
        } else
            list2.add("*");

        for (String str : list2) {
            list1.add(str);
        }

        return list1;
    }

    public static ArrayList<String> requestStudentDataToCreate() {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");

        System.out.println("Напишите имя студента:");
        String name = scanner.nextLine();
        list.add(name);

        System.out.println("Напишите телефон студента:");
        String phone = scanner.nextLine();
        list.add(phone);

        System.out.println("Напишите возраст студента:");
        String age = scanner.nextLine();
        list.add(age);

        return list;
    }

    public static ArrayList<String> requestTeacherDataToCreate() {

        ArrayList<String> list = new ArrayList<>();
        list.add("2");

        System.out.println("Напишите имя учителя:");
        String name = scanner.nextLine();
        list.add(name);

        System.out.println("Напишите телефон учителя:");
        String phone = scanner.nextLine();
        list.add(phone);

        System.out.println("Напишите возраст учителя:");
        String age = scanner.nextLine();
        list.add(age);

        System.out.println("Напишите специализацию учителя:");
        String specialization = scanner.nextLine();
        list.add(specialization);

        System.out.println("Напишите стаж учителя:");
        String experience = scanner.nextLine();
        list.add(experience);

        return list;
    }

    public static ArrayList<String> requestPersonalDataToChange() {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("2");

        System.out.println("""

                Изменить запись студента, введите -> 1
                Изменить запись учителя, введите -> 2""");
        String request = scanner.nextLine();

        if ("1".equals(request)) {
            list2 = requestStudentDataToChange();
        } else if ("2".equals(request)) {
            list2 = requestTeacherDataToChange();
        } else
            list2.add("*");

        for (String str : list2) {
            list1.add(str);
        }

        return list1;
    }

    public static ArrayList<String> requestStudentDataToChange() {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");

        System.out.println("""

                Введите id студента:""");
        String id = scanner.nextLine();
        list.add(id);

        System.out.println("""

                Выберите данные, которые нужно изменить:
                Имя -> 1
                Телефон -> 2
                Возраст -> 3
                Статус -> 4
                Успеваемость -> 5""");
        String dataSelection = scanner.nextLine();
        list.add(dataSelection);

        if ("4".equals(dataSelection)) {
            System.out.println("""

                    Выберите статус:
                    notInstalled (не установлен) -> 1
                    enrolled (зачислен) -> 2
                    graduated (выпустился) -> 3
                    expelled (отчислен) -> 4""");

            String status = scanner.nextLine();
            list.add(status);

        } else if ("5".equals(dataSelection)) {
            System.out.println("""

                    Выберите успеваемость:
                    notInstalled (не установлен) -> 1
                    A -> 2
                    В -> 3
                    C -> 3
                    D -> 3
                    U -> 3""");

            String status = scanner.nextLine();
            list.add(status);

        } else {
            System.out.println("Напишите новые данные:");
            String newData = scanner.nextLine();
            list.add(newData);
        }

        return list;
    }

    public static ArrayList<String> requestTeacherDataToChange() {

        ArrayList<String> list = new ArrayList<>();
        list.add("2");

        System.out.println("""

                Введите id учителя:""");
        String id = scanner.nextLine();
        list.add(id);

        System.out.println("""

                Выберите данные, которые нужно изменить:
                Имя -> 1
                Телефон -> 2
                Возраст -> 3
                Специализация -> 4
                Стаж -> 5
                Статус -> 6""");
        String dataSelection = scanner.nextLine();
        list.add(dataSelection);

        if ("6".equals(dataSelection)) {
            System.out.println("""

                    Выберите статус:
                    notInstalled (не установлен) -> 1
                    hired (нанят) -> 2
                    onVacation (в отпуске) -> 3
                    dismissed (уволен) -> 4""");

            String status = scanner.nextLine();
            list.add(status);
        } else {
            System.out.println("Напишите новые данные:");
            String newData = scanner.nextLine();
            list.add(newData);
        }

        return list;
    }
}
