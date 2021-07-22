package io.github.avijitmondal.java12;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String month = "JANUARY";
        String quarter = switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "FIRST QUARTER";
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };

        System.out.println(quarter);
    }
}
