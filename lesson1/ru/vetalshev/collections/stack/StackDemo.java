package ru.vetalshev.collections.stack;

import ru.vetalshev.collections.stack.exception.CustomRuntimeException;

import java.util.*;

// Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
// Проверить правильность расстановки скобок. Использовать стек.
public class StackDemo {

    public static void main(String[] args) {
        Test<String> tests = new Test<>();

        tests.add("(2 + 2) * 4 [some expression]"); // correct expression with text
        tests.add("(some text[]) * 4 [some expression]"); // correct expression with text
        tests.add("()[]"); // correct expression
        tests.add("(())[]"); // correct expression
        tests.add("(()[]"); // absence of closing round bracket
        tests.add("just test"); // expression without brackets
        tests.add("]["); // start from closing bracket
        tests.add("(){}[]"); // different type brackets
        tests.add("(]"); // start from one type bracket and closing with another

        tests.start();

//        TODO(vetalshev): перебор строки - какой из подходов эффективнее??? [RESOLVED]
//        for (char c : expression.toCharArray()) {
//            stack.add(c);
//        }
//        for (int i = 0; i < expression.length(); i++) {
//            char c = expression.charAt(i);
//            stack.add(c);
//        }

        for (String test: tests.getTestList()) {
            boolean isValid = validateBrackets(test);

            System.out.println("Expression \"" + test + "\" is " + (isValid ? "valid" : "invalid"));
        }

    }

    /**
     * just checks for equal count of opening & closing brackets in an expression
     *
     * @param expression - String consists of opening and closing brackets (square, curly, round)
     * @return {boolean} - return true if brackets in expression set the right way
     */
    private static boolean validateBrackets(String expression) {

        if (expression == null) {
            throw new IllegalArgumentException("Expression can't be null");
        }

        ArrayDeque<Character> bracketStack = new ArrayDeque<>();

        boolean isValid = true;

        for (char c : expression.toCharArray()) {

            if (BracketEnum.isClosingBracket(c)) {
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
                if (BracketEnum.isOpeningBracket(c)) {
                    bracketStack.addLast(c);
                } else {
                    // ignore usual symbols
                }
            }
        }

        return isValid && bracketStack.isEmpty();
    }

    private static boolean isTheSameBracketType(char lastCharacter, char currentCharacter) {
        BracketEnum lastCharType = getBracketType(lastCharacter);
        BracketEnum currentCharType = getBracketType(currentCharacter);

        return lastCharType == currentCharType;
    }


    private static BracketEnum getBracketType(char bracket) {
        for (BracketEnum v : BracketEnum.values()) {
            if (v.isTheSameType(bracket)) {
                return v;
            }
        }
        return null;
    }

}
