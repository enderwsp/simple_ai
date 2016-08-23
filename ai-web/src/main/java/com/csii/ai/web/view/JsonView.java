package com.csii.ai.web.view;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

public class JsonView extends MappingJacksonJsonView {
	
	private Log log = LogFactory.getLog(JsonView.class);
	
	protected Object filterModel(Map<String, Object> model) {
		this.log.debug(model);
		return model;
	}

}
