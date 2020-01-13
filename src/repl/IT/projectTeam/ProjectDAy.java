package repl.IT.projectTeam;

public class ProjectDAy {
    public String [] findAnagram(String word, String [] array) {
        // silent => word;  array { listen, book, linest, adf,}
        // array => {listen, linest}
        // TODO
        String anagram = "";
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (array[i].length() == word.length()) {
                for (int j = 0; j < word.length(); j++) {
                    if (array[i].contains(word.toLowerCase().charAt(j) + " ")) {
                        count++;
                    }
                }
                if (count == word.length()) {
                    anagram += array[i] + " ";
                }
            }
        }
            anagram = anagram.trim();
            if (anagram.isEmpty()) {
                String[] newAnagram={};

                return newAnagram;
            } else {
                String[] finalAnagram = anagram.split(" ");
                return finalAnagram;
        }

    }
    public static void main(String[] args) {

        String[] array = {"i", "hgsdfg", "and", "gdfyteduy", "hdgfkudygfkuy"};

        String word = "nad";
//        String a="";
//        String [] nu = word.split("");
//        Arrays.sort(nu);
//        for (String z : nu) {
//            a += z;
//        }
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            String b="";
//            String [] nunu = array[i].split("");
//            Arrays.sort(nunu);
//            for (String z : nunu) {
//
//                b += z;
//
//                if (a.equals(b)) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//
//


//        String anagram = "";
//
//        word = word.toLowerCase();
//        for (int i = 0; i < array.length; i++) {
//
//            int count = 0;
//            if (array[i].length() == word.length()) {
//                for (int j = 0; j < word.length(); j++) {
//                    String str = word.charAt(j) + " ";
//                    if (array[i].contains(str)) {
//                        count++;
//                    }
//                }
//                if (count == word.length()) {
//                    anagram += array[i] + " ";
//                }
//            }
//
//            anagram = anagram.trim();
//            if (anagram.isEmpty()) {
//                String[] newAnagram={};
//
//               return newAnagram;
//            } else {
//
//                String[] newAnagram = anagram.split(" ");
//                return newAnagram;




        }
    }

