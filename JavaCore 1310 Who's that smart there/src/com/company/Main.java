package com.company;

/*

1310 Who's that smart there?
1. Add the Secretary and Boss interfaces to the CleverMan and SmartGirl classes. One for each. Think about who.
2. Inherit the Secretary and Boss interfaces from the Person and Workable interfaces,
so that all methods of the CleverMan and SmartGirl classes are declared in some interface.

Requirements:
1. The CleverMan class must implement an interface suitable for it (Secretary or Boss).
2. The SmartGirl class must implement an interface suitable for it (Secretary or Boss).
3. The Secretary is a person.
4. The boss (Boss) is a person (Person), and also likes to work a lot (Workable).


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface Workable {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Workable, Person {
    }

    class CleverMan implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }
        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}

