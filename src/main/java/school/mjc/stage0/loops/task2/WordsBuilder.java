package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int x = 0;
        String phrase = "";
        while(x<chars.length){
            phrase = phrase + chars[x];
            x++;
        }
        System.out.println(phrase);
    }
}
