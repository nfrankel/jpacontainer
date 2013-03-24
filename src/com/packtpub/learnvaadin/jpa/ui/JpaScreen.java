package com.packtpub.learnvaadin.jpa.ui;

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

		table.setVisibleColumns(new Object[] { "lastName", "firstName", "birthdate", "job.label" });
		table.setColumnHeader("firstName", "Given name");
		table.setColumnHeader("lastName", "Family name");
		table.setColumnHeader("job.label", "Job");

		addComponent(table);
	}
}
