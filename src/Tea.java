import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 5/30/2015.
 */
public class Tea extends  TemplatePattern {
    @Override
    void pour() {
        System.out.println("Pour Tea on Water");
    }

    @Override
    void addEditionalCommodities() {
        System.out.println("Add  Lemon into Tea");
    }



    @Override
    public boolean addExtraCondition() {
        String userInput=getUserInput();
        if(userInput.toLowerCase().startsWith("y"))
            return  true;
        else
            return  false;
    }
    public String getUserInput(){
        String answer=null;
        System.out.println("Would you like to add Lemon with your tea(y/n)");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            answer=in.readLine();
        }
        catch (IOException ieo){
            System.err.println(ieo);
        }
        if(answer==null)
            return  "no";
        return  answer;
    }
}
