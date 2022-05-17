import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        String abbr = sanitizedString(abbreviation);
        return this.abbreviations.containsKey(abbr);
    }

    public String findExplanationFor(String abbreviation) {
        String abbr = sanitizedString(abbreviation);
        if (this.abbreviations.containsKey(abbr)) {
            return this.abbreviations.get(abbr);
        } else {
            return null;
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
