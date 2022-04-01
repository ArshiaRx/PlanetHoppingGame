
/**
 * Write a description of class ConditionHelper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConditionHelper
{
    private String Condition;
    public String getCondition(){
        return Condition;
    }
    public void resetCondition(){
        this.Condition = "";
    }
    public void setCondition(String newCondition){
        this.Condition = this.Condition + newCondition;
    }
}
