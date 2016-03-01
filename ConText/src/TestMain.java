import java.io.*;
import java.util.ArrayList;

/**
 * Created by pbhatia on 2/29/16.
 */
import context.implementation.ConText;
public class TestMain {
    public static void main(String args[]) throws IOException {
        System.out.println("This is the main class!");
        ConText negation = new ConText();
        String []  UMLSConcepts = {"headache"};
        String [] sentences = {"The patient denies headache", "The patient has headache"};
        ArrayList res = null;
        String context_output = "";
        for(int i=0;i<UMLSConcepts.length;i++)
            for(int j=0;j<sentences.length;j++)
            {
                try {
                res = negation.applyContext(UMLSConcepts[i], sentences[j]);
            } catch (Exception e1) {
                e1.printStackTrace();
            }

                if(res!=null)
                {
                    context_output += "ConText for '"+res.get(0)+"':\n"+
                            "Sentence: '"+res.get(1)+"'\n"+
                            "Negation: '"+res.get(2)+"'\n"+
                            "Temporality: '"+res.get(3)+"'\n"+
                            "Experiencer: '"+res.get(4)+"'\n\n";
                }
            }
        System.out.println(context_output);
    }
}
