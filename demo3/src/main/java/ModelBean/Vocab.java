package ModelBean;

public class Vocab {
    private String idVocab;
    private String word;
    private String sys;
    private String mean;
    private String example;

    public Vocab(String idVocab, String word, String sys, String mean, String example) {
        this.idVocab = idVocab;
        this.word = word;
        this.sys = sys;
        this.mean = mean;
        this.example = example;
    }

    public Vocab(){

    }

    public String getIdVocab() {
        return idVocab;
    }

    public void setIdVocab(String idVocab) {
        this.idVocab = idVocab;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
