package io.github.avijitmondal.java14;

public record Author(int id, String name, String topic) {
    static int followers;

    public Author {
        if (id < 0) {
            throw new IllegalArgumentException("id must be greater than 0.");
        }
    }

    public static String followerCount() {
        return "Followers are " + followers;
    }

    public String description() {
        return "Author " + name + " writes on " + topic;
    }
}