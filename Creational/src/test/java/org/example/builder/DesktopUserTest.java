package org.example.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesktopUserTest {

    @Test
    public void getBuilder() {
        DesktopUser desktopUser = DesktopUser.getBuilder()
                .name("mahendra")
                .build();
        System.out.println(desktopUser.getName());
        assert desktopUser.getName().equals("mahendra");
    }
}