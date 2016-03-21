package vasylchenko.module3.mod3_3;

import java.util.List;
import java.util.Map;

/**
 * Created by v.vasilchenko on 18.03.2016.
 */
public class OrderList {

    private List<GuitarInstrument> guitarToStay;
    private List<PianoInstrument> pianoToStay;
    private List<TrumpetInstrument> trumpetToStay;

//  Задание:
//  Найти и описать анти-паттерны в своём коде и предложить вариант их исправления.
//  Формат описания - комментарии в исходном коде с предложениями их решения.
//  Решение обсудить с ментором и только ПОСЛЕ этого изменять код.
//
//  В данном куске кода найдены следующие анти-паттерны:
//  копипаст - по сути для каждого элемента выполняется одна и та-же проверка,
//  Hard core  -  при расширении магазина потребуется опять вставлять копипаст для новых элементов
//  Предлагаю изменить данный участок кода т.о. чтобы не привязыватся к определенному названию,
//  а сделать его обобщенным.
//
//  Так-же можно в данном музыкальном магазине реализовать ответ на 8й модуль, а именно:
//  Выбрать иерархию классов из ДЗ по теме OOP in Java и создать несколько коллекций
//  объектов из данной иерархии. Хотя бы одна коллекция должна содержать в себе объекты разных классов.
//  1. Создать класс, который печатает созданные коллекции на экран в виде таблицы.
//  Колонки таблицы соответствуют полям объектов. Каждая строка в таблице соответствует объекту из коллекции.
//  2. Создать упорядоченный список объектов из ДЗ по теме OOP in Java не прибегая к  использованию Collections.sort().
//
//  Хотелось-бы услышать замечания на 6-й модуль и ответы на предложение по поводу моего видения решения задач
//  для модулей 7-8

    public void newOrderList(MusicShop shop, Map<String, Integer> order) {
        try {
            if (order.isEmpty()) throw new NullPointerException();
            if (order.containsKey("guitar")) {
                System.out.println("Entered request: Guitar :" + order.get("guitar") + "pcs");
                if (shop.getGuitar().size() < order.get("guitar")) throw new IllegalStateException();
                guitarToStay = shop.getGuitar().subList(order.get("guitar"), shop.getGuitar().size());
            }

            if (order.containsKey("piano")) {
                System.out.println("Entered request: Piano :" + order.get("piano") + "pcs");
                if (shop.getPiano().size() < order.get("piano")) throw new IllegalStateException();
                pianoToStay = shop.getPiano().subList(order.get("piano"), shop.getPiano().size());
            }
            if (order.containsKey("trumpet")) {
                System.out.println("Entered request: Trumpet :" + order.get("trumpet") + "pcs");
                if (shop.getTrumpet().size() < order.get("trumpet")) throw new IllegalStateException();
                trumpetToStay = shop.getTrumpet().subList(order.get("trumpet"), shop.getTrumpet().size());
            }
            if (guitarToStay != null) shop.setGuitar(guitarToStay);
            if (pianoToStay != null) shop.setPiano(pianoToStay);
            if (trumpetToStay != null) shop.setTrumpet(trumpetToStay);


        } catch (IllegalStateException e) {
            System.out.println("[Error]: Enough product in stock");
        } catch (NullPointerException e) {
            System.out.println("[Error]: Request order is empty");
        }
        System.out.println(shop);
    }

}
