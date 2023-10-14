package hw6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        ArrayList<Teachers> teachers = new ArrayList<>();

        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println(LocalDateTime.now() + ": Сервер запущен, ожидает соединения");
            Socket socket = serverSocket.accept();
            System.out.println(LocalDateTime.now() + ": Клиент подключился");
            DataOutputStream data0utputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                String data1 = clientRequest.replace("[", "").replace("]", "");
                String[] data2 = data1.split(", ");

                if ("0".equals(data2[0])) {
                    System.out.println(LocalDateTime.now() + ": Клиент отключился");
                    break;
                } else if ("1".equals(data2[0])) {

                    if ("1".equals(data2[1]) && !"*".equals(data2[2])) {
                        Students student = new Students(data2[2], Integer.parseInt(data2[3]),
                                Integer.parseInt(data2[4]));
                        students.add(student);
                        data0utputStream.writeUTF("Создана запись -> " + student);
                    } else if ("2".equals(data2[1]) && !"*".equals(data2[2])) {
                        Teachers teacher = new Teachers(data2[2], Integer.parseInt(data2[3]),
                                Integer.parseInt(data2[4]), data2[5], Integer.parseInt(data2[6]));
                        teachers.add(teacher);
                        data0utputStream.writeUTF("Создана запись -> " + teacher);
                    } else {
                        System.out.println(LocalDateTime.now() + ": Запись не создана, так как данные введены неверно");
                        data0utputStream.writeUTF("Запись не создана, так как данные введены неверно");
                    }

                } else if ("2".equals(data2[0])) {

                    if ("1".equals(data2[1]) && !"*".equals(data2[2])) {

                        if (students.isEmpty()) {
                            System.out.println(LocalDateTime.now() + ": Записи со студентами отсутствуют");
                            data0utputStream.writeUTF("Записи со студентами отсутствуют");
                        } else {
                            boolean flag = false;
                            for (Students student : students) {
                                if (student.getPersonId() == Integer.parseInt(data2[2])) {
                                    switch (data2[3]) {
                                        case "1":
                                            student.setPersonName(data2[4]);
                                            break;
                                        case "2":
                                            student.setPersonPhone(Integer.parseInt(data2[4]));
                                            break;
                                        case "3":
                                            student.setPersonAge(Integer.parseInt(data2[4]));
                                            break;
                                        case "4":
                                            if ("1".equals(data2[4])) {
                                                student.setStudentStatus(Students.StudentStatus.notInstalled);
                                            } else if ("2".equals(data2[4])) {
                                                student.setStudentStatus(Students.StudentStatus.enrolled);
                                            } else if ("3".equals(data2[4])) {
                                                student.setStudentStatus(Students.StudentStatus.graduated);
                                            } else if ("4".equals(data2[4])) {
                                                student.setStudentStatus(Students.StudentStatus.expelled);
                                            }
                                            break;
                                        case "5":
                                            if ("1".equals(data2[4])) {
                                                student.setAcademicPerformance(
                                                        Students.AcademicPerformance.notInstalled);
                                            } else if ("2".equals(data2[4])) {
                                                student.setAcademicPerformance(Students.AcademicPerformance.A);
                                            } else if ("3".equals(data2[4])) {
                                                student.setAcademicPerformance(Students.AcademicPerformance.В);
                                            } else if ("4".equals(data2[4])) {
                                                student.setAcademicPerformance(Students.AcademicPerformance.C);
                                            } else if ("4".equals(data2[4])) {
                                                student.setAcademicPerformance(Students.AcademicPerformance.D);
                                            } else if ("4".equals(data2[4])) {
                                                student.setAcademicPerformance(Students.AcademicPerformance.U);
                                            }
                                            break;
                                    }
                                    data0utputStream.writeUTF("Измененная запись -> " + student);
                                    flag = true;
                                    break;
                                }
                            }
                            if (!flag) {
                                System.out.println(LocalDateTime.now() + ": Запись с id " + data2[2] + " не найдена");
                                data0utputStream.writeUTF(": Запись с id " + data2[2] + " не найдена");
                            }
                        }

                    } else if ("2".equals(data2[1]) && !"*".equals(data2[2])) {

                        if (teachers.isEmpty()) {
                            System.out.println(LocalDateTime.now() + ": Записи с учителями отсутствуют");
                            data0utputStream.writeUTF("Записи с учителями отсутствуют");
                        } else {
                            boolean flag = false;
                            for (Teachers teacher : teachers) {
                                if (teacher.getPersonId() == Integer.parseInt(data2[2])) {
                                    switch (data2[3]) {
                                        case "1":
                                            teacher.setPersonName(data2[4]);
                                            break;
                                        case "2":
                                            teacher.setPersonPhone(Integer.parseInt(data2[4]));
                                            break;
                                        case "3":
                                            teacher.setPersonAge(Integer.parseInt(data2[4]));
                                            break;
                                        case "4":
                                            teacher.setTeacherSpecialization(data2[4]);
                                            break;
                                        case "5":
                                            teacher.setTeacherExperience(Integer.parseInt(data2[4]));
                                            break;
                                        case "6":
                                            if ("1".equals(data2[4])) {
                                                teacher.setTeacherStatus(Teachers.TeacherStatus.notInstalled);
                                            } else if ("2".equals(data2[4])) {
                                                teacher.setTeacherStatus(Teachers.TeacherStatus.hired);
                                            } else if ("3".equals(data2[4])) {
                                                teacher.setTeacherStatus(Teachers.TeacherStatus.onVacation);
                                            } else if ("4".equals(data2[4])) {
                                                teacher.setTeacherStatus(Teachers.TeacherStatus.dismissed);
                                            }
                                            break;
                                    }
                                    data0utputStream.writeUTF("Измененная запись -> " + teacher);
                                    flag = true;
                                    break;
                                }
                            }
                            if (!flag) {
                                System.out.println(LocalDateTime.now() + ": Запись с id " + data2[2] + " не найдена");
                                data0utputStream.writeUTF(": Запись с id " + data2[2] + " не найдена");
                            }
                        }

                    } else {
                        System.out.println(LocalDateTime.now()
                                + ": Что-то пошло не так или указана неверная команда, данные не изменены");
                        data0utputStream
                                .writeUTF("Что-то пошло не так или указана неверная команда, данные не изменены");
                    }
                } else {
                    System.out.println(LocalDateTime.now() + ": Указана неверная команда на этапе выбора действия\n");
                    data0utputStream.writeUTF("Указана неверная команда на этапе выбора действия");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
