package servicePprocess;

import config.Config;
import main.MyException;

public interface SaveableProcess extends Process{
	public default void process() throws Exception {
		processAbstract();
		Config.save();
	}
	
}
