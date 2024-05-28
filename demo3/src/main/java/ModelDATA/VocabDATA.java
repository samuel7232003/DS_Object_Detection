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
        allVocab.add(new Vocab("1", "Backpack", "/ˈbækpæk/", "Ba lô", "The backpack was loaded with essentials for the hiking trip: water, snacks, a map, and a first aid kit, ready to accompany the adventurer on their journey through the wilderness."));
        allVocab.add(new Vocab("2", "Ball", "/bɔːl/", "Quả bóng", "The children played joyfully in the park, kicking a soccer ball back and forth, their laughter echoing in the afternoon air."));
        allVocab.add(new Vocab("3", "Book", "/bʊk/", "Sách", "She curled up on the sofa with a good book, immersing herself in its pages as the world outside faded away, lost in the magic of storytelling"));
        allVocab.add(new Vocab("4", "Bottle", "/ˈbɒtl/", "Cái chai", "She carefully filled the bottle with refreshing water from the mountain stream, its coolness a welcome relief during their hike through the hot summer day."));
        allVocab.add(new Vocab("5", "Box", "/bɒks/", "Cái hộp", "She packed her belongings into the cardboard box, ready to move into her new apartment and start a new chapter in her life."));
        allVocab.add(new Vocab("6", "Ceiling fan", "/ˈsiːlɪŋ fæn/", "Quạt trần", "On hot summer days, the ceiling fan circulated a gentle breeze throughout the room, providing relief from the sweltering heat and creating a comfortable environment for relaxation."));
        allVocab.add(new Vocab("7", "Chair", "/tʃeə(r)/", "Ghế dựa", "She sank into the plush chair, its soft cushions enveloping her tired body as she finally relaxed after a long day's work."));
        allVocab.add(new Vocab("8", "Clothing", "/ˈkləʊðɪŋ/", "Áo quần", "She sorted through the pile of clothing, selecting the perfect outfit for the evening's event, ensuring she would make a stylish and memorable impression."));
        allVocab.add(new Vocab("9", "Coffee cup", "/ˈkɒfi kʌp/", "Tách cà phê", "She cradled her coffee cup in her hands, enjoying the warmth spreading through her fingers as she took a comforting sip."));
        allVocab.add(new Vocab("10", "Computer Monitor", "/kəmˌpjuːtə ˈmɒnɪtə/", "Màn hình máy tính", "The computer monitor displayed a vibrant array of colors, illuminating the dimly lit room as she immersed herself in her favorite video game."));
        allVocab.add(new Vocab("11", "Desk", "/desk/", "Bàn làm việc", "He sat down at his desk, the clutter of papers and pens reminding him of the tasks that awaited his attention."));
        allVocab.add(new Vocab("12", "Door", "/dɔː(r)/", "Cửa ra vào", "She closed the door behind her, shutting out the noise of the busy street and stepping into the peaceful sanctuary of her home."));
        allVocab.add(new Vocab("13", "Glasses", "/ˈaɪɡlɑːs/", "Kính mắt", "He put on his glasses, the world instantly coming into focus as he adjusted to the clarity of vision."));
        allVocab.add(new Vocab("14", "Hat", "/hæt/", "Mũ", "He tipped his hat in greeting, a friendly smile spreading across his face as he approached his old friend."));
        allVocab.add(new Vocab("15", "Keyboard", "/ˈkiːbɔːd/", "Bàn phím", "He typed furiously on the computer keyboard, the clicking sound of the keys echoing in the quiet office as he worked late into the night."));
        allVocab.add(new Vocab("16", "Laptop", "/ˈlæptɒp/", "Máy tính xách tay", "I always carry my laptop with me when I travel for work."));
        allVocab.add(new Vocab("17", "Mobile phone", "/ˌməʊbaɪl ˈfəʊn/", "Điện thoại di động", "I rely on my mobile phone for staying connected with friends and family, managing my schedule, and accessing information on the go."));
        allVocab.add(new Vocab("18", "Pen", "/pen/", "Cây bút", "I always carry a pen in my bag for jotting down notes or signing documents on the go."));
        allVocab.add(new Vocab("19", "Person", "/ˈpɜːsn/", "Con người", "Every person has their own unique story to tell."));
        allVocab.add(new Vocab("20", "Plastic bag", "/ˈplæstɪk bæɡ/", "Túi nhựa", "I reused the plastic bag from the grocery store to carry my lunch to work, reducing waste.I reused the plastic bag from the grocery store to carry my lunch to work, reducing waste."));
        allVocab.add(new Vocab("21", "Table", "/ˈteɪbl/", "Cái bàn", "I set the table with plates, utensils, and glasses before the guests arrived for dinner."));
        allVocab.add(new Vocab("22", "Tree", "/triː/", "Cây", "The old oak tree stood tall in the middle of the forest, its branches reaching toward the sky."));
        allVocab.add(new Vocab("23", "Window", "/ˈwɪndəʊ/", "Cửa sổ", "I opened the window to let in some fresh air and sunlight into the room."));
        allVocab.add(new Vocab("24", "pen", "/pen/", "Cây bút", "I always carry a pen in my bag for jotting down notes or signing documents on the go."));
    }

    public ArrayList<Vocab> getAllVocab(){
        return allVocab;
    }
}
