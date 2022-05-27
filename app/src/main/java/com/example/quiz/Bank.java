package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static List<QuestionList> winxQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();
        final QuestionList quis1 = new QuestionList("Как зовут фею, которая управляет магией огня?",
                "Сторми", "Блум", "Муза", "Стелла",
                "Блум", "");

        final QuestionList quis2 = new QuestionList("Какой магией обладает фея Флора?",
                "Магией света", "Магией огня", "Магией природы", "Магией музыки",
                "Магией природы", "");

        final QuestionList quis3 = new QuestionList("У какой из фей самой последней проявилась сила Энчантикс?",
                "Блум", "Лейла", "Текна", "Дарси",
                "Блум", "");

        final QuestionList quis4 = new QuestionList("Сколько всего было превращений было у фей?",
                "6", "22", "12", "15",
                "15", "");

        final QuestionList quis5 = new QuestionList("Какая фея имеет способность - разговаривать с животными?",
                "Ривен", "Рокси", "Текна", "Фарагонда",
                "Рокси", "");

        final QuestionList quis6 = new QuestionList("Кто из перечисленных является учителем Алфеи?",
                "Лина", "Скай", "Рейван", "Фарагонда",
                "Фарагонда", "");

        final QuestionList quis7 = new QuestionList("Кто является заместителем-директора в Алфеи??",
                "Гризельда", "Рокси", "Фарагонда", "Уизгис",
                "Гризельда", "");


        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        questionLists.add(quis4);
        questionLists.add(quis5);
        questionLists.add(quis6);
        questionLists.add(quis7);
        return questionLists;
    }

    private static List<QuestionList> disneyQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList quis1 = new QuestionList("Каким животным является Дональд Дак?",
                "Селезнем", "Мышой", "Утконосом", "Попугаем",
                "Селезнем", "");

        final QuestionList quis2 = new QuestionList("Что потеряла Золушка, сбегая с бала?",
                "Диадему", "Туфельку", "Сумочку", "Ничего",
                "Туфельку", "");

        final QuestionList quis3 = new QuestionList("Как зовут сына Короля-льва в мультфильме 'Король лев'?",
                "Димба", "Данбо", "Лимба", "Симба",
                "THIS", "");

        final QuestionList quis4 = new QuestionList("Кого первым встретила Алиса в стране Чудес?",
                "Чеширского кота", "Шляпника", "Белого Кролика", "Пиковую Даму",
                "Белого Кролика", "");

        final QuestionList quis5 = new QuestionList("Каким животным является Тимон из мультфильма 'Тимон и Пумба'?",
                "Суслик", "Кобан", "Енот", "Сурикат",
                "Сурикат", "");

        final QuestionList quis6 = new QuestionList("Чего лишилась Ариэль, в обен на то, чтобы выйти на сушу?",
                "Волос", "Рук", "Голоса", "Зрения",
                "Голоса", "");

        final QuestionList quis7 = new QuestionList("У кого из принцесс в качестве любимца был хамелеон?",
                "У Жасмин", "У Рапунцель", "У Ариэль", "У Авроры",
                "У Рапунцель", "");

        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        questionLists.add(quis4);
        questionLists.add(quis5);
        questionLists.add(quis6);
        questionLists.add(quis7);
        return questionLists;
    }

    private static List<QuestionList> sssrQuiz() {

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList quis1 = new QuestionList("Из какого мультфильма данная цитата: 'Ты... заходи, если что!..'?",
                "Жил-был пес", "Домовенок Кузя", "Ну, погоди!", "Дядюшка Ау",
                "Жил-был пес", "");

        final QuestionList quis2 = new QuestionList("Дядя Федор - из какого мультфильма этот персонаж?",
                "Дед Мороз и лето", "Деревня", "Винни-пух", "Простоквашино",
                "Простоквашино", "");

        final QuestionList quis3 = new QuestionList("Что любил Карлсон?",
                "Мед", "Варенье", "Конфеты", "Пироги",
                "Варенье", "");

        final QuestionList quis4 = new QuestionList("Где нашел крокодил Гена Чебурашку?",
                "В ящике мандаринов", "В ящике яблок", "В ящике апельсинов", "В капусте",
                "В ящике апельсинов", "");

        final QuestionList quis5 = new QuestionList("Кто говорил фразу 'Давайте жить дружно!'",
                "Попугай Кеша", "Заяц", "Капитошка", "Кот Леопольд",
                "Кот Леопольд", "");

        final QuestionList quis6 = new QuestionList("Кто озвучивал серого Волка из мультфильма 'Ну, погоди!'?",
                "Влдимир Зарубин", "Владимир Сошальский", "Клара Румянова", "Анатолий Папанов",
                "Анатолий Папанов", "");

        final QuestionList quis7 = new QuestionList("Какого роста была Дюймовочка?",
                "Дюйм", "Два дюйма", "Пять сантиметров", "Метр пятьдесят",
                "Дюйм", "");

        questionLists.add(quis1);
        questionLists.add(quis2);
        questionLists.add(quis3);
        questionLists.add(quis4);
        questionLists.add(quis5);
        questionLists.add(quis6);
        questionLists.add(quis7);
        return questionLists;
    }

    public static List<QuestionList> getQuestion(String nameTopic) {
        switch (nameTopic) {
            case "sssr":
                return sssrQuiz();
            case "winx":
                return winxQuiz();
            default:
                return disneyQuiz();
        }
    }


}
