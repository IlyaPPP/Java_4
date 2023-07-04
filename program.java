// Задание
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
// очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
// Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.addLast(list.get(i));
        }
        System.out.println(list1);
    }

    public static void task2() {
        Queue<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1 - Поместить элемент в конец очереди");
            System.out.println("2 - Вернуть первый элемент из очереди и удалить его");
            System.out.println("3 - Вернуть первый элемент из очереди без его уадления");
            System.out.println("4 - Завершить программу");
            Integer scan = scanner.nextInt();
            switch (scan) {
                case 1:
                    System.out.println("Введите число");
                    Integer sc = scanner.nextInt();
                    list.offer(sc);
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println(list.poll());
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println(list.peek());
                    System.out.println(list);
                    break;
                case 4:
                    System.out.println(list);
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}