import java.util.ArrayList;
public class Temp {

    public void reverse(int index, char [] str){
        if (str == null || index >= str.length) {
            return;
        }
        reverse(index + 1, str);
        System.out.print(str[index]);
    }

    public ArrayList<String> merge(String [] words, String [] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w: words) sentence.add(w);
        for(String w: more) sentence.add(w);
        return sentence;
    }
    public static void main(String args[]){
        Temp t = new Temp();
        String s= "Cat";
        char[] c = s.toCharArray();
        t.reverse(0, c);
    }
}
