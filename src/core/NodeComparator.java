package core;
import java.util.Comparator;

public class NodeComparator implements Comparator<Tree>
{
    @Override
    public int compare(Tree x, Tree y)
    {
    	if(x.bayesFactorScore < y.bayesFactorScore) return 1;// reversed because we want to sort in descending order
    	if(x.bayesFactorScore > y.bayesFactorScore) return -1;
        return 0;
    }
}