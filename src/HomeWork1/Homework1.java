package HomeWork1;

public class Homework1 {
    public static void main(String[] args) {
        // Метод isEmpty() - проверяет, является ли строка пустой
        String str1 = ""; // Пустая строка
        boolean isEmptyResult = str1.isEmpty();
        System.out.println("isEmpty() Result: " + isEmptyResult);

        // Метод isBlank() - проверяет, состоит ли строка только из пробельных символов
        String str2 = "   "; // Строка из пробелов
        boolean isBlankResult = str2.isBlank();
        System.out.println("isBlank() Result: " + isBlankResult);

        // Метод substring(int beginIndex) - возвращает подстроку, начиная с указанного индекса
        String str3 = "Hello, world!";
        String substringResult = str3.substring(7);
        System.out.println("substring(7) Result: " + substringResult);

        // Метод indexOf(String str) - возвращает индекс первого вхождения подстроки
        String str4 = "Java is fun!";
        int indexOfResult = str4.indexOf("is");
        System.out.println("indexOf(\"is\") Result: " + indexOfResult);

        // Метод lastIndexOf(String str) - возвращает индекс последнего вхождения подстроки
        String str5 = "Hello, world!";
        int lastIndexOfResult = str5.lastIndexOf("o");
        System.out.println("lastIndexOf(\"o\") Result: " + lastIndexOfResult);

        // Метод toLowerCase() - преобразует строку в нижний регистр
        String str6 = "HELLO";
        String toLowerCaseResult = str6.toLowerCase();
        System.out.println("toLowerCase() Result: " + toLowerCaseResult);

        // Метод toUpperCase() - преобразует строку в верхний регистр
        String str7 = "hello";
        String toUpperCaseResult = str7.toUpperCase();
        System.out.println("toUpperCase() Result: " + toUpperCaseResult);

        // Метод replace(CharSequence target, CharSequence replacement) - заменяет все вхождения подстроки
        String str8 = "Java is fun!";
        String replaceResult = str8.replace("fun", "awesome");
        System.out.println("replace(\"fun\", \"awesome\") Result: " + replaceResult);

        // Метод startsWith(String prefix) - проверяет, начинается ли строка с указанной подстроки
        String str9 = "Hello, world!";
        boolean startsWithResult = str9.startsWith("Hello");
        System.out.println("startsWith(\"Hello\") Result: " + startsWithResult);

        // Метод endsWith(String suffix) - проверяет, заканчивается ли строка указанным суффиксом
        String str10 = "Hello, world!";
        boolean endsWithResult = str10.endsWith("world!");
        System.out.println("endsWith(\"world!\") Result: " + endsWithResult);

        // Метод repeat(int count) - повторяет строку заданное количество раз
        String str11 = "Java";
        String repeatResult = str11.repeat(3);
        System.out.println("repeat(3) Result: " + repeatResult);

        // Метод contains(CharSequence s) - проверяет, содержит ли строка указанную подстроку
        String str12 = "Hello, world!";
        boolean containsResult = str12.contains("world");
        System.out.println("contains(\"world\") Result: " + containsResult);

        // Метод concat(String str) - объединяет текущую строку с указанной строкой
        String str13 = "Hello, ";
        String concatResult = str13.concat("world!");
        System.out.println("concat(\"world!\") Result: " + concatResult);

        // Метод trim() - удаляет начальные и конечные пробельные символы
        String str14 = "   Hello, world!   ";
        String trimResult = str14.trim();
        System.out.println("trim() Result: \"" + trimResult + "\"");

        // Метод equals(Object anObject) - сравнивает строки на равенство
        String str15 = "hello";
        boolean equalsResult = str15.equals("Hello");
        System.out.println("equals(\"Hello\") Result: " + equalsResult);
    }

}
