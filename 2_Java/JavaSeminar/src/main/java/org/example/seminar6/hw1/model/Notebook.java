package org.example.seminar6.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    String brand;   // Брэнд
    String model;   // Модель
    String color;   // Цвет
    String OS;      // Операционная система
    int RAM;        // ОЗУ
    int ROM;        // Объем ЖД
}
