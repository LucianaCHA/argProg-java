/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clase15;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author luciana
 */
public class SetFormat {

    public static String removeAccents(String input) {
        // remove accents está => esta
        String nfdNormalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");

    }

    public static String toLowerAndStripped(String input) {
        return removeAccents(input).toLowerCase().strip();
    }

}
