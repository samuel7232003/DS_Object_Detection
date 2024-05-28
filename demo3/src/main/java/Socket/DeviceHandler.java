package Socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class DeviceHandler  extends Thread{
    private String nameDevice;
    private OutputStream osHandler;
    private InputStream isHandler;
    private Socket deviceSocket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private static boolean checkReload = true;
    //    private static String continuee = "continue";
    Scanner sc;

    private String ImageLink = "src/main/webapp/Image/19.jpg";
    public BufferedWriter getBufferedWriter() {
        return bufferedWriter;
    }

    public String getImageLink() {
        return ImageLink;
    }

    public void setImageLink(String imageLink) {
        ImageLink = imageLink;
    }

    public DeviceHandler(Socket deviceSocket){
        try {
            sc = new Scanner(System.in);
            this.deviceSocket = deviceSocket;
            this.osHandler = this.deviceSocket.getOutputStream();
            this.isHandler = this.deviceSocket.getInputStream();
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.osHandler, StandardCharsets.UTF_8)); // viết riêng
            this.bufferedReader = new BufferedReader(new InputStreamReader(this.isHandler, StandardCharsets.UTF_8)); // viết riêng
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            String txt = "";
            txt = this.bufferedReader.readLine();
            System.out.println(txt);
            if(txt.contains("CAM")){
                String linkCam = this.bufferedReader.readLine();
                SocketController.setLinkCam(linkCam);
                this.nameDevice = "CAM";
                System.out.println("Đã kết nối đến camera có id: " + SocketController.getLinkCam());
            }
            else if(txt.equals("MODEL")){
                sendLinkImage();
                this.nameDevice = "MODEL";
                System.out.println("Đã kết nối đến model");
            }
            else{
                System.out.println("Đã kết nối đến 1 device chưa biết");
                this.nameDevice = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        TransferVocabForAudio();
        try{
            while (true){
                String header = this.bufferedReader.readLine();
                System.out.println("Header: " + header);
                if (header == null) throw new IOException();
                switch (header){
                    case "RESULT":{
                        if(checkReload == true){
                            String result = this.bufferedReader.readLine();
                            System.out.println("Kết quả được gửi về: " + result);
                            String[] kqList = result.split(";");
                                
                            }
                        }
                    }
                }
        } catch (IOException e) {

        }
    }
    public void sendLinkImage(){
        try {

            this.bufferedWriter.write("DETECT");
            this.bufferedWriter.flush();

            this.bufferedWriter.write(this.ImageLink);
            this.bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void detectByWebcam(){
        try {
            this.bufferedWriter.write("DETECT");
            this.bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void continueDetect(){
        checkReload = true;
    }

    public ArrayList<Integer> removeDuplicate(ArrayList<Integer> idWord){
        ArrayList<Integer> newArrayIdWord = new ArrayList<>();
        for(int n : idWord){
            if(!newArrayIdWord.contains(n)){
                newArrayIdWord.add(n);
            }
        }
        return newArrayIdWord;
    }
}
