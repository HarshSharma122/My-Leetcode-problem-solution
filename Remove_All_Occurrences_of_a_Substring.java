public class Remove_All_Occurrences_of_a_Substring {
    public static String removeOccurrences(String s, String part){
        while (s.contains(part))
        {
            s = s.replaceFirst(part, "");
        }
        return s;

    }
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
}
