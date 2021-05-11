package com.company.untitled.web.screens.testentity;

import com.company.untitled.entity.TestEntity;
import com.haulmont.cuba.gui.screen.*;

@UiController("untitled_TestEntity.edit")
@UiDescriptor("test-entity-edit.xml")
@EditedEntityContainer("testEntityDc")
@LoadDataBeforeShow
public class TestEntityEdit extends StandardEditor<TestEntity> {
}