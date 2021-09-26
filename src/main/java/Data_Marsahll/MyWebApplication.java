package Data_Marsahll;

import org.orienteer.core.OrienteerWebApplication;
import org.orienteer.core.module.PerspectivesModule;

public class MyWebApplication extends OrienteerWebApplication
{
	@Override
	public void init()
	{
		super.init();
		mountPackage("Data_Marsahll.web");
		registerModule(DataModel.class);
	}
	
}
