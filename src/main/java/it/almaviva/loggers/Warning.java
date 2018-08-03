package it.almaviva.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Warning implements Job {

	private static final Logger logger = LogManager.getLogger(Warning.class);

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.warn("bla bla bla");
	}

}
