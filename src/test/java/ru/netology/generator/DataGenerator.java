package ru.netology.generator;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

    public class DataGenerator {
    static Faker faker = new Faker(new Locale("ru"));

    private DataGenerator() {
    }

    public static String cityForInput() {
        Random random = new Random();
        int rand = random.nextInt(12);
        String city[] = {"Екатеринбург", "Москва", "Калининград", "Кемерово", "Тверь", "Кострома", "Краснодар",
                "Красноярск", "Разян", "Курск", "Санкт-Петербург", "Чебоксары"};
        return city[rand];
    }

    public static String dataPhone() {
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static String dataName() {
        String name = faker.name().lastName();
        name = name + " " + faker.name().firstName();
        return name;
    }

    public static String dataInput(int days) {
        String inputDate = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        return inputDate;
    }

}
