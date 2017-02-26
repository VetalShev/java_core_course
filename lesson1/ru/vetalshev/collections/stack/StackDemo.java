package ru.vetalshev.collections.stack;

import ru.vetalshev.collections.stack.exception.CustomRuntimeException;

import java.util.ArrayDeque;
import java.util.List;

// Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
// Проверить правильность расстановки скобок. Использовать стек.
public class StackDemo {

    public static void main(String[] args) {
        String expression = "(2 + 2) * 4 [some expression]";


//        TODO(vetalshev): перебор строки - какой из подходов эффективнее???
//        for (char c : expression.toCharArray()) {
//            stack.add(c);
//        }
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//            stack.add(c);
//        }

        boolean isValid = validateBrackets(expression);

        System.out.println("Expression \"" + expression + "\" is " + (isValid ? "valid" : "invalid"));
    }

    /**
     * just checks for equal count of opening & closing brackets in an expression
     *
     * @param expression - String consists of opening and closing brackets (square, curly, round)
     * @return {boolean} - return true if brackets in expression set the right way
     */
    private static boolean validateBrackets(String expression) {
        ArrayDeque<Character> bracketStack = new ArrayDeque<>();
        boolean isValid = true;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (isClosingBracket(c)) {
                if (bracketStack.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    if (isTheSameBracketType(bracketStack.getLast(), c)) {
                        bracketStack.removeLast();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            } else {
                if (isOpeningBracket(c)) {
                    bracketStack.addLast(c);
                } else {
                    // ignore usual symbols
                }
            }
        }

        return isValid && bracketStack.isEmpty();
    }

    private static boolean isTheSameBracketType(char lastCharacter, char currentCharacter) {
        String lastCharType = getBracketType(lastCharacter);
        String currentCharType = getBracketType(currentCharacter);

        return lastCharType.equals(currentCharType);
    }

    private static String getBracketType(char bracket) {
        if (bracket == BracketEnum.ROUND_BRACKET.getOpeningBracket()
                || bracket == BracketEnum.ROUND_BRACKET.getClosingBracket()) {
            return "ROUND_BRACKET";
        } else if (bracket == BracketEnum.CURLY_BRACKET.getOpeningBracket()
                || bracket == BracketEnum.CURLY_BRACKET.getClosingBracket()) {
            return "CURLY_BRACKET";
        } else if (bracket == BracketEnum.SQUARE_BRACKET.getOpeningBracket()
                || bracket == BracketEnum.SQUARE_BRACKET.getClosingBracket()) {
            return "SQUARE_BRACKET";
        }

        return null;
    }

//    private static String getBracketType(char bracket) {
//        if (BracketEnum.ROUND_BRACKET.getBrackets().contains(bracket)) {
//            return "ROUND_BRACKET";
//        } else if (BracketEnum.CURLY_BRACKET.getBrackets().contains(bracket)) {
//            return "CURLY_BRACKET";
//        } else if (BracketEnum.SQUARE_BRACKET.getBrackets().contains(bracket)) {
//            return "SQUARE_BRACKET";
//        }
//
//        return null;
//    }

    private static boolean isClosingBracket(char bracket) {
        return bracket == BracketEnum.ROUND_BRACKET.getClosingBracket() ||
                bracket == BracketEnum.CURLY_BRACKET.getClosingBracket() ||
                bracket == BracketEnum.SQUARE_BRACKET.getClosingBracket();
    }

    private static boolean isOpeningBracket(char bracket) {
        return bracket == BracketEnum.ROUND_BRACKET.getOpeningBracket() ||
                bracket == BracketEnum.CURLY_BRACKET.getOpeningBracket() ||
                bracket == BracketEnum.SQUARE_BRACKET.getOpeningBracket();
    }

}
