package dsm.FRIPP;

public class SemanticUtil {
	//private static final String DEFAULT_ROOT_CMP_NAME = "Project";
	
	public static PlaybookProcess createInitialModel(String rootObjectName) {
		PlaybookProcess masterprocess = FRIPPFactory.eINSTANCE.createPlaybookProcess();
		masterprocess.setName(rootObjectName);
		//masterprocess.setId(UUID.randomUUID().toString());

		return masterprocess;
		}
}
