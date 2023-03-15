package org.example.seminar6.hw1;

import com.sun.source.tree.Tree;
import org.example.seminar6.hw1.model.Notebook;

import java.util.*;

public class Ex1 {
//    Map filters = new TreeMap<>();

    static List<String> filters = new ArrayList<>();
    static Map<String, String> checkFilters = new TreeMap<>();

    public static void showMenu() {
        System.out.println("Добро пожаловать в магазин ноутбуков KryukoffNotebook");
        System.out.println("1. Посмотреть ассортимент");
        System.out.println("2. Посмотреть ассортимент (с учётом фильтров)");
        System.out.println("3. Добавить/изменить фильтр");
        System.out.println("4. Показать добавленные фильтры");
        System.out.println("5. Очистить фильтры");
    }

    public static void showNotebooks(List<Notebook> notebooks) {
        System.out.println("Ассортимент магазина:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.toString());
        }
    }

    public static void showNotebooksWithFilters(List<Notebook> notebooks) {
        System.out.println("Ассортимент магазина с учётом фильтров:");
        for (Notebook notebook : notebooks) {
            if (ifNeedShow(notebook)) {
                System.out.println(notebook.toString());
            }
        }
    }

    public static boolean ifNeedShow(Notebook notebook) {
        for (String key : checkFilters.keySet()) {
            if (key.equals(filters.get(0)) && !notebook.getBrand().contains(checkFilters.get(key))) {
                return false;
            }
            if (key.equals(filters.get(1)) && !notebook.getModel().contains(checkFilters.get(key))) {
                return false;
            }
            if (key.equals(filters.get(2)) && !notebook.getColor().contains(checkFilters.get(key))) {
                return false;
            }
            if (key.equals(filters.get(3)) && !notebook.getOS().contains(checkFilters.get(key))) {
                return false;
            }
            if (key.equals(filters.get(4)) && notebook.getROM() <= Integer.parseInt(checkFilters.get(key))) {
                return false;
            }
            if (key.equals(filters.get(5)) && notebook.getRAM() <= Integer.parseInt(checkFilters.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void showFilters() {
        System.out.println("Доступные фильтры:");
        for (int i = 0; i < filters.size(); i++) {
            System.out.println(i + ". " + filters.get(i));
        }
    }

    public static void showCheckFilters() {
        System.out.println("Выбранные фильтры:");
        for (String key : checkFilters.keySet()) {
            System.out.println(key + " - " + checkFilters.get(key));
        }
    }

    public static void addFilter() {
        showFilters();
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0:
                System.out.println("Введите наименование брэнда");
                checkFilters.put(filters.get(0), scanner.next());
                break;
            case 1:
                System.out.println("Введите наименование модели");
                checkFilters.put(filters.get(1), scanner.next());
                break;
            case 2:
                System.out.println("Введите наименование цвета");
                checkFilters.put(filters.get(2), scanner.next());
                break;
            case 3:
                System.out.println("Введите наименование операционной системы");
                checkFilters.put(filters.get(3), scanner.next());
                break;
            case 4: {
                System.out.println("Введите минимальный объём жёсткого диска (Гб)");
                int value;
                try {
                    value = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Ошибка добавления фильтра!!!");
                    return;
                }
                checkFilters.put(filters.get(4), String.valueOf(value));
            }
            break;
            case 5: {
                System.out.println("Введите минимальный объём ОЗУ (Гб)");
                int value;
                try {
                    value = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Ошибка добавления фильтра!!!");
                    return;
                }
                checkFilters.put(filters.get(5), String.valueOf(value));
            }
            break;
            default:
                System.out.println("Неизвестный фильтр!!!");
                return;
        }
        System.out.println("Фильтр успешно добавлен");
    }

    public static void main(String[] args) {
        filters.add("Брэнд");
        filters.add("Модель");
        filters.add("Цвет");
        filters.add("Операционная система");
        filters.add("Объем ЖД");
        filters.add("ОЗУ");

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("ASUS", "", "Чёрный", "Windows", 1, 1));
        notebooks.add(new Notebook("ASUS", "", "Серый", "Linux", 1, 1));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    showNotebooks(notebooks);
                    break;
                case 2:
                    showNotebooksWithFilters(notebooks);
                    break;
                case 3:
                    addFilter();
                    break;
                case 4:
                    showCheckFilters();
                    break;
                case 5:
                    checkFilters.clear();
                    break;
                default:
                    System.out.println("Выбранное действие недоступно.");
            }
            System.out.println("\n");
        }
    }
}
