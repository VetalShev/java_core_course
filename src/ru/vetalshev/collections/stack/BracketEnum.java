package ru.vetalshev.collections.stack;

public enum BracketEnum {
    ROUND_BRACKET('(', ')'), CURLY_BRACKET('{', '}'), SQUARE_BRACKET('[', ']');

    private char openingBracket;
    private char closingBracket;

    BracketEnum(char openingBracket, char closingBracket) {
        this.openingBracket = openingBracket;
        this.closingBracket = closingBracket;
    }

    public char getClosingBracket() {
        return closingBracket;
    }

    public char getOpeningBracket() {
        return openingBracket;
    }

    // TODO(vetalshev): возможно ли написать общий метод для всего перечисления, а не только для конкретного??? [RESOLVED]
    public boolean isTheSameType(char bracket) {
        return bracket == openingBracket || bracket == closingBracket;
    }

    public static boolean isClosingBracket(char bracket) {

        for (BracketEnum v : values()) {
            if (v.closingBracket == bracket) {
                return true;
            }
        }

        return false;
    }

    public static boolean isOpeningBracket(char bracket) {

        for (BracketEnum v : values()) {
            if (v.openingBracket == bracket) {
                return true;
            }
        }

        return false;
    }
}
