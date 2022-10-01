package servicePprocess;

import config.Config;

public interface Process {
	public default void process() throws Exception {
		processAbstract();
	}
	
	public abstract void processAbstract() throws Exception;
}
