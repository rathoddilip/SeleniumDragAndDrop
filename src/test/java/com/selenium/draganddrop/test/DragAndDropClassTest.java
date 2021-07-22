package com.selenium.draganddrop.test;

import com.seleniu.draganddrop.base.BaseClass;
import com.seleniu.draganddrop.utility.DragAndDropClass;
import org.testng.annotations.Test;

public class DragAndDropClassTest extends BaseClass {

    @Test
    public void drag_and_drop_test() throws InterruptedException {

        DragAndDropClass dragAndDropClass = new DragAndDropClass(driver);
        dragAndDropClass.drag_and_drop_method();
    }

}
