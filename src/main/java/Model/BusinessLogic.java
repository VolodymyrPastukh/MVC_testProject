package Model;

public class BusinessLogic implements IModel{
    Schema schema;

    public BusinessLogic() {
        this.schema = new Schema();
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
