package com.org.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Serializable;

public class Persion {

	protected static final Log logger = LogFactory.getLog(Persion.class);



	public String sayWorld(String world){
		logger.info("Perison.sayWorld:"+world);
		return world;
	}
}
