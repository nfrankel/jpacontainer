package com.packtpub.learnvaadin.jpa.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class JpaContainerUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		setContent(new JpaScreen());
	}
}