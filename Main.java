package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String language;
        String parameters;

        Scanner scanner = new Scanner(System.in);
//      language = scanner.nextLine();
//      parameters = scanner.nextLine();
        language = "ge";
        parameters = "p-2-s-5-7-w-7-9";
        String[] parametersArray = parameters.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: parametersArray) {
//              System.out.println(parameter);
            try {
                param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
//              e.printStackTrace();
            }
        }

        System.out.println(param);

        generator generator = new generator(language,param);
        generator.generateAlphabet()
    }
}
