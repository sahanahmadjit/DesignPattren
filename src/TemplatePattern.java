/**
 * Created by Administrator on 5/30/2015.
 */
public abstract class  TemplatePattern {

public final void  PrepareCaffein(){
    boilWater();
    pour();
    brew();
    if(addExtraCondition())
    addEditionalCommodities();

}

    abstract  void pour();
    abstract  void addEditionalCommodities();


    void boilWater(){
        System.out.println("Boiling Water");
    }
    void  brew(){
        System.out.println("Brew Caffein into Water");
    }

    public boolean addExtraCondition(){
        return true;
    }

}
