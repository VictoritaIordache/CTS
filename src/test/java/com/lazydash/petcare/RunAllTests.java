package com.lazydash.petcare;

import com.lazydash.petcare.monitor.WebCameraTest;
import com.lazydash.petcare.pet.CatBuilderTest;
import com.lazydash.petcare.pet.CatTest;
import com.lazydash.petcare.room.CatRoomSingletonTest;
import com.lazydash.petcare.room.CatRoomTest;
import com.lazydash.petcare.run.MainTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        WebCameraTest.class,
        CatBuilderTest.class,
        CatTest.class,
        CatRoomSingletonTest.class,
        CatRoomTest.class,
        MainTest.class
})
public class RunAllTests {
}
