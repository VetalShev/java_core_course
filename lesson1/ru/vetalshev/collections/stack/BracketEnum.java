package ru.vetalshev.collections.stack;

import java.util.List;

public enum BracketEnum {
    ROUND_BRACKET('(', ')'), CURLY_BRACKET('{', '}'), SQUARE_BRACKET('[', ']');

    private char openingBracket;
    private char closingBracket;
//    private char[] brackets;
//    private List<Character> brackets;

    BracketEnum(char openingBracket, char closingBracket) {
        this.openingBracket = openingBracket;
        this.closingBracket = closingBracket;

//        TODO(vetalshev): java.lang.ExceptionInInitializerError
//        brackets.add(openingBracket);
//        brackets.add(closingBracket);

//        brackets[0] = openingBracket;
//        brackets[1] = closingBracket;

//        TODO(vetashev): почему невозможна такая запись в конструкторе???
//        brackets = {openingBracket, closingBracket};
    }

//    public char[] getBrackets() {
//        return brackets;
//    }

//    public List<Character> getBrackets() {
//        return brackets;
//    }

    public char getClosingBracket() {
        return closingBracket;
    }

    public char getOpeningBracket() {
        return openingBracket;
    }

    // TODO(vetalshev): возможно ли написать общий метод для всего перечисления, а не только для конкретного???
//    public boolean isTheSameType(char bracket) {
//        return bracket == openingBracket || bracket == closingBracket;
//    }

//    public boolean isClosingBracket(char bracket) {
//        return bracket == ROUND_BRACKET.closingBracket ||
//                bracket == CURLY_BRACKET.closingBracket ||
//                bracket == SQUARE_BRACKET.closingBracket;
//    }
//
//    public boolean isOpeningBracket(char bracket) {
//        return bracket == ROUND_BRACKET.openingBracket ||
//                bracket == CURLY_BRACKET.openingBracket ||
//                bracket == SQUARE_BRACKET.openingBracket;
//    }

}
