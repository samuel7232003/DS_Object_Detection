package ModelDATA;

import ModelBean.Vocab;

import java.util.ArrayList;

public class VocabDATA {
    private ArrayList<Vocab> allVocab = new ArrayList<>();
    private static VocabDATA vocabDATA;

    public static VocabDATA getInstance(){
        if(vocabDATA == null){
            vocabDATA = new VocabDATA();
        }
        return vocabDATA;
    }

    public VocabDATA(){
        allVocab.add(new Vocab("vcb01", "Table", "/taayboo/", "Cái bàn", "A beautiful table is over here!"));
        allVocab.add(new Vocab("vcb02", "Chair", "/taayboo/", "Cái ghế", "A beautiful chair is over here!"));
    }

    public ArrayList<Vocab> getAllVocab(){
        return allVocab;
    }
}
