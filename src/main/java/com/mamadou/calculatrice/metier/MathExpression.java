package com.mamadou.calculatrice.metier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathExpression {
//    private final Pattern pattern1 = Pattern.compile("(\\-|\\+)?\\d*");
//    private final Pattern pattern2 = Pattern.compile("(\\-|\\+)?\\d+,?");
//    private final Pattern pattern3 = Pattern.compile("(\\-|\\+)?\\d+,\\d*");
//    private final Pattern pattern4 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)?");
//    private final Pattern pattern5 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)\\d*");
//    private final Pattern pattern6 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)\\d+,?");
//    private final Pattern pattern7 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)\\d+,\\d*");
//    private final Pattern pattern8 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)\\d+,\\d+");
//    private final Pattern pattern9 = Pattern.compile("(\\-|\\+)?\\d+,\\d+(\\+|\\-|x|/)\\d+,\\d+(\\+|\\-|x|/)?");
    private final Pattern pattern = Pattern.compile("(\\+|\\-)?(\\d+(,\\d+)?)((\\+|\\-|x|/)(\\d+(,\\d+)?))*");
    public boolean syntaxeChecker(String expression) {
        return pattern.matcher(expression).matches();
    }
}