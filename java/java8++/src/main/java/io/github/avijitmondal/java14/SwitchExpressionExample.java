package io.github.avijitmondal.java14;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        var day = "M";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }

        };
        System.out.println(result);
    }
}
