package me.eagzzycsl.darkroom.model;


public class OnDeviceApp extends MyApp {

    public OnDeviceApp(MetaApp metaApp) {
        super(metaApp);
    }

    public NaughtyApp toNaughtyApp(){
        return new NaughtyApp(getMetaApp());
    }

    private boolean frozen;
    public void setFrozen(boolean frozen){
        this.frozen = frozen;
    }
    public boolean getFrozen(){
        return this.frozen;
    }
    public void toggleFrozen(){
        this.frozen = !frozen;
    }
}
