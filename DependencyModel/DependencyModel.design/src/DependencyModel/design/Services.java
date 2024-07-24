package DependencyModel.design;

import org.eclipse.emf.ecore.EObject;
import dependencyModel.Paragon;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    public int calcProbScale(Paragon self) {
        // TODO Auto-generated code
    	int probab;
    	probab = (int) (self.getProbability()*100);    	
       return probab;
     }
}
