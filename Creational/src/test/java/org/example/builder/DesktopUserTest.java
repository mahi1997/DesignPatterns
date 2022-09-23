package org.example.builder;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class DesktopUserTest {

    @Test
    public void getBuilder() {
        DesktopUser desktopUser = DesktopUser.getBuilder()
                .name("mahendra")
                .build();
        System.out.println(desktopUser.getName());
        assert desktopUser.getName().equals("mahendra");

        Set<Integer> set = new TreeSet<>((a,b)->b.compareTo(a));
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(10);
        set.remove(90);
        System.out.println(set.iterator().next());



    }
}