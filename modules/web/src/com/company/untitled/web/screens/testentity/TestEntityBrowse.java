package com.company.untitled.web.screens.testentity;

import com.company.untitled.entity.TestEntity;
import com.haulmont.cuba.gui.screen.*;

@UiController("untitled_TestEntity.browse")
@UiDescriptor("test-entity-browse.xml")
@LookupComponent("testEntitiesTable")
@LoadDataBeforeShow
public class TestEntityBrowse extends StandardLookup<TestEntity> {
}