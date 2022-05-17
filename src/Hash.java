import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        // nicknames
        System.out.println("---Nicknames---");
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");
        System.out.println(nicknames.get("Matthew"));

        System.out.println();

        // abbreviations - class created in its own file
        // this is the example test code from the assignment to show it works
        System.out.println("---Abbreviations---");
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();

        // print me my hash map
        // Program class in its own file, example test code here again
        System.out.println("---Print me my hash map---");
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");

        System.out.println();

        // print me another hash map
        // Book and Program classes have files, example test code here
        System.out.println("---Print me another hash map---");
        HashMap<String, Book> hashmap2 = new HashMap<>();
        hashmap2.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap2.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        Program.printValues(hashmap2);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap2, "prejud");

        System.out.println();

        // I owe you
        // you get the pattern by now
        System.out.println("---I owe you---");
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        System.out.println();

        // Dictionary of many translations
        System.out.println("---Dictionary of many translations---");
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));

        System.out.println();

        // storage facility part 1 - adding items and examining contents
        System.out.println("---Storage facility part 1---");
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));

        System.out.println();

        // storage facility part 2 - listing the units and removing from unit
        System.out.println("---Storage facility part 2---");
        StorageFacility facility2 = new StorageFacility();
        facility2.add("a14", "ice skates");
        facility2.add("a14", "ice hockey stick");
        facility2.add("a14", "ice skates");

        facility2.add("f156", "rollerblades");
        facility2.add("f156", "rollerblades");

        facility2.add("g63", "six");
        facility2.add("g63", "pi");

        facility2.remove("f156", "rollerblades");

        System.out.println(facility2.contents("f156"));

        facility2.remove("f156", "rollerblades");

        System.out.println(facility2.storageUnits());
    }
}
