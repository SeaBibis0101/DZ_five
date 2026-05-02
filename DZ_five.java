import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
    private List<T> elements;

    public MySet() {
        elements = new ArrayList<>();
    }

    // Добавление элемента в множество
    public void add(T element) {
        if (!contains(element)) {
            elements.add(element);
        }
    }

    // Удаление элемента из множества
    public void remove(T element) {
        elements.remove(element);
    }

    // Проверка наличия элемента в множестве
    public boolean contains(T element) {
        return elements.contains(element);
    }

    // Получение размера множества
    public int size() {
        return elements.size();
    }

    // Получение всех элементов множества
    public List<T> getAllElements() {
        return new ArrayList<>(elements);
    }

    // Пример использования
    public static void main(String[] args) {
        MySet<String> set = new MySet<>();

        // Добавляем элементы
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Дубликат не добавится

        // Проверяем наличие элементов
        System.out.println("Contains 'Apple': " + set.contains("Apple")); // true
        System.out.println("Contains 'Grape': " + set.contains("Grape")); // false

        // Выводим все элементы
        System.out.println("All elements: " + set.getAllElements());

        // Удаляем элемент
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set.getAllElements());

        // Получаем размер множества
        System.out.println("Set size: " + set.size());
    }
}
