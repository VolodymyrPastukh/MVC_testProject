package Controller;

import Model.BusinessLogic;
import Model.IModel;

public class Controller implements IController{

    private IModel schema;

    public Controller(){
        schema = new BusinessLogic();
    }
    @Override
    public String startSpeech() {
        return schema.startSpeech();
    }

    @Override
    public String continueSpeech() {
        return schema.continueSpeech();
    }

    @Override
    public String convince() {
        return schema.convince();
    }

    @Override
    public String callLoathing() {
        return schema.callLoathing();
    }

    @Override
    public String endSpeech() {
        return schema.endSpeech();
    }
}
