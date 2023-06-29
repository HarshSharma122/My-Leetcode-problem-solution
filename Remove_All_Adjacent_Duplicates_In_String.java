import java.util.Stack;
public class Remove_All_Adjacent_Duplicates_In_String {
    public static String removeDublicate(String s)
    {
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for (int i = 1; i<s.length(); i++)
        {
            if (!st.isEmpty() && st.peek().equals(s.charAt(i)))
            {
                st.pop();
                continue;
            }else
            {
                st.add(s.charAt(i));
            }
        }
        String ans = "";
        while (!st.isEmpty())
        {
            ans = st.pop() + ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(removeDublicate("abbaca"));
        /*In stack lifo concept works
        lifo means--> Last in first out
        System.out.println(d.pop());  pop means remove a element from last
        System.out.println(d.push('l'));  push means add a element from end
        System.out.println(d.peek());  show what is present in the top*/
    }
}