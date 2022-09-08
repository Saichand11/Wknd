package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables = Resource.class)
public class CustomModel {
	private final Logger logger = LoggerFactory.getLogger(CustomModel.class);

	@Inject
	@ValueMapValue
	@Optional
	@Named("age")
	private int age;

	@Inject
	@ValueMapValue
	@Optional
	@Named("about")
	private String about;
	
	@Inject
	@ValueMapValue
	@Optional
	@Named("name")
	private String name;

	private boolean isTouch;

	@PostConstruct
	public void init() {
		//Business logic or any other initialization will come here
		logger.debug("Enter the details");
		logger.debug("about"+about);
		logger.debug("age"+age);
		logger.debug("name"+name);
		
		
	}

	public int getAge() {
		return age;
	}

	
	public String getAbout() {
		return about;
	}

	public String getName() {
		return name;
	}


	public boolean isTouch() {
		return isTouch;
	}

}
