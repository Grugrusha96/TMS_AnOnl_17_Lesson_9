package Documentation;

import Documentation.Register;
import Documentation.ContainsException;
import java.util.Date;

//1. Работа с прошлыми домашними заданиями. Создать свои классы
// исключений на каждую ситуацию:
// - Проверить содержит ли номер документа последовательность abc.
// - Проверить начинается ли номер документа с последовательности 555.
// - Проверить заканчивается ли номер документа на последовательность
// 1a2b.
// Если номер документа не удовлетворяет условию - то "бросить"
// исключение.
// В методе класса, в котором будут вызываться эти методы для
// демонстрации работы, перехватить исключение конструкцией try-catch и в
// блоке catch вывести сообщение для пользователя (сообщение на
// консоль).

public class Main {
    public static void main(String[] args) {

        Register register = new Register();

        try {
            register.printInfoDocument("555");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //С исключением ContainsABCException
        try {
            register.printInfoDocument("555abc456");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //С исключением StartWith555Exception
        try {
            register.printInfoDocument("65456465");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //С исключением EndWith1a2bException
        try {
            register.printInfoDocument("1234561a2b");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
