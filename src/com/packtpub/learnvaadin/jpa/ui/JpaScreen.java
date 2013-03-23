package com.packtpub.learnvaadin.jpa.ui;

import java.util.Locale;

import com.packtpub.learnvaadin.jpa.model.Person;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class JpaScreen extends VerticalLayout {

	public JpaScreen() {

		setMargin(true);

		JPAContainer<Person> container = JPAContainerFactory.make(Person.class, "vaadindemo");

		container.addNestedContainerProperty("job.label");

		Table table = new Table("", container);

		table.setLocale(Locale.US);
		table.setPageLength(4);

		table.setVisibleColumns(new Object[] { "lastName", "firstName", "birthdate", "job.label" });

		addComponent(table);
	}
}
