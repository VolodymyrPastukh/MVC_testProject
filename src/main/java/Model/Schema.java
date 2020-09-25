package Model;

import java.util.Random;

public class Schema {

    private String schema[][] = new String[4][6];
    final Random rand = new Random();

    public Schema(){
        schema[0][0] = "Товарищи";
        schema[0][1] = "С другой стороны";
        schema[0][2] = "Равным образом";
        schema[0][3] = "Не следует, однако, забывать, что";
        schema[0][4] = "Таким образом";
        schema[0][5] = "Повседневная практика показывает, что";

        schema[1][0] = " реализация намеченых плановых заданий";
        schema[1][1] = " рамки и место обучения кадров";
        schema[1][2] = " постоянный количественый рост и сфера нашей активности";
        schema[1][3] = " сложившаяся структура организации";
        schema[1][4] = " новая модель организационной деятельности";
        schema[1][5] = " дальнейшее азвитие различных форм деятельности";

        schema[2][0] = " играет важную роль в формировании";
        schema[2][1] = " требуeт от нас анализа";
        schema[2][2] = " требуeт определения и уточнения";
        schema[2][3] = " способствует подготовке и реализации";
        schema[2][4] = " обеспечивает кругу специалистов участие в формировании";
        schema[2][5] = " позволяет выполнить важные задания по разработке";

        schema[3][0] = " существенных финансовых и административных условий";
        schema[3][1] = " дальнейших направлений развития";
        schema[3][2] = " системы масового участия";
        schema[3][3] = " позиции занимаемых участниками в отношении поставленых задач";
        schema[3][4] = " новых предложений";
        schema[3][5] = " направлений прогресивного развития";

    }

    /**
     * return String start sentence then can be connect to other
     * @return String start sentence
     */
    public String startSpeech(){
        String frase = "Здраствуйте товарищи. ";
        for (int i = 0; i < 4; i++){
            frase += schema[i][rand.nextInt(5)];
        }
        return frase;
    }

    public String continueSpeech(){
        String frase = schema[0][rand.nextInt(5)];
        for (int i = 1; i < 4; i++){
            frase += schema[i][rand.nextInt(5)];
        }
        return frase;
    }

    public String convince(){
        String frase = " Уверяю вас, товарищи! ";
        for (int i = 0; i < 4; i++){
            frase += schema[i][rand.nextInt(5)];
        }
        return frase;
    }

    public String callLoathing(){
        String frase = " Долой империализм! Долой капитализм! ";
        for (int i = 0; i < 4; i++){
            frase += schema[i][rand.nextInt(5)];
        }
        return frase;
    }

    public String endSpeech(){
        String frase = " Ну что ж, товарищи.  ";
        for (int i = 0; i < 4; i++){
            frase += schema[i][rand.nextInt(5)];
        }
        frase += "Славався трудовой народ!";
        return frase;
    }
}
