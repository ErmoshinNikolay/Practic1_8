/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1_8;
import java.util.Scanner;
/**
 *
 * @author Erm
 */
public class Practic1_8 {

    public static void main(String[] args) {
        System.out.println("Практика 1.8 Ермошин Николай, РИБО-03-22, вариант 2");
        FuncshionTelephone telephoneList = new FuncshionTelephone();
        Telephone telephone1 = new Telephone("Huawei", "12345", "white", true);
        Telephone telephone2 = new Telephone("iPhone", "A2345", "black", true);
        Telephone telephone3 = new Telephone("Samsung","b23456","white",false);
        telephoneList.addTelephone(telephone1);
        telephoneList.addTelephone(telephone2);
        telephoneList.addTelephone(telephone3);
        telephoneList.PrintTelephones();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - добавить телефон");
            System.out.println("2 - удалить телефон по серийному номеру");
            System.out.println("3 - удалить все телефоны из списка");
            System.out.println("4 - завершить программу");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите модель телефона:");
                    String model = scanner.nextLine();
                    System.out.println("Введите серийный номер:");
                    String serialNumber = scanner.nextLine();
                    System.out.println("Введите цвет:");
                    String color = scanner.nextLine();
                    System.out.println("Это мобильный телефон? (true/false):");
                    boolean isMobile = scanner.nextBoolean();
                    scanner.nextLine();
                    Telephone newTelephone = new Telephone(model, serialNumber, color, isMobile);
                    telephoneList.addTelephone(newTelephone);
                    break;
                case 2:
                    System.out.println("Введите серийный номер телефона для удаления:");
                    String serialNumToRemove = scanner.nextLine();
                    telephoneList.removeTelephone(serialNumToRemove);
                    break;
                case 3:
                    telephoneList.removeAllTelephones();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Неправильный номер");
                    break;
            }
            telephoneList.PrintTelephones();
        }    
    }
}