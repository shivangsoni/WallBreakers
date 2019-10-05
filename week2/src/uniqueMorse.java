import java.util.HashSet;

public class uniqueMorse {
    public int uniqueMorseRepresentations(String[] words) {
        String[] result = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<words.length;i++)
        {
            String g="";
            for(int j=0;j<words[i].length();j++)
            {
                int index = (int)words[i].charAt(j) - 97;
                g = g+result[index];
            }
            set.add(g);
        }
        return set.size();
    }
}
