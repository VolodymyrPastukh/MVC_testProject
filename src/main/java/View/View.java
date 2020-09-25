package View;

import Controller.Controller;
import Controller.IController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    private IController control;
    private Map<String, String> menu;
    private Map<String,Printable> metod;
    private static Scanner input = new Scanner(System.in);

    public View(){
        control = new Controller();
        menu = new LinkedHashMap<>();
        menu.put("1", " 1 - Прийти на собрание");
        menu.put("2", " 2 - Похлопать и поддержать");
        menu.put("3", " 3 - издать звуки негодования");
        menu.put("4", " 4 - приуныть немножечко");
        menu.put("5", " 5 - уходить с собрания");

        metod = new LinkedHashMap<>();
        metod.put("1", this::button1);
        metod.put("2", this::button2);
        metod.put("3", this::button3);
        metod.put("4", this::button4);
        metod.put("5", this::button5);
    }


    private void button1() {
        System.out.println(control.startSpeech());
    }

    private void button2(){
        System.out.println(control.continueSpeech());
    }

    private void button3(){
        System.out.println(control.convince());
    }

    private void button4(){
        System.out.println(control.callLoathing());
    }

    private void button5(){
        System.out.println(control.endSpeech());
    }

    private void outputMenu(){
        System.out.println("Во время обращения выбирайте действия");
        for(String arr : menu.values()){
            System.out.println(arr);
        }
    }

    public void showView(){
        String keyMenu = " ";
        outputMenu();
        while(keyMenu != "5"){
            keyMenu = input.nextLine().toUpperCase();
            try{
                metod.get(keyMenu).print();
            }catch (Exception e){
            }
        }
    }
}
