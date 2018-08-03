package it.almaviva.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Error implements Job {

	private static final Logger logger = LogManager.getLogger(Error.class);

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		logger.error("bla bla bla");
	}

}
